package com.next.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.next.qa.base.TestBase;
import com.next.qa.pages.HelpDetailsPage;
import com.next.qa.pages.HelpPage;

public class HelpTest extends TestBase {
	
	HelpPage helppage;
	HelpDetailsPage helpdetailspage;
	
	public HelpTest()
	{
		super();
	}
	@BeforeMethod
public void setup()
{
	initialization();
	helppage=new HelpPage();
	
}
	@Test
	public void helplinkclick()
	{
		helpdetailspage=helppage.helplinkclick();
		
	}
	

@AfterMethod
public void Teardown()
{
driver.quit();
}
	
}
