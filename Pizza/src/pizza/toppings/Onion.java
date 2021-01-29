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

public class Onion extends Topping {

	public Onion(Pizza below) {
		super(below);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 65;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return false;
	}

}
