package Thread_Synchronization_2_1.Deatlock;

public class DeadLock_3_Solution {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String[] args) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
        T1.setName("Thread_1");
        T2.setName("Thread_2");
		T1.start();
		T2.start();
	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println(Thread.currentThread().getName()+" : Holding lock 1...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName()+" : Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println(Thread.currentThread().getName()+ " : Holding lock 1 & 2...");
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println(Thread.currentThread().getName()+" : Holding lock 1...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName()+" : Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println(Thread.currentThread().getName()+" : Holding lock 1 & 2...");
				}
			}
		}
	}
//	output : 
//	Thread_1 : Holding lock 1...
//	Thread_1 : Waiting for lock 2...
//	Thread_1 : Holding lock 1 & 2...
//	Thread_2 : Holding lock 1...
//	Thread_2 : Waiting for lock 2...
//	Thread_2 : Holding lock 1 & 2...
}
