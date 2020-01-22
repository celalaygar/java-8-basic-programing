import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
        Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("DotNet"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Set");
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
        hash_Set.add("Java"); 
        List<String> list = new ArrayList<String>(hash_Set);
        System.out.println("hash_Set  :"+ hash_Set); 
        System.out.println(list.get(0));

        Set<String> hash_Set2 = new HashSet<String>(); 
        hash_Set2.add("Geeks"); 
        hash_Set2.add("For");
        hash_Set2.add("Data");
//        System.out.println("Before Removing--------------------------------------");
//        System.out.println("hash_Set  :"+ hash_Set); 
//        System.out.println("hash_Set2 :"+ hash_Set2); 

//        System.out.println("After retaining--------------------------------------");
//        System.out.println("retainAll " + hash_Set.retainAll(hash_Set2)); 
//        System.out.println("hash_Set  :"+ hash_Set); 
//        System.out.println("hash_Set  size :  "+ hash_Set.size()); 
        System.out.println("After removing--------------------------------------");
		System.out.println("removeAll " + hash_Set.removeAll(hash_Set2)); 
        System.out.println("hash_Set  :"+ hash_Set); 
        System.out.println("hash_Set2 :"+ hash_Set2); 
        // Set deonstration using TreeSet 
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
        System.out.println(tree_Set); 
        
        
//		OUTPUT : 
//      hash_Set  :[Java, Set, Example, Geeks, For, DotNet]
//		Java
//		After removing--------------------------------------
//		removeAll true
//		hash_Set  :[Java, Set, Example, DotNet]
//		hash_Set2 :[Geeks, For, Data]
//		Sorted Set after passing into TreeSet[DotNet, Example, Java, Set]
	}

}
