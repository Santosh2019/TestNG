package com.scp.TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class BTest {
	
	
		@AfterSuite
	public void B() {
			
		System.out.println("\t\t B class B method");
	}
		@Test
	public void B1() {

		System.out.println("B class B1 method");

	}

}
