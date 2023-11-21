package com.JUnitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
public class OrderAnnotation {
	
	//
	@Order(2)
	@Test
	public void method1() {
		
		System.out.print("Are ");
		
	}
	@DisplayName("1st method")
	@Order(3)
	@Test
public void method2() {
		
		System.out.println("you?");
		
	}
	@Order(1)
	@Test
public void method3() {
		
		System.out.print("How ");
		
	}
	@Order(4)
	@Test
	public void method4() {
			
			System.out.println("Fine thank you...");
			
		}
	
}
