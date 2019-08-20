package Java8.project6_1_Date_LocalDateTime_and_LocalDate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Instant_LocalDateTime {

	public static void main(String[] args) {
        
		Instant instant_1 = Instant.now();
		//Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0
		LocalDateTime ldt = LocalDateTime.ofInstant(instant_1, ZoneOffset.UTC);

		System.out.println("Instant : " + instant_1);		// output : Instant : 2018-07-23T11:51:33.256Z
		System.out.println("LocalDateTime : " + ldt);		// output : LocalDateTime : 2018-07-23T11:51:33.256

		//Current a lot of datas
		System.out.println("MonthValue : "+ldt.getMonthValue());	// output : MonthValue : 7
		System.out.println("Year   : "+ldt.getYear());			// output : Year   : 2018
		System.out.println("Month  : "+ldt.getMonth());			// output : Month  : JULY
		System.out.println("Day    : "+ldt.getDayOfMonth());		// output : Day    : 23
		System.out.println("Hour   : "+ldt.getHour());			// output : Hour   : 12
		System.out.println("Minute : "+ldt.getMinute());		// output : Minute : 8

		LocalDateTime dateTime = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 17, 10);
		// Convert LocalDateTime to Instant, UTC+0
		Instant instant_2 = dateTime.toInstant(ZoneOffset.UTC);

		System.out.println("Instant : " + instant_2);		// output : Instant : 2016-08-18T06:17:10Z        
		System.out.println("LocalDateTime : " + dateTime);	// output : LocalDateTime : 2016-08-18T06:17:10
	
	}

}
