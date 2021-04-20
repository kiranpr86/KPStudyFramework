package com.next.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.next.qa.base.TestBase;

public class HelpPage extends TestBase{
	
	@FindBy(xpath="//a[@href='/help/']")
	WebElement Help;
	
	public HelpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HelpDetailsPage helplinkclick()
	{
		Help.click();
		return new HelpDetailsPage();
	}
	

}
