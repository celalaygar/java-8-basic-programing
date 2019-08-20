package Thread_Basics_2_2.Yielding_Thread;
/*
 * Thread.yield() method causes the currently executing thread object 
 * to temporarily pause and allow other threads to execute. 
 */
public class Thread_Yield_Example_1 {

	public static void main(String[] args) {
        MyThread t = new MyThread(); 
        t.start(); 
  
        for (int i=0; i<5; i++) 
        { 
            // Control passes to child thread 
            Thread.yield(); 
  
            // After execution of child Thread 
            // main thread takes over 
            System.out.println("Main Loop : "+Thread.currentThread().getName() 
                                + " in control"); 
        } 
    } 

}
class MyThread extends Thread 
{ 
    public void run() 
    { 
        for (int i=0; i<5 ; i++) 
            System.out.println("Running Method : "+Thread.currentThread().getName() 
                                + " in control"); 
    } 
} 	