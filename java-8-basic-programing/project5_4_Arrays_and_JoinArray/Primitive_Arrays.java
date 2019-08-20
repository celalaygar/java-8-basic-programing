package Java8.project5_4_Arrays_and_JoinArray;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Primitive_Arrays {

	public static void main(String[] args) {
		int[] number = {11, 23, 34, 42,78, 51, 68, 72, 84, 92, 105,39};
		boolean result = IntStream.of(number).anyMatch(x -> x < 41);

		if (result) {
		    System.out.println("there are a lots data"); // output : there are a lots data
		} else {
		    System.out.println("there is nothing data");
		}

		long[] lNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		boolean result2 = LongStream.of(lNumber).anyMatch(x -> x==2);

		if (result2) {
		    System.out.println("there is somedata what called 2 "); // output : there is somedata what called 2 
		} else {
		    System.out.println("Where is number 10?");
		}
	}

}
