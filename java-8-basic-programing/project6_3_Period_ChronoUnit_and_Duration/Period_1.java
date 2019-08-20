package Java8.project6_3_Period_ChronoUnit_and_Duration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Period_1 {

	public static void main(String[] args) {
		Period tenDays = Period.ofDays(21); 
		System.out.println(tenDays.getDays()); 				// output : 21

		Period oneYearTwoMonthsThreeDays = Period.of(2008, 5, 23);
		System.out.println(oneYearTwoMonthsThreeDays.getYears()
				+" "+oneYearTwoMonthsThreeDays.getMonths()
				+" "+oneYearTwoMonthsThreeDays.getDays());  // output : 2008 5 23

		LocalDate oldDate = LocalDate.of(2015, Month.APRIL, 21);
		System.out.println(oldDate);						// output : 2015-04-21

		LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);
		System.out.println(newDate);						// output : 2016-11-09

		Period period = Period.between(oldDate, newDate);

		System.out.println("Years  : "+period.getYears());	// output : Years  : 1
		System.out.println("Months : "+period.getMonths());	// output : Months : 6
		System.out.println("Days   : "+period.getDays() );	// output : Days   : 19
		
	}

}
