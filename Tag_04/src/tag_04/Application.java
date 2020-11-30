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

public class Application {

	public static void main(String[] args) {
		SumUneven su = new SumUneven(10);
		su.calculate();
		
		int hex = 0xf;
		System.out.println(hex);
	}
}
