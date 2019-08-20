package Thread_Synchronization_0_1.Thread_Synchronized;

public class Not_Using_synchronized {

	public static void main(String[] args) {
		Counter obj = new Counter();

		// we are creating two threads which share
		// same Object.
		Train_1 train1 = new Train_1(obj);
		Train_1 train2 = new Train_1(obj);
		train1.setName("train1");
		train2.setName("train2");
		// both threads start executing .
		train1.start();
		train2.start();
	}

}

class Counter {

	// if multiple threads(trains) trying to access
	// this synchronized method on the same Object
	// but only one thread will be able
	// to execute it at a time.

	public void getLine(String name) {
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

class Train_1 extends Thread {
	// Reference variable of type Line.
	Counter counter;

	Train_1(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.getLine(this.getName());
	}
	
//	OUTPUT : 
//	train1 : 0
//	train2 : 0
//	train2 : 1
//	train1 : 1
//	train2 : 2
//	train1 : 2

}
