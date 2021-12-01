package com.Testing;

import java.io.File;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots3 {
@Parameters({"chromedriver"})
@Test
public static void ScreenshotTest(String crmdriver) throws IOException {
//(String[] args) throws IOException {
System.setProperty(crmdriver, "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.travolook.in/");
driver.manage().window().maximize();


		
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium Testing\\Screenshot\\travelook2.jpg"));

//Convert web driver object to TakeScreenshot
TakesScreenshot scrShot =((TakesScreenshot)driver);

//Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

    //Move image file to new destination 

        File DestFile=new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium Testing\\Screenshot\\travelook1.jpg");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);


	}

}
