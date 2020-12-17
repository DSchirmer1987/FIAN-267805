/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_17
 * ©2020
 *
 */

package datetimedemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.Locale;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate datum1 = LocalDate.of(2020, 2, 29);
		LocalDate datum2 = LocalDate.of(2020, Month.DECEMBER, 24);
		LocalDate datum3 = LocalDate.now();
		
		System.out.println(datum1);
		System.out.println(datum2);
		System.out.println(datum3);
		
		System.out.println(datum1.plusMonths(3));
		System.out.println(datum2.plusDays(3));
		
		System.out.println(datum1.getMonth());
		System.out.println(datum1.getDayOfWeek());
		System.out.println("---------");
		
		LocalTime zeit1 = LocalTime.now();
		LocalTime zeit2 = LocalTime.of(15, 30);
		System.out.println(zeit1);
		System.out.println(zeit2);
		System.out.println("---------");
		
		LocalDateTime datetime1 = LocalDateTime.now();
		LocalDateTime datetime2 = LocalDateTime.of(2020, 12, 17, 12, 30);
		LocalDateTime datetime3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(datetime1);
		System.out.println(datetime2);
		System.out.println(datetime3);
		System.out.println("---------");
		
		Period fivedays = Period.ofDays(5);
		LocalDateTime datetime4 = datetime3.plus(fivedays);
		Duration fivehours = Duration.ofHours(5);
		LocalDateTime datetime5 = datetime3.plus(fivehours);
		System.out.println(datetime4);
		System.out.println(datetime5);
		System.out.println("---------");
		
		Locale greatBritain = new Locale("en", "GB");
		Locale french = new Locale("fr");
		System.out.println(greatBritain);
		System.out.println(french);
		System.out.println(Locale.getDefault());
		System.out.println(Locale.JAPAN);
		
	}

}
