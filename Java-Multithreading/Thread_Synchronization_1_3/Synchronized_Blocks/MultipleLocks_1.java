package Thread_Synchronization_1_3.Synchronized_Blocks;

import java.util.ArrayList;
import java.util.List;

public class MultipleLocks_1 {
	private List<String> list;
	private List<String> list2;

	public static void main(String[] args) throws InterruptedException {
		MultipleLocks_1 obj = new MultipleLocks_1();

		Thread thread1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " getList : " + System.identityHashCode(obj.getList()));
			System.out.println(Thread.currentThread().getName() + " getList2 : " + System.identityHashCode(obj.getList2()));
		});
		Thread thread2 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " getList : " + System.identityHashCode(obj.getList()));
			System.out.println(Thread.currentThread().getName() + " getList2 : " + System.identityHashCode(obj.getList2()));
		});

		Thread thread3 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " getList : " + System.identityHashCode(obj.getList()));
			System.out.println(Thread.currentThread().getName() + " getList2 : " + System.identityHashCode(obj.getList2()));
		});
		thread1.setName("Thread_1");
		thread2.setName("Thread_2");
		thread3.setName("Thread_3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

	private List<String> getList() {
		if (list == null) {
			list = new ArrayList<>();
		}
		return list;
	}

	private List<String> getList2() {
		if (list2 == null) {
			synchronized(new Object()) {
				list2 = new ArrayList<>();
			}
		}
		return list2;
	}
//	output :
//	Thread_1 getList : 1703065004
//	Thread_1 getList2 : 1799702380
//	Thread_3 getList : 518055154
//	Thread_3 getList2 : 1799702380
//	Thread_2 getList : 1813610240
//	Thread_2 getList2 : 1799702380
}
