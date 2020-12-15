/**
 * Daniel Schirmer
 *
 * 15.12.2020
 * Project : Tag_15
 * ©2020
 *
 */

package pizza;

import java.util.ArrayList;

import pizza.bottoms.Bottom;
import pizza.bottoms.Crusty;
import pizza.toppings.Cheese;
import pizza.toppings.Chili;
import pizza.toppings.Ham;
import pizza.toppings.Topping;

public class PizzaMain {

	public static void main(String[] args) {
		// Vegetarisch = Alle Toppings isVegetable:True
		// Scharf = min. 2 Toppings isHot:True
		// Pizza = min. Bottom
		
		
		pizzaTest1();
		pizzaTest2();
		pizzaTest3();
		pizzaTest4();
		
//		System.out.println("Pizza - Vegetarisch: " + pizza.isVegetable() + " Scharf: " + pizza.isHot() + " Preis: " + pizza.getPrice());
	}
	
	public static void pizzaTest1() {
		System.out.println("Bottom als Basis:");
		Bottom pizza = new Crusty();
		Topping chili1 = new Chili(pizza);
		Topping chili2 = new Chili(pizza);
		System.out.println("Pizza - Vegetarisch: " + pizza.isVegetable() + " Scharf: " + pizza.isHot() + " Preis: " + pizza.getPrice());	
		System.out.println("--------------");
	}
	
	public static void pizzaTest2() {
		System.out.println("Pizza als Basis:");
		Pizza pizza = new Crusty();
		pizza = new Chili(pizza);
		System.out.println("Pizza - Vegetarisch: " + pizza.isVegetable() + " Scharf: " + pizza.isHot() + " Preis: " + pizza.getPrice());
		System.out.println("--------------");
	}
	
	public static void pizzaTest3() {
		System.out.println("Pizza mit ArrayList:");
		ArrayList<Pizza> pizza = new ArrayList<Pizza>();
		pizza.add(new Crusty());
		pizza.add(new Chili(pizza.get(0)));
		pizza.add(new Ham(pizza.get(1)));
		
		boolean isScharf = false;
		boolean isVeggie = false;
		int preis = 0;
		int counterScharf = 0;
		int counterVeggie = 0;
		for (Pizza pizza2 : pizza) {
			if(!pizza2.isVegetable()) {
				counterVeggie++;
			}
			if(pizza2.isHot()) {
				counterScharf++;
			}
			preis = preis + pizza2.getPrice();
		}
		if(counterScharf >=2) {
			isScharf = true;
		}
		if(counterVeggie < 1) {
			isVeggie = true;
		}
		
		System.out.println("Pizza - Vegetarisch: " + isVeggie + " Scharf: " + isScharf + " Preis: " + preis);
		System.out.println("--------------");
	}
	
	public static void pizzaTest4() {
		System.out.println("Mit eigener Klasse:");
		ArrayList<Pizza> pizzaListe = new ArrayList<Pizza>();
		pizzaListe.add(new Crusty());
		pizzaListe.add(new Chili(pizzaListe.get(0)));
		pizzaListe.add(new Ham(pizzaListe.get(1)));
		PizzaOfen pizza = new PizzaOfen(pizzaListe);
		System.out.println("Pizza - Vegetarisch: " + pizza.isVegetable() + " Scharf: " + pizza.isHot() + " Preis: " + pizza.getPrice());
		System.out.println("--------------");
	}
}
