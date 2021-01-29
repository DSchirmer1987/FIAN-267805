package pizza;

import pizza.bottoms.Crusty;
import pizza.toppings.Chili;
import pizza.toppings.Salami;

public class PizzaTest {

	public static void main(String[] args) {
		/*
		 * Erst alle un-scharfen vegetarischen Auflagen
		 * Dann alle scharfen, vegetarischen Auflagen
		 * Dann alle scharfen, nicht-vegetarischen Auflagen
		 * 
		 */
		
		Pizza pizza = new Crusty();
		pizza = new Chili(pizza);
		pizza = new Salami(pizza);
		
		System.out.println("Als ein Objekt");
		System.out.println(pizza.getPrice());
		System.out.println(pizza.isVegetable());
		System.out.println(pizza.isHot());
	}

}
