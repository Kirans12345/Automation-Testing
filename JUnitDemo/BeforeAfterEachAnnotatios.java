package com.JUnitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnotatios {
	
	//JUnit @BeforeEach and AfterEach arev similar to @BeforeMetod and AfterMethod
	
	@BeforeEach//Executes before each tesr method
	public void init() {
		System.out.println("Start the DBConnection...");
		System.out.println("Initalization Done...");
		
	}
	
	@Test
	public void test1() {
		System.out.println("Executing nethod 1...");
		
	}
	
	@Test
	public void test2() {
		System.out.println("Executing nethod 2...");
		
	}
	@AfterEach
	public void tearDown() {
		System.out.println("Execution of test method tearDown");
	}
}
