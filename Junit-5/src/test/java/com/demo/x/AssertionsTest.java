package com.demo.x;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

	@Disabled
	@Test
	void testCase1() 
	{
	    //Test will pass
	    Assertions.assertEquals(4, Calculator.add(2, 2)); 
	    //Test will fail 
	    Assertions.assertEquals(3, Calculator.add(2, 2), "Calculator.add(2, 2) test failed"); 
	    //Test will pass
	    Assertions.assertEquals(true, true); 
	    //Test will fail
	    Assertions.assertEquals(true, false, "true test failed"); 
	}
	@Disabled
	@Test
	void testCase2() 
	{
	    //Test will pass
	    Assertions.assertNotEquals(3, Calculator.add(2, 2)); 
	    //Test will fail 
	    Assertions.assertNotEquals(4, Calculator.add(2, 2), "Calculator.add(2, 2) test failed"); 
	}
	@Disabled
	@Test
	void testCase3() 
	{
	     Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4));
	     Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3,4));
	     Iterable<Integer> listThree = new ArrayList<>(Arrays.asList(1,2,3));
	     Iterable<Integer> listFour = new ArrayList<>(Arrays.asList(1,2,4,3));
	      
	    //Test will pass
	    Assertions.assertIterableEquals(listOne, listTwo);
	     
	    //Test will fail
	    Assertions.assertIterableEquals(listOne, listThree);
	     
	    //Test will fail
	    Assertions.assertIterableEquals(listOne, listFour);
	}
	
	@Test
	void testCase4() 
	{    
	    String nullString = null;
	    String notNullString = "howtodoinjava.com";
	     
	    //Test will pass
	    Assertions.assertNotNull(notNullString);
	     
	    //Test will fail
	    Assertions.assertNotNull(nullString);
	     
	    //Test will pass
	    Assertions.assertNull(nullString);
	 
	    // Test will fail
	    Assertions.assertNull(notNullString);
	}
	
	
	@Test
	void testCase5() 
	{    
	    String originalObject = "howtodoinjava.com";
	    String cloneObject = originalObject;
	    String otherObject = "example.com";
	    String otherObject2 = "example.com";
	     
	    //Test will pass
	    Assertions.assertNotSame(originalObject, otherObject);
	     
	    //Test will fail
	    Assertions.assertNotSame(originalObject, cloneObject);
	     
	    //Test will pass
	    Assertions.assertSame(originalObject, cloneObject);
	 
	    // Test will fail
	    Assertions.assertSame(originalObject, otherObject);
	    
	    // Test will pass
	    Assertions.assertSame(otherObject, otherObject2);
	}
}
