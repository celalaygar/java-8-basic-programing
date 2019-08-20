package Thread_Basics_2_4.Thread_joining;


/*
 * Thread.join() method waits for this thread to die.
 * 
 */
public class ThreadJoinExample3 implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread started: " + t.getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread ended: " + t.getName());

	}

	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new ThreadJoinExample3(), "th1");
		Thread th2 = new Thread(new ThreadJoinExample3(), "th2");
		Thread th3 = new Thread(new ThreadJoinExample3(), "th3");

		th1.start();
		th1.join();
		th2.start();
		th2.join();
		th3.start();
		th3.join();

		System.out.println("All three threads have finished execution");

	}
//	output : 
//	Thread started: th1
//	Thread ended: th1
//	Thread started: th2
//	Thread ended: th2
//	Thread started: th3
//	Thread ended: th3
//	All three threads have finished execution
}
