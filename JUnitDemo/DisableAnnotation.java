package com.JUnitDemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableAnnotation {
	
	@Test
	public void method1() {
		System.out.println("Executing method-1...");
	}
	
	@Test
	public void method2() {
		System.out.println("method 2...");
		
	}
	@Test
	@Disabled
	private  void method3() {
		System.out.println("method3...");
	}
	
	@Test
	public  void method4() {
		System.out.println("Method4...");
	}

}
