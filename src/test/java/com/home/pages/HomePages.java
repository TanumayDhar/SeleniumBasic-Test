package com.home.pages;
import org.openqa.selenium.By;


public class HomePages extends InitialSetup{


	
	public void radioButtn()
	{

		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();

	}

	public void WaitforSometime() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	

	}
	
	public void closeProject()
	{
		driver.close();
	}

}
