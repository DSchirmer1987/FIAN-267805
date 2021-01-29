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

public class Ham extends Topping {

	public Ham(Pizza below) {
		super(below);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 245;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return false;
	}

}
