package com.automatedtester.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC002_Chapter1_ValidateText {
 
  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void TC002() throws InterruptedException {
	  
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
	  
	//STEP 3
	  Reporter.log("Select \"Selenium IDE\" from dropdown");
	  Select dd_selenium = new Select(driver.findElement(By.xpath("//select[@id='selecttype']")));
	  dd_selenium.selectByValue("Selenium IDE");
	  Thread.sleep(2000);
	  
	  //STEP 4
	  Reporter.log("Validate text Assertion");
	  String lbl_assert= driver.findElement(By.xpath("//div[@id='divontheleft']")).getText();
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals(lbl_assert, "Assert that this text is on the page1729622");
//	  Assert.assertEquals(lbl_assert, "Assert that this text is on the page");
	  Thread.sleep(2000);
	//STEP 5
	  Reporter.log("Navigate Home page clicking \"Home Page\" link");
	  driver.findElement(By.xpath("//a[contains(text(), \"Home\")]")).click();
	  Thread.sleep(3000);
	  
	  //STEP 6
	  Reporter.log("Close Browser");
	  driver.close();
	  
	  softAssert.assertAll();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
