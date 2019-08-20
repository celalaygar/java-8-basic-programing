package Java8.project6_2_Compare_Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Compare_Date_2 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2015-11-31");

		// you can try 
		// Date date2 = sdf.parse("2015-11-31"); 
		// instead of Date date2 = sdf.parse("2010-03-21"); 

		Date date2 = sdf.parse("2010-03-21");

		System.out.println("date1 : " + sdf.format(date1));	// output : date1 : 2015-12-01
		System.out.println("date2 : " + sdf.format(date2));	// output : date2 : 2010-03-21

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(date1);
		cal2.setTime(date2);

		if (cal1.after(cal2)) 
		    System.out.println("date1 is after date2"); // output : Date1 is after Date2

		else if (cal1.before(cal2)) 
		    System.out.println("date1 is before date2");

		else if (cal1.equals(cal2)) 
		    System.out.println("date1 is equal date2");

	}

}
