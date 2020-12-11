/**
 * Daniel Schirmer
 *
 * 20.07.2018
 * Project : Fahrscheinautomat
 * ©2018
 *
 */

package fahrscheinautomat.gui;

import java.net.URL;
import java.util.ResourceBundle;

import fahrscheinautomat.data.Fahrscheinautomat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class FahrscheinautomatController implements Initializable {

	private Fahrscheinautomat fahrscheinautomat;
	private char preisstufe;
	@FXML Label lblPreis;
	@FXML Label lblChange;
	@FXML Label lblBezahlt;
	@FXML GridPane geldPane;
	@FXML GridPane tarifPane;
	@FXML Label change200;
	@FXML Label change100;
	@FXML Label change50;
	@FXML Label change20;
	@FXML Label change10;
	@FXML Label change5;
	@FXML Label change2;
	@FXML Label change1;
	Label[] lblChanges;

	@FXML
	public void handleTarifButton(ActionEvent event) {
		this.preisstufe = event.getSource().toString().substring(10, 11).charAt(0);
		lblPreis.setText("Kosten: \n" + fahrscheinautomat.sucheFahrschein(preisstufe).getPreisEuro());
		lblBezahlt.setText("Eingeworfen: \n" + fahrscheinautomat.getGeldEinwurfEuro());
		geldPane.setDisable(false);
		tarifPane.setDisable(true);
	}

	@FXML
	public void handleGeldButton(MouseEvent event) {
		int i = event.getSource().toString().indexOf("=");
		int j = event.getSource().toString().indexOf(",");
		fahrscheinautomat.bezahlen(fahrscheinautomat.sucheFahrschein(preisstufe).getPreisCent(), Integer.parseInt(event.getSource().toString().substring(i + 1, j)));
		lblBezahlt.setText("Eingeworfen: \n" + fahrscheinautomat.getGeldEinwurfEuro() + "\n Übrig: \n" + fahrscheinautomat.getRestGeldEuro());
		lblBezahlt.setVisible(true);
		lblChange.setText("Rückgeld: \n" + fahrscheinautomat.getWechselGeldEuro());
		lblChange.setVisible(fahrscheinautomat.isBezahlt());
		geldPane.setDisable(fahrscheinautomat.isBezahlt());
		if(fahrscheinautomat.isBezahlt()) {
			for (int k = 0; k < lblChanges.length; k++) {
				lblChanges[k].setText(Integer.toString(fahrscheinautomat.getMuenzen()[k]) + " x ");
			}
		}

	}

	@FXML
	public void reset() {
		fahrscheinautomat.reset();
		lblPreis.setText("Bitte Tarif wählen!");
		lblBezahlt.setVisible(false);
		lblChange.setVisible(fahrscheinautomat.isBezahlt());
		geldPane.setDisable(true);
		tarifPane.setDisable(false);
		for (int k = 0; k < lblChanges.length; k++) {
			lblChanges[k].setText("");
		}
	}
	
	@FXML
	public void closing() {
		System.exit(0);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		fahrscheinautomat = new Fahrscheinautomat();
		fahrscheinautomat.addFahrschein('K', 140);
		fahrscheinautomat.addFahrschein('A', 230);
		fahrscheinautomat.addFahrschein('B', 470);
		fahrscheinautomat.addFahrschein('C', 960);
		fahrscheinautomat.addFahrschein('D', 1140);
		lblChanges = new Label[] {change200, change100, change50, change20, change10, change5, change2, change1};
	}

}
