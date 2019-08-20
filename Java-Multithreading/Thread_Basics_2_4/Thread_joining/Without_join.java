package Thread_Basics_2_4.Thread_joining;

public class Without_join   {

	public static void main(String[] args) throws InterruptedException {
	      Thread th1 = new Thread(new MyClass(), "th1");
	      Thread th2 = new Thread(new MyClass(), "th2");
	      Thread th3 = new Thread(new MyClass(), "th3");
	         
	      th1.start();
	      th2.start();        
	      th3.start();
	}
	
}
class MyClass implements Runnable{
	 
    @Override
    public void run() {
    	Thread t = Thread.currentThread();
        System.out.println("Thread started: "+t.getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: "+t.getName());    
    }
}
//	output : 
//	Thread started: th2
//	Thread started: th3
//	Thread started: th1
//	Thread ended: th2
//	Thread ended: th3
//	Thread ended: th1
