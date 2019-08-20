package Java8.project6_2_Compare_Dates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compare_Date_3 {

	public static void main(String[] args) throws ParseException {
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date1 = LocalDate.of(2012, 11, 11);
		LocalDate date2 = LocalDate.of(2005, 03, 31);

		System.out.println("date1 : " + sdf.format(date1)); // output : date1 : 2012-11-11
		System.out.println("date2 : " + sdf.format(date2)); // output : date2 : 2005-03-31

		if (date1.isAfter(date2))
		    System.out.println("date1 is after date2"); // output : date1 is after date2

		if (date1.isBefore(date2))
		    System.out.println("date1 is before date2");

		if (date1.isEqual(date2))
		    System.out.println("date1 is equal date2");

		// output : Date1 is after Date2
		if (date1.compareTo(date2) > 0) {
		    System.out.println("date1 is after date2"); 
		} else if (date1.compareTo(date2) < 0) {
		    System.out.println("date1 is before date2");
		} else if (date1.compareTo(date2) == 0) {
		    System.out.println("date1 is equal to date2");
		} else {
		    System.out.println("How to get here?");
		}

	}

}
