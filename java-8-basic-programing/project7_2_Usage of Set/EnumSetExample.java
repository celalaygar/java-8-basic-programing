import java.util.EnumSet;

public class EnumSetExample {

	public static void main(String[] args) {
		// Creating a set
		EnumSet<EnumExample> set1, set2, set3, set4;

		// Adding elements
		set1 = EnumSet.of(EnumExample.PHP, EnumExample.PYTHOM, EnumExample.DOTNET, EnumExample.C, EnumExample.PHP,
				EnumExample.GO);
		set2 = EnumSet.complementOf(set1);
		set3 = EnumSet.allOf(EnumExample.class);
		set4 = EnumSet.range(EnumExample.PYTHOM, EnumExample.PHP);
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Set 3: " + set3);
		System.out.println("Set 4: " + set4);

//		OUTPUT : 
//      Set 1: [PYTHOM, DOTNET, C, PHP, GO]
//		Set 2: [CODE, JAVA, JAVASCRIPT, UNITY, GITHUB, GIT]
//		Set 3: [CODE, JAVA, PYTHOM, DOTNET, C, JAVASCRIPT, PHP, GO, UNITY, GITHUB, GIT]
//		Set 4: [PYTHOM, DOTNET, C, JAVASCRIPT, PHP]

	}
}

enum EnumExample {
	CODE, JAVA, PYTHOM, DOTNET, C, JAVASCRIPT, PHP, GO, UNITY, GITHUB, GIT
};
