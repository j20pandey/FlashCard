package com.j20.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ControllerForTestTest {
	
	ControllerForTest test;
	
	@BeforeEach
	void init() {
		 test = new ControllerForTest();

	}
	@BeforeAll
	static void testBeforeall() {
		
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("Clean");
	}

	@Test
	void test() {
		//ControllerForTest test = new ControllerForTest();
		int expected = 2;
		int actual = test.sumOf(1, 1);
		assertEquals(expected, actual,"Some messsge");
	}
	
	@Test
	void testComputure() {
		//ControllerForTest test = new ControllerForTest();
		assertEquals(314.131331, test.computeCirleArea(10));
		
		
	}
	
	@Test
	void testDevide() {
		//ControllerForTest test = new ControllerForTest();
		assertThrows(ArithmeticException.class, ()->test.devide(1,0));
		
		
		
	}
	

}
