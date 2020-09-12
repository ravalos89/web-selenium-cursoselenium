package com.project.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base {
	
	/**
	 * Constructor WebDriver
	 * @author ricardo.avalos
	 * @param driver
	 */
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;		
	}
	
	/**
	 * Chrome driver connection
	 * @author ricardo.avalos
	 * @param
	 */
	
	public WebDriver chromedriverConnection() {
		System.setProperty(GlobalVariables.CHROME_WEBDRIVER_NAME, GlobalVariables.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		return driver;
	}
	
	/**
	 * Launch Browser
	 * @author ricardo.avalos
	 * @param url
	 */
	
	public void launchBrowser(String url) {
		reporterLog("Launch Browser "+ url);
		driver.get(url);
		driver.manage().window().maximize();
		implicitlyWait(5);		
	}
	
	/**
	 * Reporter log
	 * @author ricardo.avalos
	 */
	
	public void reporterLog(String log) {
		Reporter.log(log);
	}
	
	/**
	 * Implicitly Wait
	 * @author ricardo.avalos
	 */
	
	public void implicitlyWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	/**
	 * click Object
	 * @author ricardo.avalos
	 * @param locator
	 */
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/**
	 * Wait For Element Present
	 * @author ricardo.avalos
	 * @param locator
	 */
	
	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.GENERAL_TIMEOUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));			
		}catch (TimeoutException e) {
			reporterLog("Timeout error");
		}	
	}
	
	/**
	 * Select Value from dropdown by Value
	 * @author ricardo.avalos
	 * @param locator, value
	 */
	
	public void selectByValueDropdown(By locator, String value ) {
		waitForElementPresent(locator);
		WebElement element = driver.findElement(locator);
		Select dropdown = new Select(element);
		dropdown.selectByValue(value);
	}
	
	/**
	 * Close Browser
	 * @author ricardo.avalos
	 * 
	 */
	
	public void closeBrowser() {
		try {
			reporterLog("Close Browser");
			driver.close();			
		} catch(NoSuchSessionException e) {
			reporterLog("Closing Browser is failed");
		}
	}

}
