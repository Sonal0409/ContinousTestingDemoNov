package com.addrBook.Scenarios;

import com.addrBook.Base.Base;

public class ValidateURLTitle extends Base {
	
	
	// Action methods
	
	public String validateTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public String validateURL()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	

}
