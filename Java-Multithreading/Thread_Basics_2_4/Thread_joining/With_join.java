package Thread_Basics_2_4.Thread_joining;

/*
 * Thread.join() method waits for this thread to die.
 * 
 */
public class With_join implements Runnable {

	public void run() {
		Thread t = Thread.currentThread();
		// checks if current thread is alive
		System.out.println("Current thread: " + t.getName() + " Is it Alive? " + t.isAlive());

	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new With_join());
		t.start();

		// Waits for 1000ms this thread to die.
		t.join(1000);

		System.out.println("Joining Method is beeing used after 1000" + " mili seconds: -------------------------");

		// Checks if this thread is alive
		System.out.println("Current thread : " + t.getName() + " Is it alive? " + t.isAlive());
	}
//	output : 
//	Current thread: Thread-0 Is it Alive? true
//	Joining Method is beeing used after 1000 mili seconds: -------------------------
//	Current thread : Thread-0 Is it alive? false

}
