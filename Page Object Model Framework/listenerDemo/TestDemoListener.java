package com.listenerDemo;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListener.class)
public class TestDemoListener {
	
	@Test(priority = '1')
	public void method1() {
		System.out.println("Executing method 1");
	}
	
	@Test(priority = '2')
	public void method2() {
		System.out.println("Executing method 2");
		Assert.assertTrue(false);
	}

}
