package Java8.project3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class How_To_Use_List {

	public static void main(String[] args) {
        
		int[] number = {12, 21, 34, 46, 52, 61, 72, 86, 93, 10};
		List<Integer> list1 = Arrays.stream(number).boxed().collect(Collectors.toList());
		
		// output : list : [12, 21, 34, 46, 52, 61, 72, 86, 93, 10]
		System.out.println("list : " + list1);  

		String[] alphabet = new String[]{"ALİ", "CELAL", "DERYA", "ACUN", "MEHMET"};

		List<String> list = Arrays.asList(alphabet);

		if (list.contains("ALİ") || list.contains("BİLAL")) {
		    System.out.println("1. Hello ALİ or BİLAL");	// output : 1. Hello ALİ or BİLAL
		}

		if (list.containsAll(Arrays.asList("ALİ", "BİLAL"))) {
		    System.out.println("2. Hello ALİ or BİLAL");	// don't work
		}

		if (list.containsAll(Arrays.asList("ALİ", "DERYA"))) {
		    System.out.println("3. Hello ALİ and DERYA");	// output : 3. Hello ALİ and DERYA
		}

	}

}
