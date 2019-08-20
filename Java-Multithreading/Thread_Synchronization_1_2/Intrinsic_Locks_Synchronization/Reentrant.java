package Thread_Synchronization_1_2.Intrinsic_Locks_Synchronization;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Reentrant {

	static int hour = 0;
	static int minute = 0;
	static int second = 0;

	public static void main(String[] args) {
		Reentrant demo = new Reentrant();
		Thread thread1 = new Thread(() -> {
			getTime();
			System.out.println(Thread.currentThread().getName() + " : before call : " + hour + " : " + minute + " : " + second);

			demo.syncMethod1("from thread1");
			getTime();
			System.out.println(Thread.currentThread().getName() + " : after call : " + hour + " : " + minute + " : " + second);
		});
		Thread thread2 = new Thread(() -> {
			getTime();
			System.out.println(Thread.currentThread().getName() + " : before call : " + hour + " : " + minute + " : " + second);
			demo.syncMethod2("from thread2");
			getTime();
			System.out.println(Thread.currentThread().getName() + " : after call : " + hour + " : " + minute + " : " + second);
		});
		thread1.setName("Thread_1");
		thread2.setName("Thread_2");
		thread1.start();
		thread2.start();
	}

	private synchronized void syncMethod1(String msg) {
		hour = LocalDateTime.now().getHour();
		minute = LocalDateTime.now().getMinute();
		second = LocalDateTime.now().getSecond();
		System.out.println(Thread.currentThread().getName() + " : in the syncMethod1 " + msg + " " + hour + " : "
				+ minute + " : " + second);
		syncMethod2("from method syncMethod1, reentered call");
	}

	private synchronized void syncMethod2(String msg) {
		hour = LocalDateTime.now().getHour();
		minute = LocalDateTime.now().getMinute();
		second = LocalDateTime.now().getSecond();
		System.out.println(Thread.currentThread().getName() + " : in the syncMethod2 " + msg + " " + hour
				+ " : " + minute + " : " + second);
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
//	outout :
//	Thread_1 : before call : 16 : 48 : 13
//	Thread_2 : before call : 16 : 48 : 13
//	Thread_1 : in the syncMethod1 from thread1 16 : 48 : 13
//	Thread_1 : in the syncMethod2 from method syncMethod1, reentered call 16 : 48 : 13
//	Thread_1 : after call : 16 : 48 : 18
//	Thread_2 : in the syncMethod2 from thread2 16 : 48 : 18
//	Thread_2 : after call : 16 : 48 : 23
}
