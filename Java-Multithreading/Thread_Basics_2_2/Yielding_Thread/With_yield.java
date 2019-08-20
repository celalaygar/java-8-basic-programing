package Thread_Basics_2_2.Yielding_Thread;
/*
 * Thread.yield() method causes the currently executing thread object 
 * to temporarily pause and allow other threads to execute. 
 */
public class With_yield {
	public static void main(String[] args) {
		Task task1 = new Task(true);
		new Thread(task1).start();

		Task task2 = new Task(true);
		new Thread(task2).start();

		Task task3 = new Task(false);
		new Thread(task3).start();
	}

	private static class Task implements Runnable {
		private final boolean shouldYield;
		private int c;

		public Task(boolean shouldYield) {
			this.shouldYield = shouldYield;
		}

		public void run() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " started.");
			for (int i = 0; i < 1000; i++) {
				c++;
				if (shouldYield) {
					Thread.yield();
				}
			}
			System.out.println(threadName + " ended.");
		}
	}
//	output : 
//	Thread-0 started.
//	Thread-1 started.
//	Thread-2 started.
//	Thread-2 ended.
//	Thread-0 ended.
//	Thread-1 ended.
}
