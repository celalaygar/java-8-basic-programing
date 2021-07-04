package com.demo.x;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

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
	@Test
	void testCase2() 
	{
	    //Test will pass
	    Assertions.assertNotEquals(3, Calculator.add(2, 2)); 
	    //Test will fail 
	    Assertions.assertNotEquals(4, Calculator.add(2, 2), "Calculator.add(2, 2) test failed"); 
	}
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
}
