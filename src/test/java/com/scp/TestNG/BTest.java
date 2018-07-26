package com.scp.TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.scp.DemoListner.AppTestReportGenerationListener;
@Listeners(AppTestReportGenerationListener.class)
public class BTest {
	
	
		@Test
	public void B() {
			
		System.out.println("\t\t B class B method");
	}
		@Test
	public void B1() {

		System.out.println("B class B1 method");

	}

}
