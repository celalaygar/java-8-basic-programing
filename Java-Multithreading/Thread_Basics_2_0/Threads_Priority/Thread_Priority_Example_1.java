package Thread_Basics_2_0.Threads_Priority;

public class Thread_Priority_Example_1 extends Thread {
	
	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		
        // main thread priority is 4 now 
        Thread.currentThread().setPriority(4); 
  
        System.out.println("main thread priority : " + 
                   Thread.currentThread().getPriority()); 
  
        Thread_Priority_Example_1 t1 = new Thread_Priority_Example_1(); 
  
        // t1 thread is child of main thread 
        // so t1 thread will also have priority 4. 
        System.out.println("t1 thread priority : "
                                  + t1.getPriority()); 
		
	}

//	output :
//	main thread priority : 4
//	t1 thread priority : 4
	
}
