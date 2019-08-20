package Thread_Basics_2_6.Threads_States;
/*
 * 
 * TIMED_WAITING example
 * 
 * */
public class Thread_States_2 {

	public static void main(String[] args) {
		MyTask2 t = new MyTask2();
		t.setName("Thread_1");
		runExampleThread(t);
	}

	private static class MyTask2 extends Thread {
		@Override
		public void run() {
			printState("thread run() started", this);
			try {
				// this will put the thread in TIMED_WAITING state
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printState("thread finishing", this);
			
		}
	}
	static void runExampleThread(Thread t) {
		printState("thread before start()", t);
		t.start();
		printState("thread start() called", t);
		try {
			printState("first - - main thread started sleeping ", t);
			Thread.sleep(500);
			printState("second - - main thread contunie sleeping", t);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printState("main thread woke up", t);

		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			printState("shutting down", t);
		}));
	}
	
	static void printState(String msg, Thread t) {
		System.out.println(t.getName()+" : "+msg+" -  state : "+ t.getState()+"...");
	}

//  output : 
//	Thread_1 : thread before start() -  state : NEW...
//	Thread_1 : thread start() called -  state : RUNNABLE...
//	Thread_1 : first - - main thread started sleeping  -  state : RUNNABLE...
//	Thread_1 : thread run() started -  state : RUNNABLE...
//	Thread_1 : thread finishing -  state : RUNNABLE...
//	Thread_1 : second - - main thread contunie sleeping -  state : TIMED_WAITING...
//	Thread_1 : main thread woke up -  state : TIMED_WAITING...
//	Thread_1 : shutting down -  state : TERMINATED...

	
	
}
