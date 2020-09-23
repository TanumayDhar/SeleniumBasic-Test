package com.home.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InitialSetup {

	public static WebDriver driver;
	static String urlPath= "https://letskodeit.teachable.com/p/practice";


	public InitialSetup()
	{

		if(driver ==null) 

		{
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(urlPath);
		}


	}

}
