package Thread_Basics_1_1.Threads;

public class MyThread extends Thread{
	
	@Override
	public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()
                                     .getName() + " :  " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}

}
