package Java8.project6_2_Compare_Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Compare_Date_1 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2011-12-31");
		Date date2 = sdf.parse("2010-01-31");

		System.out.println("date1 : " + sdf.format(date1));		// output : date1 : 2011-12-31
		System.out.println("date2 : " + sdf.format(date2));		// output : date2 : 2010-01-31

		// output : Date1 is after Date2
		if (date1.compareTo(date2) > 0) {
		    System.out.println("Date1 is after Date2");			// output : Date1 is after Date2
		} else if (date1.compareTo(date2) < 0) {
		    System.out.println("Date1 is before Date2");
		} else if (date1.compareTo(date2) == 0) {
		    System.out.println("Date1 is equal to Date2");
		} else {
		    System.out.println("How to get here?");
		}
	}

}
