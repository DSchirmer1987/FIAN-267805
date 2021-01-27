package interfaces.beispiel;

public class TestDruck {

	public static void main(String[] args) {
		IKombi drucker;
		
		drucker = new EasyOfficePrinter();
		drucker.drucken("Hallo");
		
		drucker = new SimpleOfficePrinter();
		drucker.drucken("Hallo");
	}

}
