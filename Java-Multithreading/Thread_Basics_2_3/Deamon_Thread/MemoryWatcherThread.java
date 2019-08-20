package Thread_Basics_2_3.Deamon_Thread;

public class MemoryWatcherThread implements Runnable {
	public static void start() {
		Thread thread = new Thread(new MemoryWatcherThread());
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.setDaemon(false);
		thread.start();
	}

	public void run() {

		long memoryUsed = getMemoryUsed();
		System.out.println("First Memory used :" + memoryUsed + " MB");

		while (true) {
			long memoryUsed1 = getMemoryUsed();
			if (memoryUsed != memoryUsed1) {
				memoryUsed = memoryUsed1;
				System.out.println("Memory used :" + memoryUsed + " MB");
			}
		}
	}

	private long getMemoryUsed() {
		return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024;
	}
}