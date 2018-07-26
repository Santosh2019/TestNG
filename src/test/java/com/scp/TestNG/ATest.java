package com.scp.TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.scp.DemoListner.AppTestReportGenerationListener;
@Listeners(AppTestReportGenerationListener.class)
public class ATest {
	
	
	
	@Test
	public void A() {
		System.out.println("A class A method ");
	//	int i=10/0;
		
	}
	@Test
	public void A1() {
				System.out.println("A class A1 method");
		
	}

}
