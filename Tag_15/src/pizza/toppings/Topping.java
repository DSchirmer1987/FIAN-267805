/**
 * Daniel Schirmer
 *
 * 15.12.2020
 * Project : Tag_15
 * ©2020
 *
 */

package pizza.toppings;

import pizza.Pizza;

public abstract class Topping implements Pizza {
	private Pizza below;

	public Topping(Pizza below) {
		super();
		this.below = below;
	}

	public Pizza getBelow() {
		return below;
	}

	public void setBelow(Pizza below) {
		this.below = below;
	}
}
