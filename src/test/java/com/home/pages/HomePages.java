package com.home.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	public void mouseHoverClick() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;  // scroll down
		js.executeScript("window.scrollBy(0,680)", "");
		Thread.sleep(2000);

		Actions mousehver=new Actions(driver);
		WebElement mshov= driver.findElement(By.xpath("//button[@id='mousehover']"));

		mousehver.moveToElement(mshov).perform();
		Thread.sleep(2000);
		WebElement optionSelect= driver.findElement(By.xpath("//*[@id=\"block-1069048\"]/div/div/div/div[4]/div/fieldset/div/div/a[1]"));
		optionSelect.click();
		
		System.out.println("Top selected");
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
