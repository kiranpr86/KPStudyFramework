package com.next.qa.utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {
	WebDriver driver;

	ExtentReports extent=util.getReportmethod();
	ExtentTest test;

	public void onTestStart(ITestResult result) {
	System.out.println("Execution started");
	test=extent.createTest(result.getMethod().getMethodName());
	
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Execution passed");
		String TCmethod=result.getMethod().getMethodName();
		System.out.println(TCmethod);
		test.log(Status.PASS, "Testcase passed");
		test.addScreenCaptureFromPath(TCmethod);
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("Execution Failed");
		test.fail(result.getThrowable());
		//String TCmethod=result.getMethod().getMethodName();
		try {
			util.takescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();

	}

}
