package Java8.project1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8_Counting_Example {

	public static void main(String[] args) {
		// {papaya=1, orange=2, banana=2, apple=5, lemon=1, melon=5}
		List<String> items = Arrays.asList(
				"apple", "apple", "melon", "apple", "apple", "melon", "banana", "apple",
				"melon", "orange", "orange", "banana", "melon", "papaya", "melon", "lemon");

		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);
	}

}
