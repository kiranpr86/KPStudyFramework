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

public class HomePageTest extends TestBase {
	HomePage homepage;
	LoginPage Loginpage;
	public static Logger log=LogManager.getLogger(HomePageTest.class.getName());
	
public HomePageTest()
{
	super();
}
@BeforeMethod
public void Setup()
{
	initialization();
	log.info("driver initialized");
	homepage=new HomePage();
}

@Test
public void MyaccountclickTest()
{
	Loginpage=homepage.Myaccountclick();
	log.info("my account link clicked");
}


@AfterMethod
public void Teardown()
{
driver.quit();
}
	

}
