package Thread_Synchronization_2_2.Thread_Communication;

public class SimpleWaitNotify_1 {
    private static String message;
    private static int cnt;
    public static void main (String[] args) {

        Thread thread1 = new Thread(() -> {
            while (message == null) {
				try {
	            	System.out.println("Thread_1 : cnt : "+cnt); 

					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            }

            System.out.println("message + "+message+" because cnt =3");
        });

        Thread thread2 = new Thread(() -> {
        	cnt=0;
        	while(message==null) {
                try {
            		cnt++;
					Thread.sleep(1000);
	        		if(cnt ==3)
	            		message = "A message from thread1";
				} catch (InterruptedException e) {
					e.printStackTrace();
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
