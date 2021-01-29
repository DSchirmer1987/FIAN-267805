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
import pizza.bottoms.Bottom;

public class Chili extends Topping {

	public Chili(Pizza below) {
		super(below);
	}

	@Override
	public int getPrice() {
		return this.getBelow().getPrice() + 225;
	}

	@Override
	public boolean isVegetable() {
		return true;
	}

	@Override
	public boolean isHot() {
		if(this.getBelow() instanceof Bottom ) {
			return false;
		}else if (this.getBelow() instanceof Salami) {
			return true;
		} else if( this.getBelow() instanceof Chili) {
			return true;
		} else {
			return false;
		}
	}

}
