package com.next.qa.testcases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.next.qa.base.TestBase;
import com.next.qa.pages.HomePage;
import com.next.qa.pages.LoginPage;
import com.next.qa.pages.MyAccountDetailsPage;
import com.next.qa.pages.RegisterNowPage;

public class LoginPageTest extends TestBase {
	public static Logger log=LogManager.getLogger(TestBase.class.getName());	
	HomePage homepage;
	LoginPage loginpage;
	MyAccountDetailsPage myaccountdetailspage;
	RegisterNowPage registernowpage;
	
	
	public LoginPageTest()
	{
		super();
		}
@BeforeMethod
public void setup()
{
	initialization();
	homepage=new HomePage();
	loginpage=new LoginPage();
	homepage.Myaccountclick();
}

@Test(priority=1)
public void LoginTest()
{
	myaccountdetailspage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	log.info("login successfull");
}

@Test(priority=2)
public void RegisternowclickTest()
{
	registernowpage=loginpage.Registernowclick();
	log.info("clicked on registernow link");
}


@AfterMethod
public void Teardown()
{
driver.quit();
}


}
