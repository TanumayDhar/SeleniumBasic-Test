package com.radioButton.test;

import org.testng.annotations.Test;

import com.home.pages.HomePages;

public class CheckBox {
	
	@Test
	public void checkBoxClick()
	{
		
		HomePages checkBox =new HomePages();
		checkBox.checkBoxClick();
		try {
			checkBox.WaitforSometime();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checkBox.closeProject();
					
		
	}

}
