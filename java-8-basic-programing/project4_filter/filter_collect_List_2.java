package Java8.project4_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter_collect_List_2 {

	public static void main(String[] args) {

		List<Car> car = Arrays.asList(
			new Car("Opel", 2001),
			new Car("Mazda", 2005),
			new Car("peugeot", 2015),
			new Car("ferrari", 2018),
			new Car("Mercedes", 2004)
		);

		Car result1 = car.stream()                       	// Convert to steam
			.filter(x -> "Mercedes".equals(x.getName()))    // we want "Mercedes" only
			.findAny()                                      // If 'findAny' then return found
			.orElse(null);                                  // If not found, return null

		//Mercedes 2004
		System.out.println(result1.getName()+" "+result1.getModel());

		Car result2 = car.stream()
			.filter(x -> "jaguar".equals(x.getName()))
			.findAny()
			.orElse(null);
		//null
		System.out.println(result2);
		
	}

}
