package Thread_Synchronization_1_3.Synchronized_Blocks;

import java.util.ArrayList;
import java.util.List;

public class LazyInitBlock {
	private List<String> list;

	public static void main(String[] args)  throws InterruptedException {
		LazyInitBlock obj = new LazyInitBlock();

		Thread thread1 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName()+" : " + System.identityHashCode(obj.getList()));
		});
		Thread thread2 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName()+" : " + System.identityHashCode(obj.getList()));
		});

		Thread thread3 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName()+" : " + System.identityHashCode(obj.getList()));
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

//	output :
//	Thread_1 : 814244990
//	Thread_3 : 814244990
//	Thread_2 : 769505653
}
