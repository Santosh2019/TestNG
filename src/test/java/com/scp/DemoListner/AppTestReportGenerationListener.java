package com.scp.DemoListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class AppTestReportGenerationListener implements ITestListener{
	
	public static int passTestCount=0;
	public static int failTestCount=0;
	public static int skipTestCount=0;
	
	public void onFinish(ITestContext result) {
		
		System.out.println("..........Inside Suite Finish......");
		System.out.println("Total Pass Tests  :"+passTestCount);
		System.out.println("Total Fail Tests  :"+failTestCount);
		System.out.println("Total Skip Tests  :"+skipTestCount);
		GenerateTestPieChart.generateReportOfMyAppTestSuite(passTestCount,failTestCount,skipTestCount);
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
		System.out.println("--------inside suite Start");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("|--------include Success Percentage--------|");
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		failTestCount++;
		System.out.println("-----inside onTestFailure-----"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		skipTestCount++;
		System.out.println("-----inside onTestSkipped-----"+result.getName());
		
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-----Inside TestStart-----"+result.getName());
		}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		passTestCount++;
		System.out.println("-----Inside onTestSuccess-----"+result.getName());
		
		
	}



	

}
