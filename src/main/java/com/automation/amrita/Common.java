package com.automation.amrita;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	
	public WebDriver openbrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Interview\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 return driver;
		
	}

	public void closerbrowser(WebDriver driver)
	{
		driver.close();
	}
}
