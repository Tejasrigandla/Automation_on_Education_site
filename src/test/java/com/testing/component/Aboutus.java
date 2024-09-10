package com.testing.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.testing.util.Util;



public class Aboutus {
	WebDriver driver = null;
	Util util = null;
	public Aboutus(WebDriver driver) {
		this.driver= driver;
		this.util=new Util(this.driver);
	}
	public void navigate() {
		String aboutus="//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'About us')]";
		util.mouseOverClick (aboutus,"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[contains(text(),'Who we are')]");
		
		util.mouseOverClick (aboutus,"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='International Offices']");
		util.mouseOverClick (aboutus,"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Education Committee']");
		
		util.mouseOverClick (aboutus,"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Partner Offices']");
		util.mouseOverClick(aboutus, "//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Associate and Partner']");
		util.mouseOverClick (aboutus,"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Accolades and Memberships']");
		
	
	}
}
