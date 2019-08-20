package Thread_Basics_2_2.Yielding_Thread;

/*
 * Thread.yield() method causes the currently executing thread object 
 * to temporarily pause and allow other threads to execute. 
 */

public class Thread_Yield_Example_2 implements Runnable {

	Thread t;

	Thread_Yield_Example_2(String str) {

		t = new Thread(this, str);
		// this will call run() function
		t.start();
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			// yields control to another thread every 5 iterations
			if ((i % 3) == 0) {
				System.out.println(Thread.currentThread().getName() + " yielding control... i : " + i);

				Thread.yield();
			}
		}

		System.out.println(Thread.currentThread().getName() + " has finished executing.");
	}

	public static void main(String[] args) {
		new Thread_Yield_Example_2("Thread 1");
		new Thread_Yield_Example_2("Thread 2");
		new Thread_Yield_Example_2("Thread 3");
	}

//	output :
//	Thread 2 yielding control... i : 0
//	Thread 2 yielding control... i : 3
//	Thread 2 has finished executing.
//	Thread 1 yielding control... i : 0
//	Thread 3 yielding control... i : 0
//	Thread 1 yielding control... i : 3
//	Thread 1 has finished executing.
//	Thread 3 yielding control... i : 3
//	Thread 3 has finished executing.
}
