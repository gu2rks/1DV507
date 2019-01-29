package aa224iu_assign2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snowman extends Application {
	public void start(Stage primaryStage) {
		Group root = new Group();

		Rectangle sky = new Rectangle();
		sky.setHeight(350);
		sky.setWidth(800);
		// for color. search for java color on google
		sky.setFill(Color.DEEPSKYBLUE);

		// circle(x,y,diameter)
		Circle bottom = new Circle(400, 290, 60);
		bottom.setFill(Color.WHITE);

		Circle middle = new Circle(400, 200, 40);
		middle.setFill(Color.WHITE);

		Circle top = new Circle(400, 135, 30);
		top.setFill(Color.WHITE);

		Circle b1 = new Circle(400, 200, 5);
		b1.setFill(Color.BLACK);

		Circle b2 = new Circle(400, 185, 5);
		b2.setFill(Color.BLACK);

		Circle b3 = new Circle(400, 215, 5);
		b3.setFill(Color.BLACK);

		Circle eye1 = new Circle(390, 133, 3);
		eye1.setFill(Color.BLACK);

		Circle eye2 = new Circle(410, 133, 3);
		eye2.setFill(Color.BLACK);

		// Line(startx,starty,endx,endy)
		Line mouth = new Line(395, 150, 405, 150);
		mouth.setFill(Color.BLACK);

		// Image theImage = new
		// Image("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu_assign2\\deathstar.jpg");
		// ImageView star = new ImageView();
		// star.setFitHeight(100);
		// star.setFitHeight(100);
		// star.setImage(theImage);

		Circle sun = new Circle(700, 70, 50);
		sun.setFill(Color.YELLOW);

		root.getChildren().addAll(sky, bottom, middle, top, 
				b1, b2, b3, eye1, eye2, mouth, sun);
		Scene scene = new Scene(root, 800, 500);
		primaryStage.setTitle("Snowman");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}
