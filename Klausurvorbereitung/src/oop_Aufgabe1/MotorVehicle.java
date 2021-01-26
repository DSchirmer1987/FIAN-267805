/**
 * Daniel Schirmer
 *
 * 03.12.2020
 * Project : Tag_06
 * ©2020
 *
 */

package oop_Aufgabe1;

public class MotorVehicle {
	private double width;
	private double height;
	private double length;
	private double weight;
	private String carBrand;
	private String customer;
	private Adress fromAdresse;
	private Adress toAdresse;
	
	public MotorVehicle() {
		super();
		this.width = 150;
		this.height = 150;
		this.length = 150;
		this.weight = 1000;
		this.carBrand = "VW";
		this.customer = "Kunde";
		this.fromAdresse = new Adress();
		this.toAdresse = new Adress();
	}

	public MotorVehicle(double width, double height, double length, int weight, String carBrand, String customer,
			Adress fromAdresse, Adress toAdresse) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
		this.weight = weight;
		this.carBrand = carBrand;
		this.customer = customer;
		this.fromAdresse = fromAdresse;
		this.toAdresse = toAdresse;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Adress getFromAdresse() {
		return fromAdresse;
	}

	public void setFromAdresse(Adress fromAdresse) {
		this.fromAdresse = fromAdresse;
	}

	public Adress getToAdresse() {
		return toAdresse;
	}

	public void setToAdresse(Adress toAdresse) {
		this.toAdresse = toAdresse;
	}

	@Override
	public String toString() {
		return "MotorVehicle [width=" + width + ", height=" + height + ", length=" + length + ", weight=" + weight
				+ ", carBrand=" + carBrand + ", customer=" + customer + ", fromAdresse=" + fromAdresse + ", toAdresse="
				+ toAdresse + "]";
	}
	
	public String printMotorVehicle() {
		String returnString;
		returnString =  "Größe des Fahrzeuges: "+this.getLength()+" x "+this.getWidth()+" x "+this.getHeight()+"\n";
		returnString += "Gewicht: "+this.getWeight()+"\n";
		returnString += "Automarke: "+this.getCarBrand()+"\n";
		returnString += "Absenderadresse: "+this.getFromAdresse().printAddress();
		returnString += "Zieladresse:" + this.getToAdresse().printAddress();
		return returnString;
	}
	
	
}
