import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------");
		// Creating a TreeMap
		SortedMap<String, String> fileExtensions = new TreeMap<>();

		// Adding new key-value pairs to a TreeMap
		fileExtensions.put("python", ".py");
		fileExtensions.put("c++", ".cpp");
		fileExtensions.put("kotlin", ".kt");
		fileExtensions.put("golang", ".go");
		fileExtensions.put("java", ".java");
		
		System.out.println(fileExtensions);

		System.out.println("---------------------------------------------");
		SortedMap<String, String> fileExtensions2 = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});

		// Adding new key-value pairs to a TreeMap
		fileExtensions2.put("python", ".py1");
		fileExtensions2.put("c++", ".cpp1");
		fileExtensions2.put("kotlin", ".kt1");
		fileExtensions2.put("golang", ".go1");
		fileExtensions2.put("java", ".java1");
		fileExtensions2.put("python2", ".py2");
		fileExtensions2.put("dotnet", ".net1");
		fileExtensions2.put("c2", ".c1");
		fileExtensions2.put("c1", ".c2");

		System.out.println(fileExtensions2);
		
		
		// OUTPUT : 
//		---------------------------------------------
//		{c++=.cpp, golang=.go, java=.java, kotlin=.kt, python=.py}
//		---------------------------------------------
//		{python2=.py2, python=.py1, kotlin=.kt1, java=.java1, golang=.go1, dotnet=.net1, c2=.c1, c1=.c2, c++=.cpp1}
	}
}
