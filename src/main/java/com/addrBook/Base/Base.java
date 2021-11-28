package com.addrBook.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	
	public static WebDriver driver;
	

	public static void initialization()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://18.222.49.199:49154/addressbook/");
		//pageload wait time
		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
	}

}
