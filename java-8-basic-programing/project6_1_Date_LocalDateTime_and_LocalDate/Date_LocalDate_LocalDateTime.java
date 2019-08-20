package Java8.project6_1_Date_LocalDateTime_and_LocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Date_LocalDate_LocalDateTime {

	public static void main(String[] args) {
		//Asia/Kuala_Lumpur +8
		ZoneId defaultZoneId = ZoneId.systemDefault();

		// output : System Default TimeZone : Asia/Istanbul
		System.out.println("System Default TimeZone : " + defaultZoneId); 


		Date date = new Date();
		System.out.println("date    : " + date); 		// output : date : Mon Jul 23 21:09:24 EET 2018
		System.out.println("Year    : " + date.getYear());
		System.out.println("Month   : " + date.getMonth());
		System.out.println("Day     : " + date.getDay());
		System.out.println("Hours   : " + date.getHours());
		System.out.println("Minutes : " + date.getMinutes());
		System.out.println("Second  : " + date.getSeconds());

		// output : instant : 2018-07-23T18:09:24.493Z
		Instant instant = date.toInstant();
		System.out.println("instant : " + instant);	//Zone : UTC+0

		// output : localDate : 2018-07-23
		LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
		System.out.println("localDate : " + localDate);

		// output : localDateTime : 2018-07-23T21:09:24.493
		LocalDateTime localDateTime = instant.atZone(defaultZoneId).toLocalDateTime();
		System.out.println("localDateTime : " + localDateTime);

		// output : zonedDateTime : 2018-07-23T21:09:24.493+03:00[Asia/Istanbul]
		ZonedDateTime zonedDateTime = instant.atZone(defaultZoneId);
		System.out.println("zonedDateTime : " + zonedDateTime);

	}

}
