package com.testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testing.component.Aboutus;
import com.testing.component.Contactus;
import com.testing.component.Events;
import com.testing.component.News;
import com.testing.component.Qualification;

public class Launch {
	@Test
	public void launch() {
    	try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tejasri gandla\\OneDrive\\Desktop\\javaproject\\chromedriver.exe");
													
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.lrnschools.org/");
		driver.manage().window().maximize();
		  
		Aboutus aboutus = new Aboutus(driver);
		//aboutus.navigate();
		
		Qualification qualification = new Qualification(driver);
	    //qualification.navigate();
		
		News news=new News(driver);
		news.navigate();
		
		Events events=new Events(driver);
		events.navigate();
		
		Contactus contactus=new Contactus(driver);
		contactus.navigate();
		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}	 

    }
}


