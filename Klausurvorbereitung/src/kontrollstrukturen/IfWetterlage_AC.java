package kontrollstrukturen;
import java.util.Scanner;
	public class IfWetterlage_AC {
	//Macht Vorschl�ge aufgrund der ermittelten Wetterlage
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
	
			System.out.println("Bitte geben Sie die Au�emtemperatur an ");		
		
			int temp = sc.nextInt();
			//Eingabe wird von sc �bernommen und an die Variable temp �bergeben
			
			System.out.println("Regnet es? Wenn ja bitte 'true`und wenn nein bitte 'false' eingeben");
	
			boolean precipitation = sc.nextBoolean();			
			//Eingabe wird von sc �bernommen und an die Variable precipitation �bergeben
			
			if (precipitation == true) {
				if (temp<0) {
				System.out.println("Komm, geh'n wir Schlitten fahren!");
				} 
				else {
				System.out.println("Sauwetter");	
				}
			} 
			else if (precipitation == false) {
				if (temp<0) {
				System.out.println("Lass unsam Lagerfeuer Gl�hwein trinken");
				} 
				else if (temp>=20) {
				System.out.println("Gehen wir schwimmen?");	
					}
				else  {
					System.out.println("Gehen wir spazieren?");	
						}
				}
			//else {
				//System.out.println("Sie haben einen falschen Wert eingegeben");			
				//}
			//funktioniert beim Datentyp Boolean offensichtlich nicht
			}
		}
		
	

