/**
 * Daniel Schirmer
 *
 * 15.12.2020
 * Project : Tag_15
 * �2020
 *
 */

package pizza.bottoms;

import pizza.Pizza;

public abstract class Bottom implements Pizza {
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
