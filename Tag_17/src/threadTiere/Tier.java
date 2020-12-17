/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_17
 * ©2020
 *
 */

package threadTiere;

public abstract class Tier {
	private String name;
	private int alter;
	private boolean gesund;
	
	public Tier(String name, int alter, boolean gesund) {
		super();
		this.name = name;
		this.alter = alter;
		this.gesund = gesund;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public boolean isGesund() {
		return gesund;
	}

	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}
	
	public abstract void laufen();
}
