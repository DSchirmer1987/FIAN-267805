package pizza;

import pizza.bottoms.Bottom;
import pizza.bottoms.Crusty;
import pizza.bottoms.CuscinoSpeciale;
import pizza.bottoms.Munchy;
import pizza.toppings.Chili;
import pizza.toppings.Salami;

public class PizzaTest {
	private int zahl;
	public static void main(String[] args) {
		/*
		 * Erst alle un-scharfen vegetarischen Auflagen
		 * Dann alle scharfen, vegetarischen Auflagen
		 * Dann alle scharfen, nicht-vegetarischen Auflagen
		 * 
		 */
		
		Crusty cr = new Crusty();
		Munchy m = new Munchy();
		CuscinoSpeciale cs = new CuscinoSpeciale();
		
		Bottom[] bottoms = new Bottom[3];
		
		bottoms[0] = cr;
		bottoms[1] = m;
		bottoms[2] = cs;
		
		for (Bottom bottom : bottoms) {
			bottom.setAlter(5);
		}
	}

}
