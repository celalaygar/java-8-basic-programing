package com.celal.unittest.test3;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.celal.unittest.sample2.Customer;

public class sample3Test {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass Method");
	}
	@Before
	public void before() {
		System.out.println("Before Method");
	}
	@Test
	public void testMethodV1() {
		System.out.println("test Method V1. . . ");
	}
	@Test
	public void testMethodV2() {
		System.out.println("test Method V2. . . ");
	}
	@After
	public void after() {
		System.out.println("After Method");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass Method");
	}
	
}
