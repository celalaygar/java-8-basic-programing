package Java8.project4_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter_collect_List_3 {

	public static void main(String[] args) {

		List<Car> car = Arrays.asList(
			new Car("Opel", 2001),
			new Car("Mazda", 2005),
			new Car("peugeot", 2015),
			new Car("ferrari", 2018),
			new Car("Mercedes", 2004)
		);

		Car result1 = car.stream()
			.filter((p) -> "peugeot".equals(p.getName()) && 2015 == p.getModel())
			.findAny()
			.orElse(null);

		System.out.println("result 1 :" + result1);

		//or like this
		Car result2 = car.stream()
			.filter(p -> {
			    if ("peugeot".equals(p.getName()) && 20 == p.getModel()) {
				return true;
			    }
			    return false;
			}).findAny()
			.orElse(null);

		System.out.println("result 2 :" + result2);
		
	}
}
