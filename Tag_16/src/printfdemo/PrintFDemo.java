/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package printfdemo;

import java.util.Formatter;
import java.util.Locale;

public class PrintFDemo {

	public static void main(String[] args) {
		String text = "Die Pizza kostet nun";
		String fliesskomma = "%s %-9.2f€%n";
		
		Formatter formatter = new Formatter(Locale.FRANCE);
		
		formatter.format("%s %.10f€\n",text,11123.4500f);
		System.out.println(formatter.toString());
		System.out.println("Ende");
		
//		float price = 3.55599999999f;
//		
//		System.out.printf(Locale.US,fliesskomma,text,3.45f);
//		System.out.printf(Locale.FRANCE,"%s %-9.2g€%n",text,11123.45f);
//		System.out.printf("%s %-9.2e€%n",text,11123.45f);
//		
//		System.out.printf("%s %-9d€%n",text,4);

	}

}
