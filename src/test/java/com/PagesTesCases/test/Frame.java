package com.PagesTesCases.test;



import org.testng.annotations.Test;

import com.home.pages.HomePages;

public class Frame {
	
	
	@Test
	public void frameSwitch() throws Exception
	{
		
		HomePages frame= new HomePages();
		frame.frameSwitch();
		
	}

}
