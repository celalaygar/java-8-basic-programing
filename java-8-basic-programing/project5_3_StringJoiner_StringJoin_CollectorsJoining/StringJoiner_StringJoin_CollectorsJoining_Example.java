package Java8.project5_3_StringJoiner_StringJoin_CollectorsJoining;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoiner_StringJoin_CollectorsJoining_Example {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		sj.add("hacý");
		sj.add("celal");
		sj.add("aygar");
		String result1 = sj.toString();
		System.out.println(result1); // output : hacý,celal,aygar

		sj = new StringJoiner("/", "prefix-", "-suffix");
		sj.add("hacý");
		sj.add("celal");
		sj.add("aygar");

		String result2 = sj.toString();
		System.out.println(result2); // output : prefix-hacý/celal/aygar-suffix

		String joinResult = String.join("-", "2018", "10", "01" );
		System.out.println(joinResult); // output : 2018-10-01

		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby","c#","c++");

		String listResult1 = String.join(", ", list);
		System.out.println(listResult1); // output : java, python, nodejs, ruby, c#, c++

		String listResult2 = list.stream().map(x -> x).collect(Collectors.joining(" | "));

		System.out.println(listResult2); // output : java | python | nodejs | ruby | c# | c++
	}

}
