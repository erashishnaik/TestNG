package com.Testing;

import org.testng.annotations.Test;

public class InvocationCount {
	int sum = 0;
	@Test(invocationCount=1)
	public void invokeTest() {
		for(int i =0; i<=10; i++) {
		int a =10;
		int b = 20;
		int sum = a+b;
		
		sum = sum + sum;
		System.out.println(sum);
		}
	
	}

}
