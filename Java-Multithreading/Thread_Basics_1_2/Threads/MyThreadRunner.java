package Thread_Basics_1_2.Threads;

public class MyThreadRunner implements Runnable {

	public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ " - "+Thread.currentThread()
                                     .getName() + " : : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}


}
