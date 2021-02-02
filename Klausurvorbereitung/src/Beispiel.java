
public class Beispiel {

	public static void main(String[] args) {
		int i = 6;
		System.out.println(i^=5);
		System.out.println(i|=5);
		System.out.println(i<<=5);
		System.out.println(i>>=5);
	}
	
	public static int unreachable(int i) {
		if (i <= 5) {
			return i;
		} else if ( i == 5) {
			return i;
		}
		return i;
	}

}
