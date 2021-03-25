package com.next.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.next.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[@title ='Sign in to view account details']")
	@CacheLookup
	WebElement Myaccount;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage Myaccountclick()
	{
		Myaccount.click();
		return new LoginPage();
	}

}
