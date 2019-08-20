package Thread_Basics_2_5.Thread_Interrupts;

import java.util.concurrent.TimeUnit;

public class ThreadInterruptExample {

	public static void main(String[] args) throws InterruptedException {
		Task task1 = new Task();
		Thread thread1 = new Thread(task1);
		thread1.start();
		while (true) {
			if (Math.random() > 0.5) {
				thread1.interrupt();
				break;
			}
			TimeUnit. SECONDS.sleep(5);
		}
	}

	private static class Task implements Runnable {

		
		public void run() {
			int c = 0;

			while (true) {

				System.out.println("task running .. " + ++c);
				if (Thread.currentThread().isInterrupted()) {
					System.out.println("Thread interrupt ........ interrupted flag=true");
					terminate();
					return;
				}
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					System.out.println("interrupted exception ");
					terminate();
					return;
				}
			}

		}

		private void terminate() {
			System.out.println("Terminating task");
		}
	}
}
