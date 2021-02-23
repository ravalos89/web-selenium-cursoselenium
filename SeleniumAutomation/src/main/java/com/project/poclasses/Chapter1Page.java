package com.project.poclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.base.Base;

public class Chapter1Page extends Base{

	public Chapter1Page(WebDriver driver) {
		super(driver);
	}
	
	By rad_unique = By.xpath("//input[@id='radiobutton']");
	By sdd_selenium = By.xpath("//select[@id='selecttype']");
	By link_homePage = By.xpath("//a[contains(text(), \"Home\")]");
	By lbl_Assertion= By.xpath("//div[@id='divontheleft']");
	By radio_unique = By.xpath("//input[@id='radiobutton']");
	By select_selenium = By.xpath("//select[@id='selecttype']");
	By dropdown_selenium = By.xpath("//select[@id='selecttype']");
	
	
	/**
	 * Click Radio button
	 * @author ricardo.avalosss
	 * @throws IOException 
	 */
	
	public void clickRadio() throws IOException {
		takeScreenshot("TC001", "Click Radio");
		reporterLog("Click Radio");
		waitForElementPresent(rad_unique);
		click(rad_unique);
	}
	
	/**
	 * Select dropdown by value in chapter 1
	 * @author ricardo.avalos
	 * @throws IOException 
	 */
	
	public void selectTypeSelenium(String seleniumValue) throws IOException {
		takeScreenshot("TC001", "SeleniumValue");
		reporterLog("Select "+seleniumValue+" from dropdown");
		waitForElementPresent(sdd_selenium);
		selectByValueDropdown(sdd_selenium, seleniumValue);
		implicitlyWait(2);
	}
	
	/**
	 * Navigate Home page
	 * 
	 */
	
	public void navigateHomePage() {
		reporterLog("Navigate Home Page");
		waitForElementPresent(link_homePage);
		click(link_homePage);
	}
	
	/**
	 * Validate Text in Chapter 1
	 */
	
	public void validateTextChapter1(String expectedValue) {
		reporterLog("Verify this text: "+expectedValue);
		waitForElementPresent(lbl_Assertion);
		String actualValue = getText(lbl_Assertion);
		hardAssertion(actualValue, expectedValue);
	}
}