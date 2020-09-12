package com.project.poclasses;

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
	
	/**
	 * Click Radio button
	 * @author ricardo.avalos
	 */
	
	public void clickRadio() {
		reporterLog("Click Radio");
		waitForElementPresent(rad_unique);
		click(rad_unique);
	}
	
	/**
	 * Select dropdown by value in chapter 1
	 * @author ricardo.avalos
	 */
	
	public void selectTypeSelenium(String seleniumValue) {
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
}