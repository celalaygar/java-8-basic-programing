package Thread_Synchronization_0_1.Thread_Synchronized;

public class Using_synchronized {

	public static void main(String[] args) {
		Counter_2 counter_2 = new Counter_2();

		// we are creating two threads which share
		// same Object.
		Train_2 train1 = new Train_2(counter_2);
		Train_2 train2 = new Train_2(counter_2);
		train1.setName("train1");
		train2.setName("train2");
		// both threads start executing .
		train1.start();
		train2.start();
	}

}

class Counter_2 {

	// if multiple threads(trains) trying to access
	// this synchronized method on the same Object
	// but only one thread will be able
	// to execute it at a time.

	synchronized public void getLine(String name) {
		for (int i = 0; i < 3; i++) {
			System.out.println(name+" : "+i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Train_2 extends Thread {
	// Reference variable of type Line.
	Counter_2 counter_2;

	Train_2(Counter_2 counter_2) {
		this.counter_2 = counter_2;
	}

	@Override
	public void run() {
		counter_2.getLine(this.getName());
	}
	
	
//	output : 
//	train1 : 0
//	train1 : 1
//	train1 : 2
//	train2 : 0
//	train2 : 1
//	train2 : 2
}