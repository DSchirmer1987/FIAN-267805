/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package vererbung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fahrzeug {
	private float preis;
	private String herstellerName;
	protected static Scanner scanner = new Scanner (System.in);
	
	public Fahrzeug(){
		System.out.print("\nGeben Sie den Herstellernamen ein: ");
		herstellerName = scanner.next();
		System.out.print("Geben Sie den Preis ein: ");
		try{
		preis = scanner.nextFloat();
		}catch (InputMismatchException e){
		System.out.println ("Keine gültige Preisangabe!");
		System.exit(1);
		}
	}
	
	
	public void print(){
		System.out.println();
		System.out.println("Herstellername : " + herstellerName);
		System.out.println("Preis : " + preis);
	}
}
