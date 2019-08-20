package Thread_Basics_2_4.Thread_joining;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Thread.join() method waits for this thread to die.
 * 
 */
public class ThreadJoinExample2 {

	public static void main(String[] args) {
		final List<Integer> integers = Arrays.asList(5, 6, 7, 2, 4, 8);

		new Thread(new Runnable() {// thread A
			
			public void run() {
				List<FactorialCalculator> threads = new ArrayList<FactorialCalculator>();
				for (Integer integer : integers) {
					FactorialCalculator calc = new FactorialCalculator(integer);
					threads.add(calc);
					calc.start();
				}
				for (FactorialCalculator calc : threads) {
					try {
						calc.join();
						System.out.println(calc.getNumber() + "! = " + calc.getFactorial());

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	private static class FactorialCalculator extends Thread {

		private final int number;
		private BigDecimal factorial;

		FactorialCalculator(int number) {
			this.number = number;
		}

		
		public void run() {
			factorial = calculateFactorial(number);
		}

		private static BigDecimal calculateFactorial(int number) {
			BigDecimal factorial = BigDecimal.ONE;
			for (int i = 1; i <= number; i++) {
				factorial = factorial.multiply(new BigDecimal(i));
			}
			return factorial;
		}

		public BigDecimal getFactorial() {
			return factorial;
		}

		public int getNumber() {
			return number;
		}
	}
}
