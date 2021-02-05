import java.util.Scanner;

public class Beispiel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String eingabe;
		boolean laufen = true;
		
		System.out.println("Bitte geben Sie etwas ein:");
		System.out.println("Tippen sie Ende zum beenden");
		eingabe = sc.nextLine();
		
		if(eingabe.equals("Ende")) {
			laufen = false;
		}

	}

}
