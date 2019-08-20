package Java8.project2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class TestSorting {

	public static void main(String[] args) {

		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("fatih", new BigDecimal("70000"), 33));
		result.add(new Developer("celal", new BigDecimal("80000"), 20));
		result.add(new Developer("ronaldo", new BigDecimal("100000"), 10));
		result.add(new Developer("recep", new BigDecimal("20000"), 15));
		result.add(new Developer("neymar", new BigDecimal("30000"), 25));
		result.add(new Developer("acun", new BigDecimal("170000"), 55));
		result.add(new Developer("sabancý", new BigDecimal("13000"), 85));
		result.add(new Developer("koç", new BigDecimal("11000"), 45));
		System.out.println("Before Sort ----------------------------");
		for (Developer developer : result) {
			System.out.println(i+" : "+developer.getName()+" "+developer.getAge()+" "+developer.getPrice()+" ");
		}

		// sort by age
		Collections.sort(result, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println("After Sort for age ----------------------------");
		for (Developer developer : result) {
			System.out.println(i+" : "+developer.getAge()+" "+developer.getName()+" "+developer.getPrice()+" ");
			i++;
		}

		//sort by name	
		Collections.sort(result, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("After Sort for name ----------------------------");
		for (Developer developer : result) {
			System.out.println(i+" : "+developer.getName()+" "+developer.getAge()+" "+developer.getPrice()+" ");
		}
		
		//sort by salary
		Collections.sort(result, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getPrice().compareTo(o2.getPrice());
			}
		});
		System.out.println("After Sort for price ----------------------------");
		for (Developer developer : result) {
			System.out.println(i+" : "+developer.getPrice()+" "+developer.getName()+" "+developer.getAge()+" ");
		}
	}
}
