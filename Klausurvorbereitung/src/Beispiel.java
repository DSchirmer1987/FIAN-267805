
public class Beispiel {

	public static void main(String[] args) {
		int i = 6;
		System.out.println(i^=5);
		System.out.println(i|=5);
		System.out.println(i<<=5);
		System.out.println(i>>=5);
		
		int[] array1 = new int[5];
		String[] array2 = new String[5];
		boolean[] array3 = new boolean[5];
		for (boolean j : array3) {
			System.out.println(j);
		}
		
		int zahl = 5;
		int zweiteZahl = 10;
		System.out.println(zahl % zweiteZahl);

	}
	
	public static void unreachable(int i) {
		for(int j = 5; j<5;j++) {
			System.out.println("Klein");
		}
	}

}
