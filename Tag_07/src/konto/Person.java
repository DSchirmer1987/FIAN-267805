/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_07
 * ©2020
 *
 */

package konto;

public class Person {
	private String name;
	private String vorname;
	
	public void setName (String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setVorname (String n){
		vorname = n;
	}
	public String getVorname(){
		return vorname;
	}
	
	public Person(String name, String vorname) {
		super();
		this.name = name;
		this.vorname = vorname;
	}
	
	@Override
	public String toString() {
		return "person [name=" + name + ", vorname=" + vorname + "]";
	}
}
