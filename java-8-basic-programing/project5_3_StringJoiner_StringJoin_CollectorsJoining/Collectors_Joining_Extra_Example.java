package Java8.project5_3_StringJoiner_StringJoin_CollectorsJoining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_Joining_Extra_Example {

	public static void main(String[] args) {
		List<Car> list = Arrays.asList(
			new Car("Ford Focus", 2005),
			new Car("Opel Astra", 2015),
			new Car("Toyota Corolla", 2017),
			new Car("Renault Megane", 2013)
		);
		
		String result = list.stream().map(x -> x.getName())
				.collect(Collectors.joining(", ", "{", "}"));

		System.out.println(result);  // output : {Ford Focus, Opel Astra, Toyota Corolla, Renault Megane}
	}

}
class Car{
    String name;
    int model;

    public Car(String name, int model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
