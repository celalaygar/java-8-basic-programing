package Thread_Basics_1_2.Threads;


public class mainClass {
	public static void main(String[] args) {
        MyThreadRunner threadRunnable = new MyThreadRunner();
        Thread thread = new Thread(threadRunnable);
        thread.start();

        MyThreadRunner threadRunnable2 = new MyThreadRunner();
        Thread thread2 = new Thread(threadRunnable2);
        thread2.start();

        System.out.println(Thread.currentThread()
                                 .getName());
	}
}
