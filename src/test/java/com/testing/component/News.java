package com.testing.component;

import org.openqa.selenium.WebDriver;

import com.testing.util.Util;

public class News {
	
		WebDriver driver = null;
		Util util = null;
		public News(WebDriver driver) {
			this.driver= driver;
			this.util=new Util(this.driver);
		}
		
		public void navigate() {
			String news="//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='News']";
			//util.mouseOverClick (news,"//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='News']");
			util.mouseOverClick(news, "//ul[@class='nav navbar-nav menu-main-menu thim-ekits-menu__nav']//a[normalize-space()='News']");
			
		}
	
}