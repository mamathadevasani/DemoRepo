package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.libs.BasePageTest;

public class LoginTest  extends BasePageTest {
	
	@Test(priority = 1)
	public void Test1()
	{
		System.out.println("Login--Test1");
	}
	@Test(priority = 2)
	public void Test2()
	{
		System.out.println("Login--Test2");
	}
	
	@Test(priority = 3)
	public void Test3()
	{
		System.out.println("Login--Test3");
		}
	
}
