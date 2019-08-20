package Thread_Synchronization_2_2.Thread_Communication;

public class SimpleWaitNotify_2 {
    private static String message;
    private static int cnt;

    public static void main (String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                while (message == null) {
    				try {
    	            	System.out.println("Thread_1 : cnt : "+cnt); 
                        lock.wait();
    					Thread.sleep(1000);
    				} catch (InterruptedException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
                	
                }
			}
            System.out.println("message + "+message+" because cnt =3");
        });

        Thread thread2 = new Thread(() -> {
        	cnt=0;
            synchronized (lock) {
            	while(message==null) {
                    try {
                		cnt++;
    	            	System.out.println("Thread_2 : cnt : "+cnt); 
    					Thread.sleep(1000);
    	        		if(cnt ==3) {
    	            		message = "A message from thread1";

    	                    lock.notify();
    	        		}
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
            	}
            	
            }
        });

        thread1.start();
        thread2.start();
    }
//	output : 
//    Thread_1 : cnt : 1
//    Thread_1 : cnt : 2
//    Thread_1 : cnt : 3
//    message + A message from thread1 because cnt =3
}
