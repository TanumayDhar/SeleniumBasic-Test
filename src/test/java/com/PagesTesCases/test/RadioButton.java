package com.PagesTesCases.test;


import org.testng.annotations.Test;

import com.home.pages.HomePages;


public class RadioButton {

	@Test
	public void RadioButtonClick() throws InterruptedException
	{
		HomePages rb =new HomePages();
		rb.radioButtn();
		rb.WaitforSometime();
		rb.closeProject();

	}





}


