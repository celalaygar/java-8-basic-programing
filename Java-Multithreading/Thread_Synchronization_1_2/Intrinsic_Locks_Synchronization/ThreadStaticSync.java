package Thread_Synchronization_1_2.Intrinsic_Locks_Synchronization;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class ThreadStaticSync {

	static int hour = 0;
	static int minute = 0;
	static int second = 0;

	public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
        	getTime();
            System.out.println(Thread.currentThread().getName() +" before call "+ hour + " : " + minute + " : " + second);
            syncMethod("from thread1");
        	getTime();
            System.out.println(Thread.currentThread().getName() +" after call "+ hour + " : " + minute + " : " + second);
        });
        Thread thread2 = new Thread(() -> {
        	getTime();
            System.out.println(Thread.currentThread().getName() +" before call "+ hour + " : " + minute + " : " + second);
            syncMethod("from thread2");
        	getTime();
            System.out.println(Thread.currentThread().getName() +" after call "+ hour + " : " + minute + " : " + second);
        });
		thread1.setName("Thread_1");
		thread2.setName("Thread_2");

        thread1.start();
        thread2.start();
    }

    private static synchronized void syncMethod (String msg) {
    	getTime();
        System.out.println(Thread.currentThread().getName() + " in the sync method "+msg+" "+ hour + " : " + minute + " : " + second);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	private static void getTime() {
		hour = LocalDateTime.now().getHour();
		minute = LocalDateTime.now().getMinute();
		second = LocalDateTime.now().getSecond();
	}
//	output : 
//	Thread_1 before call 16 : 49 : 14
//	Thread_2 before call 16 : 49 : 14
//	Thread_1 in the sync method from thread1 16 : 49 : 14
//	Thread_1 after call 16 : 49 : 19
//	Thread_2 in the sync method from thread2 16 : 49 : 19
//	Thread_2 after call 16 : 49 : 24
}
