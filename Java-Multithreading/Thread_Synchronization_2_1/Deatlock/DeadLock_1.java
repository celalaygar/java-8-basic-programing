package Thread_Synchronization_2_1.Deatlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadLock_1 {

	public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 7, 9, 11));

        Thread thread1 = new Thread(() -> {
        	System.out.println("\n"+Thread.currentThread().getName()+" before list2 ------------------------------");
            for (Integer integer : list2) 
    			System.out.print(" "+integer);
            
            moveListItem(list1, list2, 2);
            System.out.println("\n"+Thread.currentThread().getName()+" after list2 -------------------------------");
            for (Integer integer : list2) 
    			System.out.print(" "+integer);
    		
        });
        Thread thread2 = new Thread(() -> {
        	System.out.println("\n"+Thread.currentThread().getName()+" before list2 ------------------------------");
            for (Integer integer : list2) 
    			System.out.print(" "+integer);

            moveListItem(list2, list1, 9);
        	
            System.out.println("\n"+Thread.currentThread().getName()+" after list2 -------------------------------");
            for (Integer integer : list2) 
    			System.out.print(" "+integer);
        });

        thread1.setName("Thread_1");
        thread2.setName("Thread_2");
        thread1.start();
        //thread2.start();
        

    }

    private static void moveListItem (List<Integer> from, List<Integer> to, Integer item) {
        synchronized (from) {
            synchronized (to) {
                if(from.remove(item)){
                  to.add(item);
                }
            }
        }
    }
//	output : 
//    Thread_1 before list2 ------------------------------
//    1 3 7 9 11
//   Thread_1 after list2 -------------------------------
//    1 3 7 9 11 2
}
