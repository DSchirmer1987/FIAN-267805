/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_08
 * ©2020
 *
 */

public class Test {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		
		for(int i=0; i < 10; i++) {
			intArray[i] = i + 1;
			System.out.print("[Elemtent: " + i + " Zahl: " + intArray[i] + "]");
		}
		System.out.println();
		for(int i=9; i >= 0; i--) {
			intArray[i] = i + 1;
			System.out.print("[Elemtent: " + i + " Zahl: " + intArray[i] + "]");
		}
		System.out.println();
		for(int i=0; i < 10; i++) {
			intArray[i] = (int) (Math.random() * 10) + 1;
			System.out.print("[Elemtent: " + i + " Zahl: " + intArray[i] + "]");
		}
		System.out.println();
		for(int num : intArray) {
			System.out.print("[Elemtent: " + num + "]");
		}
	}

}
