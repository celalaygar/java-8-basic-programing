package Thread_Basics_2_1.Threads_Priority;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {
	private int c;


    @Override
    public void run () {
        String threadName = Thread.currentThread()
                                  .getName();
        System.out.println(threadName + " started.");
        for (int i = 0; i < 5; i++) {
            c++;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " ended.");
    }
}
