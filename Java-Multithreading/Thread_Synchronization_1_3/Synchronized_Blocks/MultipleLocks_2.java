package Thread_Synchronization_1_3.Synchronized_Blocks;

import java.util.ArrayList;
import java.util.List;

public class MultipleLocks_2 {

	private volatile List<String> list1;
	private volatile List<String> list2;
	private final Object lock1 = new Object();
	private final Object lock2 = new Object();

	public static void main(String[] args) throws InterruptedException {
		MultipleLocks_2 obj = new MultipleLocks_2();

		Thread thread1 = new Thread(() -> {
			System.out
					.println(Thread.currentThread().getName() + " getList1() : " + System.identityHashCode(obj.getList1()));
			System.out
					.println(Thread.currentThread().getName() + " getList2() : " + System.identityHashCode(obj.getList2()));
		});
		Thread thread2 = new Thread(() -> {
			System.out
					.println(Thread.currentThread().getName() + " getList1() : " + System.identityHashCode(obj.getList1()));
			System.out
					.println(Thread.currentThread().getName() + " getList2() : " + System.identityHashCode(obj.getList2()));
		});
		Thread thread3 = new Thread(() -> {
			System.out
					.println(Thread.currentThread().getName() + " getList1() : " + System.identityHashCode(obj.getList1()));
			System.out
					.println(Thread.currentThread().getName() + " getList2() : " + System.identityHashCode(obj.getList2()));
		});
		thread1.setName("Thread_1");
		thread2.setName("Thread_2");
		thread3.setName("Thread_3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

	private List<String> getList1() {
		if (list1 == null) {
			synchronized (lock1) {
				if (list1 == null) {
					list1 = new ArrayList<>();
				}
			}
		}
		return list1;
	}

	private List<String> getList2() {
		if (list2 == null) {
			synchronized (lock2) {
				if (list2 == null) {
					list2 = new ArrayList<>();
				}
			}
		}
		return list2;
	}
	
//	output : 
//	Thread_1 getList1() : 863046914
//	Thread_1 getList2() : 1035400476
//	Thread_2 getList1() : 863046914
//	Thread_3 getList1() : 863046914
//	Thread_3 getList2() : 1035400476
//	Thread_2 getList2() : 1035400476

}
