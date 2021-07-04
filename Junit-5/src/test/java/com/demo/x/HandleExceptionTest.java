package com.demo.x;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class HandleExceptionTest {
	@Test
	void testExpectedException() {
	  Assertions.assertThrows(NumberFormatException.class, () -> {Integer.parseInt("One");});
	 
	}
	@Test
	void testExpectedExceptionWithFileNotFoundException() {
	  Assertions.assertThrows(FileNotFoundException.class, () -> { Integer.parseInt("One"); });
	}
	
	@Test
	void testExpectedExceptionWithSuperType() {
	  Assertions.assertThrows(IllegalArgumentException.class, () -> { Integer.parseInt("One"); });
	}
}
