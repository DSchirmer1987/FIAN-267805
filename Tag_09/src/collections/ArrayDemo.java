/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_09
 * ©2020
 *
 */

package collections;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
	public static void ArrayDemo() {
		int[] intArray = new int[10];
		int[] suchArray = new int[100000];
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < suchArray.length; i++) {
//			suchArray[i] = (int) Math.random() * 50000;
			suchArray[i] = random.nextInt(50001);
		}
		System.out.println("Bitte geben sie eine Zahl zwischen 0 und 50.000 ein: ");
		int eingabe = sc.nextInt();
		boolean gefunden = false;
		for (int i = 0; i < suchArray.length; i++) {
			if(eingabe == suchArray[i]) {
				System.out.println("Zahl gefunden an stelle: " + i);
				gefunden = true;
			} 
//				else {
//				System.out.println("Zahl wurde nicht gefunden");
//			}
		}
		if(!gefunden) {
			System.out.println("Zahl wurde nicht gefunden");
		}
				
//		for(int i=0; i < 10; i++) {
//			intArray[i] = i + 1;
//			System.out.print("[Elemtent: " + i + " Zahl: " + intArray[i] + "]");
//		}
//		System.out.println();
//		for(int i=9; i >= 0; i--) {
//			intArray[i] = i + 1;
//			System.out.print("[Elemtent: " + i + " Zahl: " + intArray[i] + "]");
//		}
//		System.out.println();
//		for(int i=0; i < 10; i++) {
//			intArray[i] = (int) (Math.random() * 10) + 1;
//			System.out.print("[Elemtent: " + i + " Zahl: " + intArray[i] + "]");
//		}
	}
}
