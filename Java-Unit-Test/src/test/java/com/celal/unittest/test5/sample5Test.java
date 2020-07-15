package com.celal.unittest.test5;

import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

import org.hamcrest.CoreMatchers.*;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Test;

public class sample5Test {

	@Test
	public void testMatchingV1() throws Exception {
		String data1="haci celal";
		String data2="aygar";
		
		assertThat(data1)
		.describedAs("bu bir hata mesajıdır.")
			.isEqualTo("haci celal")
			.startsWith("haci")
			.endsWith("al")
			.contains("ce")
			.isNotEmpty()
			.isNotNull()
			.doesNotContain("ay")
			.containsOnlyOnce("ele");
	}
	@Test
	public void testMatchingV2() throws Exception {
		String data1="haci celal AYAgar";
		String data2="aygar";
		
		assertThat(data1)
			.isEqualTo("haci celal AYAgar")
			.startsWith("haci")
			.endsWith("ar")
			.contains("ce")
			.isNotEmpty()
			.isNotNull()
			.doesNotContain("aya")
			.containsOnlyOnce("el");
	}
}
