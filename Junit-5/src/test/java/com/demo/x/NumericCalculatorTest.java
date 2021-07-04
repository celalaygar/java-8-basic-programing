package com.demo.x;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
class NumericCalculatorTest {

	@Disabled("Do not run in lower environment")
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
    @Test
    void testOnDev() 
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
    }
     
    @Test
    void testOnProd() {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
    }
    @Test
    void testOnProdv2() {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEVE".equals(System.getProperty("ENV")));
    }
	@Disabled("Do not run in lower environment")
	@Test
	void test2() {
    	NumericCalculator data = new NumericCalculator();
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , data.add(2, 2));
	}
	@Test
	void test3() {
    	NumericCalculator data = new NumericCalculator();
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 5 , data.add(2, 4));
	}
}
