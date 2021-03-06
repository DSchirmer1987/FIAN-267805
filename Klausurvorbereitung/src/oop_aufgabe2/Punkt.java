/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * �2020
 *
 */

package oop_aufgabe2;

import java.util.Scanner;

public class Punkt {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Punkt(){
		Scanner scanner = new Scanner (System.in);
		String eingabeX;
		String eingabeY;
		System.out.println ("Gib den x-Wert ein: ");
		eingabeX = scanner.next();
		System.out.println ("Gib den y-Wert ein: ");
		eingabeY = scanner.next();
		try {
			/*
			 * Double.valueOf() wird benutzt, das scanner.next() einen String liefert,
			 * der erst in einen Double-Wert umgewandelt werden muss.
			 */
			x = Double.valueOf (eingabeX);
			y = Double.valueOf (eingabeY);
		} catch (NumberFormatException e) {
			System.out.println (e.toString());
			System.exit (1);
		}
	}
	
	public Punkt(String eingabe) {
		super();
//		this(); Es geht nur super() oder this()
	}

	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}
	
	public String meinToString() {
		return this.toString();
	}
	
	public String oberToString() {
		return super.toString();
	}
}
