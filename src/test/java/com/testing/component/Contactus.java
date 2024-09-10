package com.testing.component;

import org.openqa.selenium.WebDriver;

import com.testing.util.Util;

public class Contactus {
	WebDriver driver = null;
	Util util = null;
	public Contactus(WebDriver driver) {
		this.driver= driver;
		this.util=new Util(this.driver);
	}
	public void navigate() {
		String contactus="//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Contact us']";
		util.mouseOverClick(contactus, "//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='Contact us']");
		}
}
