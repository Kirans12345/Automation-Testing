package com.JUnitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotations {
	
	@BeforeAll
	public void init() {
		
		System.out.println("Init...");
	}
	@Test
	public void method1() {
		
		System.out.println("Method1...");
		
	}
	@AfterAll
	public void tearDown() {
		System.out.println("End...");
	}
	
	

}
