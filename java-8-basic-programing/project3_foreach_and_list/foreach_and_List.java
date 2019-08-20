package Java8.project3;

import java.util.ArrayList;
import java.util.List;

public class foreach_and_List {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("1");
		items.add("2");
		items.add("3");
		items.add("4");
		items.add("5");
		items.add("6");
		items.add("7");
		
		// output : 1 2 3 4 5 6 7 
		for(String item : items){
			System.out.print(item+" ");
		}
		System.out.println("\n");
		
		// output : 1 2 3 4 5 6 7 
		items.forEach(item->System.out.print(item+" ")); 
		System.out.println("\n");
		
		 // output : 1234567
		items.forEach(System.out::print); 		
		System.out.println("\n");
		
		// output : 3
		items.forEach(item->{
			if("3".equals(item)){
				System.out.println(item); 	
			}
		});
		
		// output : list : [12, 21, 34, 46, 52, 61, 72, 86, 93, 10]
		int[] number = {12, 21, 34, 46, 52, 61, 72, 86, 93, 10};
        	List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
       		System.out.println("list : " + list);  		
        
	}

}
