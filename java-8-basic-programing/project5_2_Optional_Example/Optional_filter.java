package Java8.project5_2_Optional_Example;

import java.util.Optional;

public class Optional_filter {

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("ARABA");
		Optional<String> emptyGender = Optional.empty();

		//Filter on Optional
		System.out.println(gender.filter(g -> g.equals("araba"))); 			//Optional.empty
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("araba")));		//Optional[ARABA]
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("araba")));	//Optional.empty

		// output : Value available.
		if (gender.isPresent())
		    System.out.println("Value available.");
		else 
		    System.out.println("Value not available.");

		// output : In gender Option, value available.
		gender.ifPresent(g -> System.out.println("In gender Option, value available."));

		// output : ___
		emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));

		System.out.println(gender.orElse("<N/A>"));			//output : ARABA
		System.out.println(emptyGender.orElse("<N/A>"));		//output : <N/A>
		System.out.println(gender.orElseGet(() -> "<N/A>"));		//output : ARABA
		System.out.println(emptyGender.orElseGet(() -> "<N/A>"));	//output : <N/A>
		System.out.println("--------------------------------------------------------------");
		gender.ifPresent(g->{
			int a=1;
			System.out.println("value of a : "+a);			// output : value of a : 1
			a++;
			System.out.println("value of a : "+a);			// output : value of a : 2
		});

		//optional filter
		gender.filter(g->g.length()<=7).ifPresent(System.out::println); // output : ARABA

	}

}
