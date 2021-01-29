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

public class Salami extends Topping {

	public Salami(Pizza below) {
		super(below);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		return this.getBelow().getPrice() + 225;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return false;
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
