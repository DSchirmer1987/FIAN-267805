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
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LayoutDemoFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane grid = new GridPane();
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(10,10,10,10));
		
		Label header = new Label("Kundendaten");
		header.setFont(new Font(20));
		
		grid.add(header, 0, 0, 2, 1);
		grid.add(new Label("Name"),0,1);
		grid.add(new TextField(), 1, 1);
		
		primaryStage.setScene(new Scene(grid));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
