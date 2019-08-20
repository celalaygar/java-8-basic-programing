package Java8.project4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class filter_a_map {

	public static void main(String[] args) {
		Map<Integer, String> HOSTING = new HashMap<>();
		HOSTING.put(1, "mynet.com");
		HOSTING.put(2, "gmail.com");
		HOSTING.put(3, "sahadan.com");
		HOSTING.put(4, "mackolik.com");
		HOSTING.put(5, "google.com");
		HOSTING.put(6, "yahoo.com");
		HOSTING.put(7, "haberler.com");

		// Before Java 8
		String result = "";
		for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) {
		    if ("google.com".equals(entry.getValue())) {
			result = entry.getValue();
		    }
		}
		//output : Before Java 8 : google.com
		System.out.println("Before Java 8 : " + result);

		//Map -> Stream -> Filter -> String
		result = HOSTING.entrySet().stream()
			.filter(map -> "google.com".equals(map.getValue()))
			.map(map -> map.getValue())
			.collect(Collectors.joining());

		//output : With Java 8 : google.com
		System.out.println("With Java 8 : " + result);

		// filter more values
		result = HOSTING.entrySet().stream()
			.filter(x -> {
			    if (!x.getValue().contains("google") && !x.getValue().contains("haberler")) {
				return true;
			    }
			    return false;
			})
			.map(map -> map.getValue())
			.collect(Collectors.joining(","));
		// output : With Java 8 : mynet.com,gmail.com,sahadan.com,mackolik.com,yahoo.com
		System.out.println("With Java 8 : " + result);
	}

}
