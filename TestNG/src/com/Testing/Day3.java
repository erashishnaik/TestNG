package com.Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"trial"})
	@Test
	public void Mobilelogincarloan(String thought){
		System.out.println("MobileCarLoanDay3");
		System.out.println(thought);}
	
	@Parameters({"URL"})
	@Test
	public void Weblogincarloan(String urlname){
		System.out.println("WebCarLoanDay3");
		System.out.println(urlname);
	}
	
	
	@Test
	public void MobileSignincarloan(){
		System.out.println("MobileSigninCarLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileSignoutcarloanTest(){
		System.out.println("MobileSignoutCarLoanDay3");
	}
	
	@Test(groups= {"Smoke"})
	public void APIlogincarloanTest(){
		System.out.println("ApiCarLoanDay3");
	}
	
	

}
