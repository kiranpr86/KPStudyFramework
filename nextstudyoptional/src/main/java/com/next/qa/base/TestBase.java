package com.next.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.next.qa.utils.util;

public class TestBase {

public static WebDriver driver;
public static Properties prop;

	public TestBase()  {
		
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\kiran R\\eclipse-workspaceKiran\\nextstudy\\src\\main\\java\\com\\next\\qa\\config\\config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	public static void initialization() {
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Webdriver path\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

		
	} 

}