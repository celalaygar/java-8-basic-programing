import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();

		// Adding elements into HashSet usind add()
		h.add("India");
		h.add("Japan");
		h.add("Australia");
		h.add("England");
		h.add("South Africa");
		// adding duplicate elements
		h.add("India");

		System.out.println(h);
		System.out.println("List contains India or not : " + h.contains("India"));
		System.out.println("List contains Turkey or not : " + h.contains("Turkey"));

		// Removing items from HashSet using remove()
		h.remove("Australia");
		System.out.println("List after removing Australia : " + h);

		ArrayList<String> arrayList = new ArrayList<String>(h);
		arrayList.forEach(System.out::println);

		System.out.println("--------------------------------------------------");

		// Iterating over hash set items
		System.out.println("Iterating over list : ");
		Iterator<String> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		
//		OUTPUT :
//		[Japan, England, South Africa, Australia, India]
//		List contains India or not : true
//		List contains Turkey or not : false
//		List after removing Australia : [Japan, England, South Africa, India]
//		Japan
//		England
//		South Africa
//		India
//		--------------------------------------------------
//		Iterating over list : 
//		Japan
//		England
//		South Africa
//		India
	}

}
