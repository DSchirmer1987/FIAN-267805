/**
 * Daniel Schirmer
 *
 * 08.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package guidemo;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIdemoFX extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Das Fenster mit JavaFX");
		primaryStage.show();
	}

}
