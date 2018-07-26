package com.scp.TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.scp.DemoListner.AppTestReportGenerationListener;
@Listeners(AppTestReportGenerationListener.class)
public class CTest {
	@Test 
	public void cTest1() {
		System.out.println("---- cTest1 ------");
		
	}
	
	@BeforeSuite
	public void cTest2() {
		System.out.println("\t\t BeforeSuite Annotaions C class");
		
	}
	

}
