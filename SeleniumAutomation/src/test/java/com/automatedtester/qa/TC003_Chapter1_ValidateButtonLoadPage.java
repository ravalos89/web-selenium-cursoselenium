package com.automatedtester.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC003_Chapter1_ValidateButtonLoadPage {
  
  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void TC003() throws InterruptedException {
	// STEP 1
	  Reporter.log("Launch automatedtester app");
	  System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  Thread.sleep(2000);
	  
	  //STEP 2
	  Reporter.log("Click Link Chapter 1");
	  driver.findElement(By.xpath("//a[contains(text(), 'Chapter1')]")).click();
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='radiobutton']")));
	  Thread.sleep(2000);
	  
	  //STEP3
	  Reporter.log("Click button \"load text to the page\"");
	  driver.findElement(By.xpath("//input[@id='secondajaxbutton']")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  //STEP4
	  Reporter.log("Verify text box value inserted after click button \"load text to the page\"");
	  String lbl_assertion = driver.findElement(By.xpath("//div[@id=\"html5div\"]/div")).getText();
	  Assert.assertEquals(lbl_assertion, "I have been added with a timeout");
	  
	//STEP 5
	  Reporter.log("Navigate Home page clicking \"Home Page\" link");
	  driver.findElement(By.xpath("//a[contains(text(), \"Home\")]")).click();
	  Thread.sleep(3000);
	  
	  //STEP 6
	  Reporter.log("Close Browser");
	  driver.close();
  }

  @AfterTest
  public void afterTest() {
  }

}
