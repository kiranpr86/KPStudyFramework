package com.next.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.next.qa.base.TestBase;

public class RegisterNowPage extends TestBase {
	
	@FindBy(id="FirstName")
	WebElement Firstname;
	
	@FindBy(id="LastName")
	WebElement LastName;
	
	public RegisterNowPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Nameinput(String fn,String ln)
	{
		Firstname.sendKeys(fn);
		LastName.sendKeys(ln);
	}

}
