package com.demo.x;


import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.demo.x.NumericCalculator;

public class TestApplication {
//    @BeforeAll
//    static void setup(){
//        System.out.println("@BeforeAll executed");
//    }
//     
//    @BeforeEach
//    void setupThis(){
//        System.out.println("@BeforeEach executed");
//    }
     
    @Test
    void testCalcOne() 
    {
    	NumericCalculator data = new NumericCalculator();
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , data.add(2, 2));
    }
     
//    @Test
//    void testCalcTwo() 
//    {
//    	NumericCalculator data = new NumericCalculator();
//        System.out.println("======TEST TWO EXECUTED=======");
//        Assertions.assertEquals( 6 , data.add(2, 4));
//    }
     
//    @AfterEach
//    void tearThis(){
//        System.out.println("@AfterEach executed");
//    }
//     
//    @AfterAll
//    static void tear(){
//        System.out.println("@AfterAll executed");
//    }
}
