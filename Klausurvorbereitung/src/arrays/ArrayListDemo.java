package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> zahlenListe = new ArrayList<Integer>();
		
		for(int i = 0; i<10; i++) {
			zahlenListe.add((int) (Math.random()*10 + 1));
		}
		
		System.out.println(zahlenListe);
		
		Collections.reverse(zahlenListe);
		System.out.println(zahlenListe);
		
		System.out.println(Collections.max(zahlenListe));
		System.out.println(Collections.min(zahlenListe));
	}

}
