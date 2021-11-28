package com.addrBook.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.addrBook.Base.Base;
import com.addrBook.Scenarios.ValidateNewContact;

public class ValidateNewContactTest extends Base{
	
	ValidateNewContact vc;
	
	@BeforeClass
	public void OpenBrowser()
	{
		initialization();
		vc = new ValidateNewContact();
	}
	
	
	@Test(priority='1')
	public void clickNewTest() throws InterruptedException
	{
		vc.clickNewcontact();
		Thread.sleep(1000);
	}
	
	@Parameters({"p1","p2","p3","p4","p5"})
	@Test(priority='2')
	public void createcontacttest(String p1, String p2, String p3, String p4, String p5) throws InterruptedException
	{
		vc.createContact(p1,p2,p3,p4,p5);
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
