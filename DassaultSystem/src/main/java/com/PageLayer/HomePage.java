package com.PageLayer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class HomePage extends TestBase {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	
	
	
	
}
