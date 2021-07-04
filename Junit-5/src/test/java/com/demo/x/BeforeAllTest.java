package com.demo.x;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class BeforeAllTest {
    @DisplayName("Add operation test")
    @RepeatedTest(5)
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }
     
    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }
}
