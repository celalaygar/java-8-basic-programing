package Thread_Basics_2_6.Threads_States;

/*
 * NEW, RUNNABLE, TERMINATED example
 * how to use getState getName
 * how to control states
 * */
public class Thread_States_1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyTask t1 = new MyTask();
		MyTask t2 = new MyTask();
		t1.setName("Thread_1");
		t2.setName("Thread_2");
		runExampleThread(t1);
		t1.join();
		runExampleThread(t2);
	}

	static void runExampleThread(Thread t) {
		printState("thread before start()", t);
		t.start();
		printState("thread start() called", t);
		try {
			printState("first - - main thread started sleeping ", t);
			Thread.sleep(500);
			printState("second - - main thread contunie sleeping", t);
			Thread.sleep(500);
			printState("third - - main thread started to stop sleeping", t);
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

	private static class MyTask extends Thread {

		@Override
		public void run() {
			printState("thread run() started", this);
			// doing something
			for (int i = 0; i < 100; i++) {
				Math.random();
			}
			printState("thread is finishing", this);
		}
	}
	
	
//  output : 
//	Thread_1 : thread before start() -  state : NEW...
//	Thread_1 : thread start() called -  state : RUNNABLE...
//	Thread_1 : first - - main thread started sleeping  -  state : RUNNABLE...
//	Thread_1 : thread run() started -  state : RUNNABLE...
//	Thread_1 : thread is finishing -  state : RUNNABLE...
//	Thread_1 : second - - main thread contunie sleeping -  state : TERMINATED...
//	Thread_1 : third - - main thread started to stop sleeping -  state : TERMINATED...
//	Thread_1 : main thread woke up -  state : TERMINATED...
//	Thread_2 : thread before start() -  state : NEW...
//	Thread_2 : thread start() called -  state : RUNNABLE...
//	Thread_2 : first - - main thread started sleeping  -  state : RUNNABLE...
//	Thread_2 : thread run() started -  state : RUNNABLE...
//	Thread_2 : thread is finishing -  state : RUNNABLE...
//	Thread_2 : second - - main thread contunie sleeping -  state : TERMINATED...
//	Thread_2 : third - - main thread started to stop sleeping -  state : TERMINATED...
//	Thread_2 : main thread woke up -  state : TERMINATED...
//	Thread_1 : shutting down -  state : TERMINATED...
//	Thread_2 : shutting down -  state : TERMINATED...

	
	
}
