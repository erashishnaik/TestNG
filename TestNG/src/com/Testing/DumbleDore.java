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

public class DumbleDore {

	@BeforeSuite
	public void DumbleDoresetup() {
		System.out.println("DumbleDoreBefore Suite");
	}
	@BeforeTest
	public void DumbleDoreLaunchBrowser() {
		System.out.println("DumbleDoreBefore Test");
	}
	@BeforeClass
	public void DumbledoreLogin() {
		System.out.println("DumbleDoreBefore Class");
	}
	@BeforeMethod
	public void DumbledoreEnterURL()
	{
		System.out.println("DumbleDoreBefore Method");
	}
	@Test
	public void DumbleDoredemo() {
		System.out.println("DumbleDoreTestNG Dumblw");
	}
	@Test
	public void DumbleDorefirst()
	{
		System.out.println("DumbleDoreSelenium");
	}
	@AfterMethod
	public void DumbleDorelogout()
	{
		System.out.println("DumbleDoreAfter Method");
	}
	@AfterClass
	public void DumbleDoredeleteallcookies()
	{
		System.out.println("DumbleDoreAfter Class");
	}
	@AfterTest
	public void DumbleDoreCloseBrowser()
	{
		System.out.println("DumbleDoreAfter Test");
	}
	@AfterSuite
	public void DumbleDoregenerateTestReport()
	{
		System.out.println("DumbleDoreAfter Suite");
	}
	

}