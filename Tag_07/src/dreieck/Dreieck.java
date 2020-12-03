/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package dreieck;

import java.util.Scanner;

public class Dreieck {
	private Punkt p1;
	private Punkt p2;
	private Punkt p3;
	
	public Punkt getP1() {
		return p1;
	}
	public void setP1(Punkt p1) {
		this.p1 = p1;
	}
	public Punkt getP2() {
		return p2;
	}
	public void setP2(Punkt p2) {
		this.p2 = p2;
	}
	public Punkt getP3() {
		return p3;
	}
	public void setP3(Punkt p3) {
		this.p3 = p3;
	}
	
	public Dreieck(Punkt p1, Punkt p2, Punkt p3) {
		super();
		System.out.println ("Dreieck wird erzeugt aus 3 Eckpunkten");
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public double entfernung (Punkt q1, Punkt q2){
		return Math.sqrt ((q1.getX() - q2.getX()) *
				(q1.getX() - q2.getX()) +
				(q1.getY() - q2.getY()) *
				(q1.getY() - q2.getY()));
	}
	
	public double umfang(){
		// u = s1 + s2 + s3.
		double u = 0.00d;
		u = Math.round((entfernung(p1, p2) + entfernung(p2, p3) + entfernung(p3, p1)) * 100.0) / 100.0;
		return u;
	}
}
