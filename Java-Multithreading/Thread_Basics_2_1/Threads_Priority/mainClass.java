package Thread_Basics_2_1.Threads_Priority;

public class mainClass {

	public static void main(String[] args) {
		System.out.println(Thread.MIN_PRIORITY+" : "+ Thread.MAX_PRIORITY+" "+Thread.NORM_PRIORITY);
        MyThread thread = new MyThread();
        thread.setName("first thread 1");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

        Thread thread2 = new MyThread();
        thread2.setName("second thread 2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();
        

        Thread thread3 = new MyThread();
        thread3.setName("third thread 3");
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread3.start();
	}

}
