/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package exceptions;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		int rate = 15;
		
		try {
			int zahl = Integer.parseInt("19%");
		}catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException");
		} catch (IllegalArgumentException iae) {
			System.out.println("IllegalArgumentException");
		}catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("Programm ordentlich beendet");
	}
	
	public static void werfen() throws IllegalArgumentException{
		throw new IllegalArgumentException();
	}
}
