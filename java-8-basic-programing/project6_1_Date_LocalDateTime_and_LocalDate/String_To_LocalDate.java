package Java8.project6_1_Date_LocalDateTime_and_LocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class String_To_LocalDate {

	public static void main(String[] args) {
		String date = "2018-08-14";

		//default, ISO_LOCAL_DATE
		LocalDate localDate1 = LocalDate.parse(date);
		System.out.println(localDate1);					// output : 2018-08-14

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		date = "21/03/2018";
		LocalDate localDate_1 = LocalDate.parse(date, formatter);

		System.out.println(localDate_1);				// output : 2018-03-21
		System.out.println(formatter.format(localDate_1));		// output : 21/03/2018

		String dateInString = "2016-08-16T15:23:01Z";
		Instant instant = Instant.parse(dateInString);

		System.out.println("Instant : " + instant);			// output : Instant : 2016-08-16T15:23:01Z
	}

}
