package Java8.project4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class filter_a_map_2 {

	public static void main(String[] args) {
		Map<Integer, String> HOSTING = new HashMap<>();
		HOSTING.put(1, " mynet.com ");
		HOSTING.put(2, " gmail.com ");
		HOSTING.put(3, " sahadan.com ");
		HOSTING.put(4, " mackolik.com ");
		HOSTING.put(5, " google.com ");
		HOSTING.put(6, " yahoo.com ");
		HOSTING.put(7, " haberler.com ");

		//Map -> Stream -> Filter -> Map
		Map<Integer, String> collect = HOSTING.entrySet().stream()
			.filter(map -> map.getKey() == 2)
			.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

		System.out.println(collect);		//output : {2= gmail.com }

		Map<Integer, String> collect2 = HOSTING.entrySet().stream()
			.filter(map -> map.getKey() <= 3)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(collect2);		//output : {1= mynet.com , 2= gmail.com , 3= sahadan.com }

	}

}
