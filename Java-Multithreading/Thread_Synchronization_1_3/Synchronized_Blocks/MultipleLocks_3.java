package Thread_Synchronization_1_3.Synchronized_Blocks;

import java.util.ArrayList;
import java.util.List;

public class MultipleLocks_3 {
	private List<String> list1 = new ArrayList<>();
	private List<String> list2 = new ArrayList<>();

	public static void main(String[] args) {
		MultipleLocks_3 obj = new MultipleLocks_3();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                
                obj.addToList1(Thread.currentThread().getName()+" list1 =" + i);
                obj.addToList2(Thread.currentThread().getName()+" list2 =" + i);
                obj.printLists();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                obj.addToList1(Thread.currentThread().getName()+" list1 =" + i);
                obj.addToList2(Thread.currentThread().getName()+" list2 =" + i);
                obj.printLists();
            }
        });
        thread1.setName("Thread_1");
        thread2.setName("Thread_2");
        thread1.start();
        thread2.start();
    }

	public void addToList1(String s) {
		synchronized (list1) {
			list1.add(s);
		}
	}

	public void addToList2(String s) {
		synchronized (list2) {
			list2.add(s);
		}
	}

	public void printLists() {
		String name = Thread.currentThread().getName();

		synchronized (list1) {
			list1.stream().forEach(l -> System.out.println(name + " : " + l));
		}
		synchronized (list2) {
			list2.stream().forEach(l -> System.out.println(name + " : " + l));
		}
	}
}
