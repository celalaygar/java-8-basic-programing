package Java8.project4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class filter_a_map_3 {

	public static void main(String[] args) {
		
		Map<Integer, String> HOSTING = new HashMap<>();
		HOSTING.put(1, " mynet.com ");
		HOSTING.put(2, " gmail.com ");
		HOSTING.put(3, " sahadan.com ");
		HOSTING.put(4, " mackolik.com ");
		HOSTING.put(5, " google.com ");
		HOSTING.put(6, " www.yahoo.com ");
		HOSTING.put(7, " www2.haberler.com ");

		// output :  {2= gmail.com }
		Map<Integer, String> filteredMap = filterByValue(HOSTING, x -> x.contains("gmail"));
		System.out.println(filteredMap);

		// output :  {3= sahadan.com , 6= www.yahoo.com , 7= www2.haberler.com }
		Map<Integer, String> filteredMap2 = filterByValue(HOSTING, x -> (x.contains("sahadan") || x.contains("www")));
		System.out.println(filteredMap2);

		// output :  {1= mynet.com , 2= gmail.com , 3= sahadan.com , 4= mackolik.com , 5= google.com }
		Map<Integer, String> filteredMap3 = filterByValue(HOSTING, x -> (x.contains("com") && !x.contains("www")));
		System.out.println(filteredMap3);

		// output :  {1= mynet.com , 2= gmail.com , 3= sahadan.com , 5= google.com }
		Map<Integer, String> filteredMap4 = filterByValue(HOSTING, x -> (x.length() <= 13));
		System.out.println(filteredMap4);

	}
	// Generic Map filterbyvalue, with predicate
	public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
		return map.entrySet()
			.stream()
			.filter(x -> predicate.test(x.getValue()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    	}
}
