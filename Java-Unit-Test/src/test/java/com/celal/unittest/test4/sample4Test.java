package com.celal.unittest.test4;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;

import com.celal.unittest.sample1.Calculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class sample4Test {
	Calculator calculator = new Calculator();

	@Test
	@Parameters("10,3,30")
	public void testAlanHesaplaV1(int en,int boy,int toplamAlan) {
		assertEquals(toplamAlan, calculator.alanHesapla(en, boy)); 
	}
	@Test
	@Parameters({"10,2,20","120,2,240","15,3,45"})
	public void testAlanHesaplaV2(int en,int boy,int toplamAlan) {
		assertEquals(toplamAlan, calculator.alanHesapla(en, boy)); 
	}
	
}
