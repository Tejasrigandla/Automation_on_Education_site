package com.testing.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Util {
	 private WebDriver driver = null;
	public Util(WebDriver driver) {
		this.driver= driver;
		
	}
	public void mouseOverClick(String pXpath,String xpath) {
		WebElement ele = driver.findElement(By.xpath(pXpath));

		Actions action = new Actions(driver);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(xpath)).click();	
	}
	public void mouseOverOverClick(String cXpath, String pXpath, String xpath) {
		WebElement ele = driver.findElement(By.xpath(cXpath));
 
		Actions action = new Actions(driver);
 
		action.moveToElement(ele).perform();
 
		mouseOverClick(pXpath, xpath);
}
	public void mouseOverOverOverClick(String cXpath, String pXpath, String xpath,String mXpath) {
		WebElement ele = driver.findElement(By.xpath(cXpath));
 
		Actions action = new Actions(driver);
 
		action.moveToElement(ele).perform();
 
		mouseOverOverClick(pXpath, xpath,mXpath);
}
	
	}
