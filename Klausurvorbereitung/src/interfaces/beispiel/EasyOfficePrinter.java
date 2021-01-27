package interfaces.beispiel;

public class EasyOfficePrinter implements IKombi {

	@Override
	public void drucken(String text) {
		System.out.println("Druckt von links nach rechts");

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
