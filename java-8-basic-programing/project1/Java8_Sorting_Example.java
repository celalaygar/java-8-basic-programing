package Java8.project1;

import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8_Sorting_Example {
	public static void main(String[] args) {
		
		
		//{melon=5, apple=4, orange=3, banana=2, papaya=1, lemon=1}
		List<String> items = Arrays.asList(
				"apple", "apple", "melon", "apple",  "melon", "banana", "apple",
				"melon", "orange", "orange","orange", "banana", "melon", "papaya", "melon", "lemon");
		Map<String, Long> result =
			items.stream().collect(
				Collectors.groupingBy(
					Function.identity(), Collectors.counting()
				)
			);
		System.out.println("-------------------------------------");
		Map<String, Long> finalMap = new LinkedHashMap<>();

		//Sort a map and add to finalMap
		result.entrySet().stream()
			.sorted(Map.Entry.<String, Long>comparingByValue()
				.reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

		System.out.println(finalMap);

	}
}
