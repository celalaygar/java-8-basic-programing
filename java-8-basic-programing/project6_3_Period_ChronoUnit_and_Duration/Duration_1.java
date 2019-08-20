package Java8.project6_3_Period_ChronoUnit_and_Duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Duration_1 {

	public static void main(String[] args) {

		Duration oneHours = Duration.ofHours(1);
		System.out.println(oneHours.getSeconds() + " seconds"); 	// output : 3600 seconds

		Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(oneHours2.getSeconds() + " seconds");	// output : 3600 seconds

		LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 21, 05, 21, 53);
		System.out.println(oldDate);					// output : 2016-08-21T05:21:53

		LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);
		System.out.println(newDate);					// output : 2016-11-09T10:21:56

		Duration duration = Duration.between(oldDate, newDate);
		System.out.println(duration.getSeconds() + " seconds");		// output : 6930003 seconds

	}

}
