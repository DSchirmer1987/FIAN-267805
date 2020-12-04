/**
 * Daniel Schirmer
 *
 * 04.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package bauernhofsimulator.flora;

public abstract class APflanze {
	private String name;
	private String gattung;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGattung() {
		return gattung;
	}
	public void setGattung(String gattung) {
		this.gattung = gattung;
	}
	
	public abstract void bluehen();
	
	public abstract void wirdGefressen();
}
