package com.Testing;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	
	
	@Test
	public void demo() {
		System.out.println("TestNG");
	}
	
	@Test
	public void first()
	{
		System.out.println("Selenium");
	}
	
	
	@Test (groups={"Smoke"})
	public void Weblogincarloan(){
		System.out.println("WebCarLoanDay1");
	}
	
	@Parameters({"family","strength"})
	@Test
	public void Mobilelogincarloan(String fam, String str){
		System.out.println("MobileCarLoan");
		System.out.println(fam);
		System.out.println(str);
		Assert.assertEquals(true, false);
	}
	
	@Test(timeOut=40000)
	public void MobileSignincarloan(){
		System.out.println("MobileSigninCarLoan");
	}
	
	@Parameters({"username","password", "name"})
	@Test()
	public void MobileSignoutcarloan(String user,String pass, String nam){
		System.out.println("MobileSignoutCarLoan");
		System.out.println(user);
		System.out.println(pass);
		System.out.println(nam);
	}
	
	@Test(groups={"Smoke"})
	public void APIlogincarloan(){
		System.out.println("ApiCarLoanDay1");
	}
	
	

}

