package com.home.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePages extends InitialSetup{

	String sendKeysValue = "Tanumay";

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

	public void alertHandle() throws InterruptedException
	{

		WebElement alertclickelement =driver.findElement(By.id("name"));
		
		alertclickelement.sendKeys(sendKeysValue);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().dismiss();


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
