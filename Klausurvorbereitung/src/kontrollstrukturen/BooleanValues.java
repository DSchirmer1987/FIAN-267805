package kontrollstrukturen;

public class BooleanValues {

	public static void main(String[] args) {
		boolean wert1, wert2;
		
		wert1 = false;
		wert2 = false;
		for(int i = 0; i < 2; i++) {
			if(i==1) {
				wert1 = !wert1;
			}
			for(int j = 0; j < 2; j++) {
				if(j==1) {
					wert2 = !wert2;
				}
				System.out.println(wert1 + " && " + wert2 + " liefert " + (wert1&&wert2));
				System.out.println(wert1 + " || " + wert2 + " liefert " + (wert1||wert2));
				System.out.println(wert1 + " ^  " + wert2 + " liefert " + (wert1^wert2));
				System.out.println();
			}
		}
		
		int a;
		int b;
		a = 5;
		b = 6;
		
		System.out.println( (((a + 5) == 10) && ((b+4) == 10)) );
		
//		Welche ausgabe erhalten wir?
//		a) True
//		b) False
		
		for(int i = 5; i < 25; i++) {
			System.out.println(i);
		}
		/*
		 * Was wird ausgegeben:
		 * 
		 * a) 1 - 25
		 * b) 5 - 24
		 * c) 25 - 1
		 * d) 1 - 24
		 */
	}

}
