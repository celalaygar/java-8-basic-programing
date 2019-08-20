package Java8.project1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8_group_by_Example {
	

	public static void main(String[] args) {
		
	      //3 apple, 2 banana, others 1
		List<Item> items = Arrays.asList(  	
			new Item("banana", 20, new BigDecimal("19.99")),
			new Item("orang", 10, new BigDecimal("29.99")),
			new Item("watermelon", 10, new BigDecimal("29.99")),
			new Item("papaya", 20, new BigDecimal("9.99")),
			new Item("apple", 10, new BigDecimal("9.99")),
			new Item("banana", 10, new BigDecimal("19.99")),
			new Item("apple", 20, new BigDecimal("9.99"))             
		);

		System.out.println("--------------------------");
		Map<String, Long> counting = items.stream().collect(
			Collectors.groupingBy(Item::getName, Collectors.counting()));

		System.out.println("--------------------------");
		System.out.println(counting);

		System.out.println("--------------------------");
		Map<String, Integer> sum = items.stream().collect(
			Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

		System.out.println("--------------------------");
		System.out.println(sum);	

	}
	
}
