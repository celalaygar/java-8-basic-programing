import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<String>(); 
        
        // Elements are added using add() method 
        ts1.add("A");	ts1.add("B"); 	ts1.add("C");
        ts1.add("D");	ts1.add("E");	ts1.add("F");  
  
        // Duplicates will not get insert 
        ts1.add("C"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
	}

}
