package Java8.project4_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter_collect_List {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("spring", "core", "aop", "jpa", "hibernate");

		List<String> result = lines.stream()		// convert list to stream
			.filter(line -> !"core".equals(line))	// we dont like core
			.collect(Collectors.toList());		// collect the output and convert streams to a List

		result.forEach(System.out::println);		//output : spring, aop jpa hibernate

	}

}
