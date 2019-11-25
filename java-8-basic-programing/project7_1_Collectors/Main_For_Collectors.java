package com.example.CollectorsExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_For_Collectors {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 7, 9, 2, 3, 1);
		Set set = stream.collect(Collectors.toCollection(TreeSet::new));
		// [1, 2, 3, 7, 9]
		System.out.println(set);

		// 15
		Stream intStream1 = Stream.of(1, 2, 3, 4, 5);
		System.out.println(intStream1.collect(Collectors.summingInt(Integer::intValue)));

		// 3.0
		Stream intStream2 = Stream.of(1, 2, 3, 4, 5);
		System.out.println(intStream2.collect(Collectors.averagingInt(Integer::intValue)));

		// 8
		Stream strStream = Stream.of("1", "2", "3", "4", "5", "51", "52", "35");
		System.out.println(strStream.collect(Collectors.counting()));

		// Optional[34433]
		Stream intStream = Stream.of(4, 2, 6, 12, 33, 44, 233, 34433, 244);
		System.out.println(intStream.collect(Collectors.maxBy(Comparator.naturalOrder())));

		// {1=[b, d], 3=[one, two], 5=[three]}
		Stream strStream2 = Stream.of("one", "two", "b", "d", "three");
		System.out.println(strStream2.collect(Collectors.groupingBy(String::length)));

		// {false=[1, 5, 7, 33], true=[4, 2, 22]}
		Stream<Integer> intStream3 = Stream.of(1, 4, 5, 2, 7, 33, 22);
		System.out.println(intStream3.collect(Collectors.partitioningBy(e -> e % 2 == 0)));

		// onetwothreefourfive
		Stream strStream3 = Stream.of("one", "two", "three", "four", "five");
		System.out.println(strStream3.collect(Collectors.joining()));

		// one / two / three / four / five
		Stream strStream4 = Stream.of("one", "two", "three", "four", "five");
		System.out.println(strStream4.collect(Collectors.joining(" / ")));

		// start:one-two-three-four-five:end
		Stream strStream5 = Stream.of("one", "two", "three", "four", "five");
		System.out.println(strStream5.collect(Collectors.joining("-", "start:", ":end")));

	
	
	
	
	}

}
