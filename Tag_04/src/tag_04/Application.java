/**
 * Daniel Schirmer
 *
 * 29.11.2020
 * Project : Tag_04
 * ©2020
 *
 */

package tag_04;

import java.util.Properties;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben");
		int eingabe = sc.nextInt();
		System.out.println("Sie haben: " + eingabe + " eingeben");
		
		SumUneven su = new SumUneven(10);
		su.calculate();
		
		int hex = 0xf;
		System.out.println(hex);
	}
}
