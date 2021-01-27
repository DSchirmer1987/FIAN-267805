package interfaces.beispiel;

public class SimpleOfficePrinter implements IKombi {

	@Override
	public void drucken(String text) {
		System.out.println("Druckt von rechts nach links.");

	}

	@Override
	public void scannen(String papier) {
		// TODO Auto-generated method stub

	}

	@Override
	public String kopieren(String original) {
		// TODO Auto-generated method stub
		return null;
	}

}
