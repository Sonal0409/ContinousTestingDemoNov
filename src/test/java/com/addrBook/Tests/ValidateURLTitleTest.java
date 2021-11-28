package com.addrBook.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.addrBook.Base.Base;
import com.addrBook.Scenarios.ValidateURLTitle;

public class ValidateURLTitleTest extends Base{
	
	
	ValidateURLTitle vu;
	
	@BeforeClass
	public void openBrowser()
	{
		initialization();
		
		vu = new ValidateURLTitle();
		
	}
	
	@Test
	public void validateTitleTest()
	{
		String title1= vu.validateTitle();
		System.out.println(title1);
		String url = vu.validateURL();
		System.out.println(url);
	}
	
	
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
