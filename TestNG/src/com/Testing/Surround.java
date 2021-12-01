package com.Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Surround {
	@BeforeSuite
	public void setup1() {
		System.out.println("SurroundPrepare Setup");
	}
	
	@BeforeTest
	public void beforethetest () {
		System.out.println("Surround3 2 1 Go");
	}
	@BeforeClass
	public void SurroundLogin() {
		System.out.println("SurroundBefore Class");
	}
	@BeforeMethod
	public void SurroundEnterURL()
	{
		System.out.println("SurroundBefore Method");
	}
	@Test
	public void Surrounddemo() {
		System.out.println("SurroundTestNG");
	}
	@Test
	public void Surroundfirst()
	{
		System.out.println("SurroundSelenium");
	}
	@AfterMethod
	public void Surroundlogout()
	{
		System.out.println("SurroundAfter Method");
	}
	@AfterClass
	public void Surrounddeleteallcookies()
	{
		System.out.println("SurroundAfter Class");
	}
	@AfterTest
	public void SurroundCloseBrowser()
	{
		System.out.println("SurroundAfter Test");
	}
	@AfterSuite
	public void SurroundgenerateTestReport()
	{
		System.out.println("SurroundAfter Suite");
	}
	

}
