package com.Testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Success {
	@BeforeSuite
	public void SuccessSuit(){
		System.out.println("SucessSuit1");
	}
	@BeforeTest
	public void SucessBeforeTest() {
		System.out.println("SucessBeforeTest");

	}
	@BeforeClass
	public void SuccessBeforeClass() {
		System.out.println("SucessBeforeClass");
	}
	@BeforeMethod
	public void sucessBefore () {
		System.out.println("successBeforeMethod");
}
	@Test
	public void SucessTest() {
		System.out.println("SucessTest1");
	}
}
