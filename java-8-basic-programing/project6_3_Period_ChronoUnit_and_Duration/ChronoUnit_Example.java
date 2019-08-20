package Java8.project6_3_Period_ChronoUnit_and_Duration;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnit_Example {

	public static void main(String[] args) {
		LocalDateTime oldDate = LocalDateTime.of(2015, Month.APRIL, 21, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(2016, Month.DECEMBER, 9, 10, 21, 56);

		System.out.println(oldDate);	// ouutput : 2015-04-21T10:20:55
		System.out.println(newDate);	// ouutput : 2016-12-09T10:21:56

		// count between dates
		long years = ChronoUnit.YEARS.between(oldDate, newDate);
		long months = ChronoUnit.MONTHS.between(oldDate, newDate);
		long weeks = ChronoUnit.WEEKS.between(oldDate, newDate);
		long days = ChronoUnit.DAYS.between(oldDate, newDate);
		long hours = ChronoUnit.HOURS.between(oldDate, newDate);
		long minutes = ChronoUnit.MINUTES.between(oldDate, newDate);
		long seconds = ChronoUnit.SECONDS.between(oldDate, newDate);
		long milis = ChronoUnit.MILLIS.between(oldDate, newDate);
		long nano = ChronoUnit.NANOS.between(oldDate, newDate);

		System.out.println("years	: "+years);		// ouutput : years	: 1
		System.out.println("months	: "+months);		// ouutput : months	: 19
		System.out.println("weeks	: "+weeks);		// ouutput : weeks	: 85
		System.out.println("days	: "+days);		// ouutput : days	: 598
		System.out.println("hours	: "+hours);		// ouutput : hours	: 14352
		System.out.println("minutes	: "+minutes);		// ouutput : minutes	: 861121
		System.out.println("seconds	: "+seconds);		// ouutput : seconds	: 51667261
		System.out.println("milis 	: "+milis);		// ouutput : milis 	: 51667261000
		System.out.println("nano	: "+nano);		// ouutput : nano	: 51667261000000000
	}

}
