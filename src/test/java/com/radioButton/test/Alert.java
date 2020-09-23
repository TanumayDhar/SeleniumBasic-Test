package com.radioButton.test;

import org.testng.annotations.Test;

import com.home.pages.HomePages;

public class Alert {
	
	@Test(priority=1)
	public void alertHandleAccept() throws InterruptedException
	{
		
		HomePages alert=new HomePages();
		alert.alertHandle();
		alert.WaitforSometime();
		alert.closeProject();
		
	}
	

}
