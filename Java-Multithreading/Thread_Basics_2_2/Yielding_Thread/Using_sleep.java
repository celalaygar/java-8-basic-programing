package Thread_Basics_2_2.Yielding_Thread;


public class Using_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Task task1 = new Task();
        new Thread(task1).start();

        Task task2 = new Task();
        new Thread(task2).start();

        Task task3 = new Task();
        new Thread(task3).start();
    }

    private static class Task implements Runnable {
        private int c;

        public void run () {
            String threadName = Thread.currentThread()
                                      .getName();

            System.out.println(threadName + " started.");
            for (int i = 0; i < 5; i++) {
                c++;
                System.out.println(threadName+ " : "+c);
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            }

            System.out.println(threadName + " ended.");
        }
    }
}
