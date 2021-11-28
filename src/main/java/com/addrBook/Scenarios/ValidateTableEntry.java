package com.addrBook.Scenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.addrBook.Base.Base;

public class ValidateTableEntry extends Base {
	
	// Object Repository
	
	// locators, id, name, xpath, CSS, linktext,
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]")
	WebElement email;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[1]/div/span")
	WebElement phonetext;
	
	// initilize these elements
	
	
	public ValidateTableEntry()
	{
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void clickEmail() 
	{
		String text = email.getText();
		System.out.println(text);
		email.click();
	}
	
	public void fetchPhonenumber()
	{
		//System.out.println(phone.isEnabled());
		String number = phonetext.getText();
		System.out.println("the Text is :" + number);
	}
	
	

}
