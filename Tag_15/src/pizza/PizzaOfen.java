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

public class PizzaOfen implements Pizza{
	ArrayList<Pizza> pizza;
	
	public PizzaOfen() {
		super();
		this.pizza = new ArrayList<Pizza>();
	}

	public PizzaOfen(ArrayList<Pizza> pizza) {
		super();
		this.pizza = pizza;
	}

	public ArrayList<Pizza> getPizza() {
		return pizza;
	}

	public void setPizza(ArrayList<Pizza> pizza) {
		this.pizza = pizza;
	}
	
	public void addPizza(Pizza pizza) {
		this.pizza.add(pizza);
	}
	
	public boolean isVegetable() {
		boolean veggie = true;
		for (Pizza pizza2 : this.pizza) {
			if(!pizza2.isVegetable()) {
				veggie = false;
			}
		}
		return veggie;
	}
	
	public boolean isHot() {
		boolean hot = false;
		int counter = 0;
		for (Pizza pizza2 : this.pizza) {
			if(pizza2.isHot()) {
				counter++;
			}
		}
		if(counter >=2) {
			hot = true;
		}
		return hot;
	}
	
	public int getPrice() {
		int preis = 0;
		for (Pizza pizza2 : this.pizza) {
			preis = preis + pizza2.getPrice();
		}
		return preis;
	}
}
