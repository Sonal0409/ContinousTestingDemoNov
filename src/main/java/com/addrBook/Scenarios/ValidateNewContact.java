package com.addrBook.Scenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.addrBook.Base.Base;

public class ValidateNewContact extends Base {
	
	// object repository
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]/div")
	WebElement contact;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[3]/input")
	WebElement Firstname;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input")
	WebElement Lastname;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[3]/input")
	WebElement phone;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]/input")
	WebElement email;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[6]/td[3]/div/input")
	WebElement dob;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")
	WebElement save;
	
	public ValidateNewContact()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewcontact()
	{
		contact.click();
	}

	public void createContact(String Fname, String Lname, String pno, String mail, String db) throws InterruptedException
	{
		Firstname.clear();
		Firstname.sendKeys(Fname);
		Lastname.clear();
		Lastname.sendKeys(Lname);
		phone.clear();
		phone.sendKeys(pno);
		email.clear();
		email.sendKeys(mail);
		dob.clear();
		dob.sendKeys(db);
		
		Thread.sleep(1000);
		save.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
