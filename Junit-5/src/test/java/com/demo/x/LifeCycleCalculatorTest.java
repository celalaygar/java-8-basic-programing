package com.demo.x;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class LifeCycleCalculatorTest {
	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll executed");
	}

	@BeforeEach
	void setupThis() {
		System.out.println("@BeforeEach executed");
	}

	@Test
	void testCalcOne() {
		System.out.println("======TEST ONE EXECUTED=======");
		Assertions.assertEquals(4, Calculator.add(2, 2));
	}

	@Test
	void testCalcTwo() {
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(6, Calculator.add(2, 4));
	}
	@Test
	void testCalcThree() {
		System.out.println("======TEST THREE EXECUTED=======");
		Assertions.assertEquals(6, Calculator.add(12, 4));
	}
	@AfterEach
	void tearThis() {
		System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear() {
		System.out.println("@AfterAll executed");
	}
	
	/*
	
	@BeforeAll executed
	@BeforeEach executed
	======TEST THREE EXECUTED=======
	@AfterEach executed
	@BeforeEach executed
	======TEST ONE EXECUTED=======
	@AfterEach executed
	@BeforeEach executed
	======TEST TWO EXECUTED=======
	@AfterEach executed
	@AfterAll executed

	 */
	
	
}
