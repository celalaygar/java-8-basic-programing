package Java8.project5_4_Arrays_and_JoinArray;

import java.util.Arrays;
import java.util.List;

public class String_Arrays {

	public static void main(String[] args) {
		String[] alphabet = new String[]{"Java", "Python", "C#", "C++","Spring","Dijango"};

		// Convert String Array to List
		List<String> list = Arrays.asList(alphabet);

		if( list.contains("Python") && !list.contains("Ruby") )
		    System.out.println("Hello Python Not Ruby");  // output : Hello Python  Not Ruby

		if (list.containsAll(Arrays.asList("C++", "Dijango"))) {
		    System.out.println("Hello C++ and Dijango");  // output : Hello C++ and Dijango
		}

		// Convert to stream
		boolean result = Arrays.stream(alphabet).anyMatch("C#"::equals);
		if (result) 
			System.out.println("Hello C#");  // output : Hello C#

	}

}
