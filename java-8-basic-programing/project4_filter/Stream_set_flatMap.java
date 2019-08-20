package Java8.project5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_set_flatMap {

	public static void main(String[] args) {

		Student obj1 = new Student();
		obj1.setName("Java_Developer");
		obj1.addBook("Java 8 in Action");
		obj1.addBook("Spring Boot");
		obj1.addBook("Hibernate");
		obj1.addBook("Spring Framework");
		obj1.addBook("Swing");
		obj1.addBook("JavaFX");

		Student obj2 = new Student();
		obj2.setName("Python_Developer");
		obj2.addBook("Learning Python");
		obj2.addBook("Dijango");
		obj2.addBook("Numpy");

		List<Student> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.forEach(x -> System.out.println(x.getName() + " " + x.getBook()));
		System.out.println("--------------------------------");
		List<String> collect = list.stream().map(x -> x.getBook()) // Stream<Set<String>>
				.flatMap(x -> x.stream()) // Stream<String>
				.distinct().collect(Collectors.toList());

		collect.forEach(x -> System.out.println(x));
		System.out.println();
		list.get(0).getBook().forEach(x -> System.out.println(x));	// get all books for Java_Developer
		System.out.println();
		list.get(1).getBook().forEach(x -> System.out.println(x));	// get all books for Python_Developer

	}

}
