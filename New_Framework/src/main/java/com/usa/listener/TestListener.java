package com.usa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.usa.basepage.SuperClass;
import com.usa.genericFunctions.CommonMethods;



public class TestListener extends SuperClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test will start"+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test will success"+ result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test will fail and take screenshot"+ result.getName());
		CommonMethods.captureScreenshot(driver, "failed Test");
		
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
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
