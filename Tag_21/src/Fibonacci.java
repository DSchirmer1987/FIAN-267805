/**
 * Daniel Schirmer
 *
 * 13.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

public class Fibonacci {

	public static void main(String[] args) {
		int count = 10000;
		int number, number2, number3;
		
		number = 0;
		number2 = 1;
		
		for(int i = 2; i< count; ++i) {
			number3 = number + number2;
			System.out.print(" " + number3);
			if(i % 5 == 0) {
				System.out.println();
			}
			number = number2;
			number2 = number3;
		}

	}

}
