
public class Beispiel {

	public static void main(String[] args) {
		int i = 6;
		while (i <= 5) {
			System.out.println("While:" + i);
			i++;
		}
		
		i = 6;
		do {
			System.out.println("Do-While:" +  i);
			i++;
		} while (i <= 5);
		
		
		for(int j = 0; j <= 5; j++) {
			System.out.println(j);
		}
		
		
		int[] array1 = new int[] {1,2,3,4,5};
		for (int j : array1) {
			System.out.println(j);
		}
	}

}
