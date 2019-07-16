package com.automation.amrita;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.pages.BookFlightPage;
import com.automation.pages.Homepage;
import com.automation.pages.SecondFlightPage;
import com.automation.pages.SelectFlightPage;
import com.automation.pages.VerficationSucessful;

public class Execution {
	public static void main(String args[]) throws Exception
	{
		
		Common open =new Common();
		WebDriver driver =open.openbrowser();
		
		Homepage.getUrl(driver);
		Homepage.login(driver);
		
		SecondFlightPage.flight(driver);
		
		SelectFlightPage.selectflight(driver);
		
		BookFlightPage.bookaflight(driver);
		
		//VerficationSucessful.takeSnapShot(driver, "c://test.png");
		
		Common close=new Common();
		//close.closerbrowser(driver);


	}

}
