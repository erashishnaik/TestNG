package com.Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
	
	/*@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("This block executes before each Test");
	}
	*/
	@Test(dataProvider="getData")
	public void Userid(String username,String password,String id)
	{
		System.out.println("This block executes before each Test");
		System.out.println(username);
		System.out.println(password);
		  System.out.println(id);
		
		
	}
	/*@BeforeTest
	public void Cookies()
	{
		System.out.println("This block executes Before all  Testcases");
		//delete cookies
	}
@AfterTest
public void Cookiesclose()
{
	System.out.println("This block executes after all  Testcases");
	//close the browesers
}
@AfterMethod
public void Reportadding()
{
	System.out.println("This block executes after each Test");
}
	//@Test
	public void OpeningBrowser()
	{
	//This opens the Browser
	System.out.println("Executing Test 2");

}
//@Test
public void FlightBooking()
{
	System.out.println("Executing Test 1");
}
*/
@DataProvider
public Object[][] getData()
{
	//i stands for number of times testcase should run
	//j stands for no of parametrs it should send for one go
	Object[][] data=new Object[3][3];
	data[0][0]="1Username";
	data[0][1]="1Password";
	data[0][2]="1ID";
	
	
	data[1][0]="2Username";
	data[1][1]="2Password";
	data[1][2]="2ID";
	
	data[2][0]="3Username";
	data[2][1]="3Password";
	data[2][2]="3ID";
	
	/*Userame(0,0)      Password(0,1)       ID(0,2)
	Userame(1,0)      Password(1,1)       ID(1,2)
	Userame(2,0)      Password (2,1)      ID(2,2)*/
	
	return data;
	
	
}

	
}

