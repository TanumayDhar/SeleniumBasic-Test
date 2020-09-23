package com.home.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class HomePages extends InitialSetup{



	public void radioButtn()
	{

		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();

	}

	public void dropDownSelect()
	{

		WebElement dropDwn = driver.findElement(By.xpath("//select[@id='carselect']"));
		Select dropdownValue =new Select(dropDwn);
		dropdownValue.selectByVisibleText("Benz");


	}



	public void checkBoxClick()
	{

		WebElement checkBox= driver.findElement(By.xpath("//input[@id='hondacheck']"));
		
		checkBox.click();

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
