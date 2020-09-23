package com.PagesTesCases.test;

import org.testng.annotations.Test;

import com.home.pages.HomePages;

public class DropDown {
	
	
	
	@Test
	public void dropDownselect() throws InterruptedException
	{
		
		
		HomePages dropDwn =new HomePages();
		dropDwn.dropDownSelect();
		dropDwn.WaitforSometime();
		dropDwn.closeProject();
		
		
	}
	

}
