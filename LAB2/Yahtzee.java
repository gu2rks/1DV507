package aa224iu_assign2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Yahtzee extends Application {

	// all imageView
	ImageView set1 = new ImageView();
	ImageView set2 = new ImageView();
	ImageView set3 = new ImageView();
	ImageView set4 = new ImageView();
	ImageView set5 = new ImageView();

	// all checkBox
	CheckBox c1 = new CheckBox();
	CheckBox c2 = new CheckBox();
	CheckBox c3 = new CheckBox();
	CheckBox c4 = new CheckBox();
	CheckBox c5 = new CheckBox();

	public void start(Stage primaryStage) throws FileNotFoundException {

		// title
		primaryStage.setTitle("Yahtzee");
		Group root = new Group();

		// heading
		Label heading = new Label("Yahtzee");
		heading.setFont(new Font("Comfortaa", 32));

		// dice pic
		HBox pic = new HBox();
		pic.setPadding(new Insets(50, 90, 5, 5));
		pic.setSpacing(20);

		// set pic
		set1.setFitHeight(50);
		set1.setFitWidth(50);
		ranDice(1);

		set2.setFitHeight(50);
		set2.setFitWidth(50);
		ranDice(2);

		set3.setFitHeight(50);
		set3.setFitWidth(50);
		ranDice(3);

		set4.setFitHeight(50);
		set4.setFitWidth(50);
		ranDice(4);

		set5.setFitHeight(50);
		set5.setFitWidth(50);
		ranDice(5);

		pic.getChildren().addAll(set1, set2, set3, set4, set5);

		// box for check box
		HBox allCheck = new HBox();
		allCheck.setLayoutX(15);
		allCheck.setPadding(new Insets(105, 50, 5, 5));
		allCheck.setSpacing(50);
		allCheck.getChildren().addAll(c1, c2, c3, c4, c5);

		// Hbox for roll and printout
		HBox box = new HBox();
		box.setPadding(new Insets(130, 5, 5, 5));
		box.setSpacing(5);

		// print out
		Label printOut = new Label();
		printOut.setText("You have 3 rolls left.");

		
		// Button... let action begin
		Button roll = new Button("roll the dice");
		roll.setOnAction(e -> {

			try {

				if (c1.isSelected() == false)
					ranDice(1);
				if (c2.isSelected() == false)
					ranDice(2);
				if (c3.isSelected() == false)
					ranDice(3);
				if (c4.isSelected() == false)
					ranDice(4);
				if (c5.isSelected() == false)
					ranDice(5);

			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}
			countRoll();

			if (count == 1)
				printOut.setText("You have 2 rolls left.");

			if (count == 2)
				printOut.setText("You have 1 rolls left.");

			if (count == 3) {
				putArr();				
				roll.setDisable(true);
				for (int i = 1; i < arr.length; i++) {
					if (arr[i] == 5) {
						printOut.setText("YAHTZEE");
					}
					if (arr[i] == 4) {
						printOut.setText("Four of a kind");
					}
				}
				// full house or 3 of a kind
				if ((arr[1] == 3) || (arr[2] == 3) || (arr[3] == 3) || (arr[4] == 3) || (arr[5] == 3)
						|| (arr[6] == 3)) {

					if ((arr[1] == 2) || (arr[2] == 2) || (arr[3] == 2) || (arr[4] == 2) || (arr[5] == 2)
							|| (arr[6] == 2)) {
						printOut.setText("Full House");
					} else {
						printOut.setText("There of a kind");
					}
				}
				// pair
				else if ((arr[1] == 2) || (arr[2] == 2) || (arr[3] == 2) || (arr[4] == 2) || (arr[5] == 2)
						|| (arr[6] == 2)) {
					printOut.setText("Pair");
				}
				// Small Straight
				if ((arr[1] == 1) && (arr[2] == 1) && (arr[3] == 1) && (arr[4] == 1) && (arr[5] == 1)) {
					printOut.setText("Small Straight");
				}
				// Large Straight
				if ((arr[6] == 1) && (arr[2] == 1) && (arr[3] == 1) && (arr[4] == 1) && (arr[5] == 1)) {
					printOut.setText("Large Straight");
				}
			}
		}

		);

		box.getChildren().addAll(roll, printOut);
		Scene scene = new Scene(root, 350, 200);
		root.getChildren().addAll(box, heading, pic, allCheck);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// for counting
	private int count;

	private void countRoll() {
		count++;
	}

	// for checking
	private int dice1, dice2, dice3, dice4, dice5;
	int[] arr = new int[7];

	public void putArr() {

		arr[dice1]++;
		arr[dice2]++;
		arr[dice3]++;
		arr[dice4]++;
		arr[dice5]++;

	}

	public void ranDice(int x) throws FileNotFoundException {

		Image png1 = new Image(
				new FileInputStream("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu_assign2\\1.png"));
		Image png2 = new Image(
				new FileInputStream("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu_assign2\\2.png"));
		Image png3 = new Image(
				new FileInputStream("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu_assign2\\3.png"));
		Image png4 = new Image(
				new FileInputStream("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu_assign2\\4.png"));
		Image png5 = new Image(
				new FileInputStream("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu_assign2\\5.png"));
		Image png6 = new Image(
				new FileInputStream("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu_assign2\\6.png"));

		// put image in imageview
		if (x == 1) {
			Random r = new Random();
			int random = r.nextInt(6) + 1;

			switch (random) {
			case 1:
				set1.setImage(png1);
				break;
			case 2:
				set1.setImage(png2);
				break;
			case 3:
				set1.setImage(png3);
				break;
			case 4:
				set1.setImage(png4);
				break;
			case 5:
				set1.setImage(png5);
				break;
			case 6:
				set1.setImage(png6);
				break;
			default:
				break;
			}

			dice1 = random;

		}

		if (x == 2) {
			Random r = new Random();
			int random = r.nextInt(6) + 1;

			switch (random) {
			case 1:
				set2.setImage(png1);
				break;
			case 2:
				set2.setImage(png2);
				break;
			case 3:
				set2.setImage(png3);
				break;
			case 4:
				set2.setImage(png4);
				break;
			case 5:
				set2.setImage(png5);
				break;
			case 6:
				set1.setImage(png6);
				break;
			default:
				break;

			}

			dice2 = random;

		}

		if (x == 3) {
			Random r = new Random();
			int random = r.nextInt(6) + 1;

			switch (random) {
			case 1:
				set3.setImage(png1);
				break;
			case 2:
				set3.setImage(png2);
				break;
			case 3:
				set3.setImage(png3);
				break;
			case 4:
				set3.setImage(png4);
				break;
			case 5:
				set3.setImage(png5);
				break;
			case 6:
				set3.setImage(png6);
				break;
			default:
				break;
			}

			dice3 = random;

		}
		if (x == 4) {
			Random r = new Random();
			int random = r.nextInt(6) + 1;

			switch (random) {
			case 1:
				set4.setImage(png1);
				break;
			case 2:
				set4.setImage(png2);
				break;
			case 3:
				set4.setImage(png3);
				break;
			case 4:
				set4.setImage(png4);
				break;
			case 5:
				set4.setImage(png5);
				break;
			case 6:
				set4.setImage(png6);
				break;
			default:
				break;
			}

			dice4 = random;

		}
		if (x == 5) {
			Random r = new Random();
			int random = r.nextInt(6) + 1;

			switch (random) {
			case 1:
				set5.setImage(png1);
				break;
			case 2:
				set5.setImage(png2);
				break;
			case 3:
				set5.setImage(png3);
				break;
			case 4:
				set5.setImage(png4);
				break;
			case 5:
				set5.setImage(png5);
				break;
			case 6:
				set5.setImage(png6);
				break;
			default:
				break;
			}

			dice5 = random;

		}

	}

	public static void main(String[] args) {
		launch(args);

	}
}
