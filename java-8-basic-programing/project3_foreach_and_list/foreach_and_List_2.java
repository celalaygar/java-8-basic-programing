package Java8.project3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class foreach_and_List_2 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("fatih");
		items.add("bilal");
		items.add("feride");
		items.add("gül");
		items.add("haydar");
		items.add("tolga");
		items.add("zeki");
		
		// output : fatih bilal feride gül haydar tolga zeki 
		for(String item : items){
			System.out.print(item+" "); 
		}
		System.out.println("\n"); 		
	
		// output : fatih bilal feride gül haydar tolga zeki 
		items.forEach(item->System.out.print(item+" "));
		System.out.println("\n"); 	
		
		// output : fatihbilalferidegülhaydartolgazeki
		items.forEach(System.out::print); 		
		System.out.println("\n");	
		
		// output : haydar
		items.forEach(item->{
			if("haydar".equals(item)){
				System.out.println(item); 	
			}
		});
		
		List<String> alphaUpper = new ArrayList<>();
		for (String s : items) {
		    alphaUpper.add(s.toUpperCase());
		}

		System.out.println(items); 	// output : [fatih, bilal, feride, gül, haydar, tolga, zeki]
		System.out.println(alphaUpper); // output : [FATİH, BİLAL, FERİDE, GÜL, HAYDAR, TOLGA, ZEKİ]

		// Java 8
		List<String> collect = items.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(collect);	// output : [FATİÝH, BİLAL, FERİDE, GÜL, HAYDAR, TOLGA, ZEKİ]

	}

}
