package com.addrBook.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.addrBook.Base.Base;
import com.addrBook.Scenarios.ValidateTableEntry;

public class ValidateTableEntryTest extends Base {
	
	ValidateTableEntry vt;
	
	@BeforeClass
	public void openBrowser()
	{
		initialization();
		 vt = new ValidateTableEntry();
	}
	
	@Test(priority='1')
	public void emailClickTest() throws InterruptedException
	{
		vt.clickEmail();
		Thread.sleep(3000);
	}
	
	@Test(priority='2')
	public void fetchPhonenumberTest() throws InterruptedException
	{
		Thread.sleep(2000);
		vt.fetchPhonenumber();
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}

}
