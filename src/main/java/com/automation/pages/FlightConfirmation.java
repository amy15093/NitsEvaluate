package com.automation.pages;

import org.openqa.selenium.WebDriver;

public class FlightConfirmation {
	
	public static void confirmationpage(WebDriver driver) throws InterruptedException
	{
	Thread.sleep(7000);
		
		try {
		VerficationSucessful.takeSnapShot(driver, "D://test1.png") ; 
		}catch (Exception e) {
			System.out.println(e);
	}

}
}
