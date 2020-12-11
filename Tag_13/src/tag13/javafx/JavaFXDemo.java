/**
 * Daniel Schirmer
 *
 * 11.12.2020
 * Project : Tag_13
 * ©2020
 *
 */

package tag13.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text t = new Text("Hallo JavaFX");
		t.setX(10.0);
		t.setY(50.0);
		t.setFont(Font.font("Calibri", FontWeight.NORMAL, 30));
		t.setEffect(new Reflection());
		
		Group root = new Group(t);
		Scene scene = new Scene(root, 400, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX Demo");
		primaryStage.show();
	}
}
