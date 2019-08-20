package Thread_Basics_2_2.Yielding_Thread;

public class Without_yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Task task1 = new Task();
        Task task2 = new Task();
        new Thread(task1).start();

        new Thread(task2).start();
    }

    private static class Task implements Runnable {
        private int c;

        public void run () {
            String threadName = Thread.currentThread()
                                      .getName();

            System.out.println(threadName + " started.");
            for (int i = 0; i < 1000; i++) {
                c++;
            }

            System.out.println(threadName + " ended.");
        }
    }
//	output : 
//    Thread-0 started.
//    Thread-0 ended.
//    Thread-1 started.
//    Thread-1 ended.

}

