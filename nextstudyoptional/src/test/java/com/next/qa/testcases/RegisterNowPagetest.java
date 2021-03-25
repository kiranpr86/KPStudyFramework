package com.next.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.next.qa.base.TestBase;
import com.next.qa.pages.HomePage;
import com.next.qa.pages.LoginPage;
import com.next.qa.pages.RegisterNowPage;

public class RegisterNowPagetest extends TestBase {
	HomePage homepage;
	RegisterNowPage registernowpage;
	LoginPage loginpage;
	
	public RegisterNowPagetest()
	{
		super();
	}
@BeforeMethod	
public void setup()
{
	initialization();
	homepage=new HomePage();
	registernowpage=new RegisterNowPage();
	loginpage=new LoginPage();
	homepage.Myaccountclick();
	loginpage.Registernowclick();
	
}

@Test
public void NameinputTest()
{
registernowpage.Nameinput("Test","Test123");
//registernowpage.Nameinput(prop.getProperty("firstname"), prop.getProperty("lastname"));
}


@AfterMethod
public void Teardown()
{
driver.quit();
}

}
