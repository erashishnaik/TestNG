package com.Testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelectExample {
@Test
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.spotify.com/in-en/signup?sp_t_counter=1");
driver.manage().window().maximize();
Set<Cookie> cookie = driver.manage().getCookies();
int k =cookie.size();//size of cookies
System.out.println(k);
for(Cookie cook :cookie) {
	System.out.println(cook.getName()+ ": "+cook.getValue());
	
}

//driver.findElement(By.id("accept-cookie-notification-content")).click();
Thread.sleep(1000);
System.out.println(driver.findElement(By.xpath("//div[@data-testid='year']")).isDisplayed());
driver.findElement(By.xpath("//div[@data-testid='year']")).sendKeys("1991");
WebElement developers_dropdown = driver.findElement(By.id("month"));
Select objSelect = new Select(developers_dropdown);
//objSelect.selectByIndex(2);
objSelect.selectByVisibleText("December");






}
}
