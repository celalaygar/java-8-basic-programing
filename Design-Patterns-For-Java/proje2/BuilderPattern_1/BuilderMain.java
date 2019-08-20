package Project6.BuilderPattern_1;

public class BuilderMain {

	public static void main(String[] args) {
		Person person1 = new Person.Builder()
				.identityNumber("11111")
				.name("Celal")
				.surname("Aygar")
				.city("ANKARA")
				.age(35)
				.gender(1)
				.build();
		System.out.println(person1);
		
		Person person2 = new Person.Builder("22222", "Fatma")
				.surname("Çiçek")
				.city("ÝZMÝR")
				.age(31)
				.gender(1)
				.build();
		System.out.println(person2);
		
		Person person3 = new Person.Builder("3333", "Arda", "Turan")
				.city("MANÝSA")
				.age(42)
				.gender(1)
				.build();
		System.out.println(person3);
	}

}
