package com.project.poclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.base.Base;

public class HomePage extends Base{
	
	/**
	 * Constructor Base class
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	// Objects
	By link_chapter1 = By.xpath("//a[contains(text(), 'Chapter1')]");
	
	/**
	 * Click Chapter 1
	 * @author ricardo.avalos
	 * @throws IOException 
	 */
	
	public void clickChapter1() throws IOException {
		takeScreenshot("TC001", "Click Chapter1");
		reporterLog("Click Chapter 1");
		waitForElementPresent(link_chapter1);
		click(link_chapter1);	
	}
	
	/**
	 * Click Chapter 2
	 * @author ricardo.avalos
	 */
	
	public void clickChapter(String chapterValue) {
		reporterLog("Click Chapter 1");
		waitForElementPresent(link_chapter1);
		click(link_chapter1);	
	}


}
