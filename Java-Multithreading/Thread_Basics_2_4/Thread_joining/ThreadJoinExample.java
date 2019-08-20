package Thread_Basics_2_4.Thread_joining;

/*
 * Thread.join() method waits for this thread to die.
 * 
 */
public class ThreadJoinExample {

	public static void main(String[] args) throws InterruptedException {
		Task task1 = new Task();
		Thread thread1 = new Thread(task1);
		thread1.start();
		thread1.join();// here the main thread will wait until thread1 fishes.
		System.out.println("after join");

		Task task2 = new Task();
		new Thread(task2).start();
	}

	private static class Task implements Runnable {

		
		public void run() {
			int c = 0;
			String threadName = Thread.currentThread().getName();

			System.out.println(threadName + " started.");
			for (int i = 0; i < 1000; i++) {
				c += i;
			}

			System.out.println(threadName + " ended.");
		}
	}
	
//	output : 
//	Thread-0 started.
//	Thread-0 ended.
//	after join
//	Thread-1 started.
//	Thread-1 ended.
}
