package com.celal.unittest.test1;

import org.junit.Test;

import com.celal.unittest.sample1.Calculator;

import junit.framework.Assert;

public class CalculatorTest {

	@Test
	public void testTopla() {
		//GIVEN
		Calculator calculator = new Calculator();
		int x=5;
		int y=3;
		//WHEN
		int sonuc = calculator.topla(x, y);
		//THEN
		Assert.assertEquals(8, sonuc);
	}
	@Test
	public void testCikarV1() {
		//GIVEN
		Calculator calculator = new Calculator();
		int x=5;
		int y=3;
		//WHEN
		int sonuc = calculator.cikar(x, y);
		//THEN
		Assert.assertEquals(2, sonuc);
	}
	
	@Test
	public void testCikarV2() {
		//GIVEN
		Calculator calculator = new Calculator();
		int x=5;
		int y=33;
		//WHEN
		int sonuc = calculator.cikar(x, y);
		//THEN
		Assert.assertEquals(-28, sonuc);
	}
}
