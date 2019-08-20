package Java8.project5_4_Arrays_and_JoinArray;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = new String[]{"Numpy", "Python", "Dijango"};
		String[] s2 = new String[]{"Java", "Spring", "Hibernate"};
		String[] s3 = new String[]{".NET CORE", "C#", ".NET MVC"};

		//join object type array
		String[] result = Stream.of(s1, s2, s3).flatMap(Stream::of).filter(s->!s.equals("Java")).toArray(String[]::new);

		// not Java because of filter method
		// output : [Numpy, Python, Dijango, Spring, Hibernate, .NET CORE, C#, .NET MVC]
		System.out.println(Arrays.toString(result));


		int [] int1 = new int[]{15,22,34};
		int[] int2 = new int[]{44,51,62};
		int[] int3 = new int[]{72,86,92};

		//join 2 primitive type array
		int[] result2 = IntStream.concat(Arrays.stream(int1), Arrays.stream(int2)).toArray();

		//join 3 primitive type array, any better idea?
		int[] result3 = IntStream.concat(Arrays.stream(int1), 
				IntStream.concat(Arrays.stream(int2), Arrays.stream(int3))).toArray();

		int[] result4 = IntStream.concat(Arrays.stream(int1), 
				IntStream.concat(Arrays.stream(int2), Arrays.stream(int3))).filter(s->s<50).toArray();

		// output : [15, 22, 34, 44, 51, 62]
		System.out.println(Arrays.toString(result2));

		// output : [15, 22, 34, 44, 51, 62, 72, 86, 92]
		System.out.println(Arrays.toString(result3));

		// output : [15, 22, 34, 44]
		System.out.println(Arrays.toString(result4));

	}

}
