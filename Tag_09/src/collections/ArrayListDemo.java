/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_09
 * ©2020
 *
 */

package collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		// ArrayLists immer mit einem Datentypen definieren!
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(random.nextInt(50001));
		}
		System.out.println("Bitte geben sie eine Zahl zwischen 0 und 50.000 ein: ");
		int eingabe = sc.nextInt();
		if(arrayList.contains(eingabe)) {
			System.out.println("Die Zahl wurde an Stelle: " + arrayList.indexOf(eingabe) + " gefunden");
		}else {
			System.out.println("Die Zahl wurde nicht gefunden!");
		}
	}
}
