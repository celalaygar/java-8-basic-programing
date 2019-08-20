package Thread_Synchronization_1_1.Thread_Interference_Synchronized;

public class ThreadSynchronizedDemo {
	private Integer counter = 0;

	public static void main(String[] args) {
		ThreadSynchronizedDemo demo = new ThreadSynchronizedDemo();
		Task task1 = demo.new Task();
		Thread thread1 = new Thread(task1);
		thread1.setName("First Thread");
		Task task2 = demo.new Task();
		Thread thread2 = new Thread(task2);
		thread2.setName("Second Thread");

		thread1.start();
		thread2.start();
	}

	private synchronized void performTask() {
		int temp = counter;
		counter++;
		System.out.println(Thread.currentThread().getName()+" "+temp + " - before: " + temp + " after:" + counter);
	}

	private class Task implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				performTask();
			}
		}
	}

//	output :
//	First Thread 0 - before: 0 after:1
//	First Thread 1 - before: 1 after:2
//	First Thread 2 - before: 2 after:3
//	First Thread 3 - before: 3 after:4
//	First Thread 4 - before: 4 after:5
//	Second Thread 5 - before: 5 after:6
//	Second Thread 6 - before: 6 after:7
//	Second Thread 7 - before: 7 after:8
//	Second Thread 8 - before: 8 after:9
//	Second Thread 9 - before: 9 after:10

}
