package oop;

public class Start {

	public static void main(String[] args) {
		Auto car;
		car = new Auto("BMW", 300);
		
		Auto car2 = new Auto("Mercedes", 350);
		
		car.setName("Honda");
		car.setPs(150);
		car2.setName("Honda");
		
		System.out.println(car);
		System.out.println(car.equals(car2));
		System.out.println(car == car2);
	}

}
