/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

package wiederholung;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Repeat {

	public static void main(String[] args) {
		LocalDate datum1 = LocalDate.now();
		LocalDate datum2 = datum1.plusMonths(3);
		
		System.out.println(datum1);
		System.out.println(datum2);
		
		LocalTime zeit1 = LocalTime.now();
		LocalTime zeit2 = zeit1.plusHours(3);
		System.out.println(zeit1);
		System.out.println(zeit2);
		
		LocalDateTime datetime1 = LocalDateTime.now();
		
		System.out.println(datetime1);
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd'.'MM'.'yyyy' - 'HH':'m':'s");
		System.out.println(datetime1.format(format1));
	}

}
