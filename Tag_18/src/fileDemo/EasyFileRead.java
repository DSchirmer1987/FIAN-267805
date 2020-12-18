/**
 * Daniel Schirmer
 *
 * 18.12.2020
 * Project : Tag_18
 * ©2020
 *
 */

package fileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class EasyFileRead {
	
	// Charsets
	// UTF-8
	// UTF-16
	// US-ASCII
	// ISO-8859-1

	public static void main(String[] args) {
		File text = new File("D:\\Demo\\WriteNow.txt");
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(text, "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fileScanner.nextLine());
		System.out.println(fileScanner.nextLine());
		System.out.println(fileScanner.nextLine());
		try {
			fileScanner = new Scanner(text, "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(fileScanner.hasNext()) {
			System.out.println(fileScanner.nextLine());
		}
	}

}
