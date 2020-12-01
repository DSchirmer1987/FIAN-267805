import java.util.Scanner;

/**
 * Daniel Schirmer
 *
 * 30.11.2020
 * Project : Tag05
 * ©2020
 *
 */

public class Application {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Bitte eine Zahl eingeben:");
//		EuroCent ec = new EuroCent(sc.nextInt());
//		ec.umrechnen();
//		System.out.println(ec);
//		sc.close();
		
		Seconds s = new Seconds();
		s.inputSeconds();
		s.calculateDaysHoursMinutes();
		System.out.println(s);
	}

}
