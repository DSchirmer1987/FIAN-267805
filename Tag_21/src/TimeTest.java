import java.util.ArrayList;

/**
 * Daniel Schirmer
 *
 * 13.01.2021
 * Project : Tag_21
 * ©2021
 *
 */

public class TimeTest {
	private static ArrayList<Integer> aL;
	
	public static void main(String[] args) {
		aL = new ArrayList<Integer>();
		System.out.println("From start: " + fillFromStart(aL, 500000));
		aL = new ArrayList<Integer>();
		System.out.println("From end: " + fillFromEnd(aL, 500000));
		aL = new ArrayList<Integer>();
		System.out.println("From Random: " + fillOnRandom(aL, 500000));
		
	}
	
	public static long fillFromStart(ArrayList<Integer> list, int elements) {
		long start = System.currentTimeMillis();
		for(;elements > 0; elements--) {
			list.add(elements);
		}
		return System.currentTimeMillis() - start;
	}
	
	public static long fillFromEnd(ArrayList<Integer> list, int elements) {
		long start = System.currentTimeMillis();
		for(;elements > 0; elements--) {
			list.add(list.size(), elements);
		}
		return System.currentTimeMillis() - start;
	}
	
	public static long fillOnRandom(ArrayList<Integer> list, int elements) {
		long start = System.currentTimeMillis();
		for(;elements > 0; elements--) {
			list.add(((int) (Math.random() * (list.size() + 1))), elements );
		}
		return System.currentTimeMillis() - start;
	}

}
