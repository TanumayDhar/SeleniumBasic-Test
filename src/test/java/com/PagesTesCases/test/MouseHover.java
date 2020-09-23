package com.PagesTesCases.test;

import org.testng.annotations.Test;

import com.home.pages.HomePages;

public class MouseHover {

	
	
	@Test
	public void mouseHoverFunctionality() throws InterruptedException
	{
		
		HomePages mh=new HomePages();
		mh.mouseHoverClick();
		mh.closeProject();
				
		
	}
}
