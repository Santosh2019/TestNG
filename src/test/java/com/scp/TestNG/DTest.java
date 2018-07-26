package com.scp.TestNG;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.scp.DemoListner.AppTestReportGenerationListener;
@Listeners(AppTestReportGenerationListener.class)
public class DTest {

	@Test(dependsOnMethods="dTest2")
	public void dTest1() {
		
		System.out.println("dTest1");
		
	}
	@Test
	public void dTest2() {
		System.out.println("\t\t AfterSuite Annotaions D classClass");
	}
	
	
}
