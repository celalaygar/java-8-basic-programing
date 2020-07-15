package com.celal.unittest.test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Condition;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class sample6Test {

	List<String> list = new ArrayList<String>(Arrays.asList("ANKARA","ISTANBUL","IZMIR","ADANA","BURSA"));
	List<String> icecekler = new ArrayList<String>(Arrays.asList("kola","fanta","su","pepsi","çay"));
	List<String> yiyecekler = new ArrayList<String>(Arrays.asList("hamburger","peynir","zeytin","reçel"));
	@Test
	public void testList() throws Exception {
		assertThat(list)
		.describedAs("Bu bir hata mesajıdır.")
		.contains("ANKARA")
		.doesNotContain("ANTALYA")
		.containsExactly("ANKARA","ISTANBUL","IZMIR","ADANA","BURSA")
		.doesNotHaveDuplicates();
	}
	@Test
	public void testDoubleListV1() {
		List<String> icecekler2 = new ArrayList<String>(Arrays.asList("kola","fanta","su","pepsi","çay"));
		assertThat(icecekler2).have(controlIcecekler());

	}
	@Test
	public void testDoubleListV2() {
		List<String> icecekler3 = new ArrayList<String>(Arrays.asList("kola","fanta","su","pepsi","çay","maden suyu"));
		assertThat(icecekler3).have(controlIcecekler());

	}
	private Condition<? super String> controlIcecekler() { 
		return new Condition<String>() {
			@Override
			public boolean matches(String value) {
				// TODO Auto-generated method stub
				return icecekler.contains(value);
			}
		};
	}
	
}
