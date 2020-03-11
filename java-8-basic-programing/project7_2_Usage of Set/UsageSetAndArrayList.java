package aaa.com.celal.arrayAndStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UsageSetAndArrayList {
	static List<String> list = Arrays.asList("a","b","c","b","a","a","b","a","d","e","e");
	static Set<String> setList1  = new HashSet<>(list);
	static Set<String> setList2  = new HashSet<>();
	public static void main(String[] args) {
		System.out.println("setList1 : "+setList1);
		System.out.println("setList2 : "+setList2);
		for (String value : setList1) { 
			if(setList1.contains(value)) {
				setList2.remove(value);
				setList2.add( value+" "+Collections.frequency(list, value));
			} else  System.out.println("false");
		}  
		
		Iterator<String> i = setList2.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		
//		output : 
//		setList1 : [a, b, c, d, e]
//		setList2 : []
//		a 4
//		b 3
//		d 1
//		c 1
//		e 2
	}

}
