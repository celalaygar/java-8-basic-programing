package Thread_Basics_2_0.Threads_Priority;

import java.util.concurrent.TimeUnit;

public class Thread_Priority_Example_2 extends Thread {
	public void run() {
		String threadName= Thread.currentThread().getName() ;
		
		System.out.println(threadName+ " started running with "+Thread.currentThread().getPriority());
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " ended with "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Thread_Priority_Example_2 t1 = new Thread_Priority_Example_2();
		Thread_Priority_Example_2 t2 = new Thread_Priority_Example_2();
		Thread_Priority_Example_2 t3 = new Thread_Priority_Example_2();

		t1.setName("Thread t1");
		t2.setName("Thread t2");
		t3.setName("Thread t3");

		System.out.println("t1 thread priority : " + t1.getPriority()); // Default 5
		System.out.println("t2 thread priority : " + t2.getPriority()); // Default 5
		System.out.println("t3 thread priority : " + t3.getPriority()); // Default 5

		t1.setPriority(5);
		t2.setPriority(1);
		t3.setPriority(10);

		// t3.setPriority(21); will throw IllegalArgumentException
		System.out.println("t1 thread priority : " + t1.getPriority()); // 5
		System.out.println("t2 thread priority : " + t2.getPriority()); // 1
		System.out.println("t3 thread priority : " + t3.getPriority()); // 10
	
		// Main thread
		System.out.print(Thread.currentThread().getName());
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

		// Main thread priority is set to 10
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
		
		System.out.println("------------------------------------");
		t1.start();
		t2.start();
		t3.start();

	}

}
