package aa224iu_assign2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CompoundInterest extends Application {
	public void start(Stage primaryStage) {

		// title
		primaryStage.setTitle("Compound Interest");
		Group root = new Group();

		// Vbox
		VBox box = new VBox();
		box.setPadding(new Insets(5, 5, 5, 5));
		box.setSpacing(5);

		// heading
		Label heading = new Label("Compound Interest");
		heading.setFont(new Font("Comfortaa", 42));

		// pane
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.4));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// start amount
		pane.add(new Label("Start amount: "), 0, 0);
		final TextField startAmount = new TextField();
		pane.add(startAmount, 2, 0);

		// interest
		pane.add(new Label("Interest:"), 0, 1);
		final TextField interest = new TextField();
		pane.add(interest, 2, 1);

		// years
		pane.add(new Label("Number of years:"), 0, 2);
		final TextField year = new TextField();
		pane.add(year, 2, 2);

		// calculate
		Button calculate = new Button("Calculate");
		pane.add(calculate, 0, 3);

		// printout
		Label count = new Label();
		pane.add(count, 0, 4);

		// principal * Math.pow((1 + rate/100),time);
		calculate.setOnAction(e -> {
			count.setText("In total that will be " + (Math.round(Double.valueOf(startAmount.getText())
					* Math.pow((1 + (Double.valueOf(interest.getText()) / 100)), Double.valueOf(year.getText()))))

			);
		});

		// add
		box.getChildren().addAll(heading, pane);
		Scene scene = new Scene(root, 400, 250);
		root.getChildren().addAll(box);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
