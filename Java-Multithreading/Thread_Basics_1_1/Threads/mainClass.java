package Thread_Basics_1_1.Threads;

public class mainClass {

	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
		MyThread thread2=new MyThread();
		thread2.start();
	}

}
