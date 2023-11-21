package com.TDD_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	Calculator cal=new Calculator();
	@Test
	public void add() {
		int a=10,b=20;
		int result=cal.add(a,b);
		
		//assert
		
		Assert.assertEquals(result, 12,"Addition result was incorrect...");
		
	}
	@Test
	public void substract() {
		int a=20,b=10;
		int result=cal.substract(a,b);
		Assert.assertEquals(result, 10,"Result wrong...");
	}

}
