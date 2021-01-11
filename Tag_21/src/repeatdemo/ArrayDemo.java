/**
 * Daniel Schirmer
 *
 * 11.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

package repeatdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] intArray;
		int[] intArray2 = {2, 3, 4, 5};
		int[] intArray3;
		int[] intArray4 = new int[5];
		intArray = new int[5];
		intArray2 = new int[]{2,3,4,5};
		intArray3 = new int[]{6,7,8};
		// funktioniert nicht
		//intArray3 = {1,2,3,4,5,6};
//		for (int i = 0; i < intArray2.length; i++) {
//			intArray3[i] = intArray2[i];
//		}
		
		System.out.println(Arrays.toString(intArray2));
		System.out.println(intArray2.toString());
		System.out.println("------------");
		
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
		for (int i = 0; i < 25; i++) {
			zahlen.add(i);		
		}
		System.out.println(zahlen);
		System.out.println(zahlen.size());
		zahlen.remove(5);
		zahlen.remove(10);
		System.out.println(zahlen);
		System.out.println(zahlen.size());
		zahlen.add(5, 5);
		zahlen.add(10, 11);
		System.out.println(zahlen);
		System.out.println(zahlen.size());
	}

}
