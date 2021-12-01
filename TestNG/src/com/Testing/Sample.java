package com.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test
	public void GoogleTittleTest() {
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
	}
	@Test(dependsOnMethods = "GoogleTittleTest")
	public void GoogleLogo() {
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println(b);
		
	}
	@Test
	public void mailLinkText() {
		boolean b1 = driver.findElement(By.xpath("//a[@class='gb_f']")).isDisplayed();
		System.out.println(b1);
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
