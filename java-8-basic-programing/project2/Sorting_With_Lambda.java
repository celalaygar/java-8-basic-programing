package Java8.project2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class TestSorting_With_Lambda {

	public static void main(String[] args) {

		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("fatih", new BigDecimal("70000"), 33));
		result.add(new Developer("celal", new BigDecimal("80000"), 20));
		result.add(new Developer("ronaldo", new BigDecimal("100000"), 10));
		result.add(new Developer("recep", new BigDecimal("20000"), 15));
		result.add(new Developer("neymar", new BigDecimal("30000"), 25));
		result.add(new Developer("acun", new BigDecimal("170000"), 55));
		result.add(new Developer("sabancı", new BigDecimal("13000"), 85));
		result.add(new Developer("koç", new BigDecimal("11000"), 45));
		System.out.println("Before Sort ----------------------------");
		
		int i =1;
		for (Developer developer : result) {
			System.out.println(i+" : "+developer.getName()+" "+developer.getAge()+" "+developer.getPrice()+" ");
			i++;
		}
		//lambda here!
		System.out.println("Sorting for age ----------------------------");
		result.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
		result.forEach((developer)->System.out.println(developer.getAge()+" "+developer.getName()+" "+developer.getPrice()));

		System.out.println("Sorting for name ----------------------------");
		result.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));
		result.forEach((developer)->System.out.println(developer.getName()+" "+developer.getAge()+" "+developer.getPrice()));
		
		System.out.println("Sorting for price ----------------------------");
		result.sort((Developer o1, Developer o2)->o1.getPrice().compareTo(o2.getPrice()));
		result.forEach((developer)->System.out.println(developer.getPrice()+" "+developer.getName()+" "+developer.getAge()));	
	}
}
