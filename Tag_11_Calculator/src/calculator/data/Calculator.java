/**
 * Daniel Schirmer
 *
 * 09.12.2020
 * Project : Tag_11_Calculator
 * ©2020
 *
 */

package calculator.data;

public class Calculator {
	// Attribute
	private double zahl1;
	private double zahl2;
	
	// Konstruktoren
	public Calculator() {
		super();
		this.zahl1 = 0;
		this.zahl2 = 0;
	}
		
	public Calculator(double zahl1, double zahl2) {
		super();
		this.zahl1 = zahl1;
		this.zahl2 = zahl2;
	}
	
	// Getter & Setter
	public double getZahl1() {
		return zahl1;
	}

	public void setZahl1(double zahl1) {
		this.zahl1 = zahl1;
	}

	public double getZahl2() {
		return zahl2;
	}

	public void setZahl2(double zahl2) {
		this.zahl2 = zahl2;
	}

	// Methoden
	public double addieren() {
		return this.zahl1 + this.zahl2;
	}
	
	public double subtrahieren() {
		return this.zahl1 - this.zahl2;
	}
	
	public double multiplizieren() {
		return this.zahl1 * this.zahl2;
	}
	
	public double dividieren() {
		return this.zahl1 / this.zahl2;
	}

}
