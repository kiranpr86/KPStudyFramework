package com.next.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.next.qa.base.TestBase;

public class LoginPage extends TestBase {
	

	@FindBy(id ="EmailOrAccountNumber")
	@CacheLookup
	WebElement Username;

	@FindBy(id ="Password")
	@CacheLookup
	WebElement Password;

	@FindBy(id ="SignInNow")
	@CacheLookup
	WebElement Signin;
	
	@FindBy(xpath="//div[@class='SecondaryContainer']/a")
	@CacheLookup
	WebElement Registernow;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
public MyAccountDetailsPage Login(String un,String pwd)
{
	Username.sendKeys(un);
	Password.sendKeys(pwd);
	Signin.click();
	return new MyAccountDetailsPage();
}

public RegisterNowPage Registernowclick()
{
	Registernow.click();
	return new RegisterNowPage();
}
	
}
