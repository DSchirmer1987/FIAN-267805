/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_17
 * ©2020
 *
 */

package datetimedemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDemo {

	public static void main(String[] args) {
		LocalDateTime datetime1 = LocalDateTime.now();
		System.out.println("Standard: " + datetime1);
		
		DateTimeFormatter format1 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd'.'MM'.'yyyy");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd'.'MM'.'yyyy' - 'HH':'m':'s");

		
		System.out.println("ISO_DATE_TIME: " + datetime1.format(format1));
		System.out.println("Pattern : dd.M.yyyy: " + datetime1.format(format2));
		System.out.println("Pattern : dd.M.yyyy: " + datetime1.format(format3));
		
		
	}

}
