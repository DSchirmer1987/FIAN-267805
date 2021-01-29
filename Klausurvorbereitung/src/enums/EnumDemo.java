package enums;

import java.util.Arrays;

public class EnumDemo {

	public static void main(String[] args) {
		Color c;
		c = Color.Yellow;
				
		if(c == Color.Red) {
			System.out.println("Gelb");
		} else {
			System.out.println("Rot");
		}
		System.out.println(c.isBright());
		
		System.out.println(Arrays.toString(c.getColorValues()));
	}

}
