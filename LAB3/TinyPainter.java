package aa224iu__assign3;

import javafx.application.Application;
import javafx.event.ActionEvent;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;

public class TinyPainter extends Application {

	public void start(Stage primaryStage) {
		// Hbox setting
		HBox layout = new HBox();
		layout.setPadding(new Insets(5, 5, 5, 5));
		layout.setSpacing(10);

		// all tool
		ComboBox<String> shape = new ComboBox<>();
		shape.getItems().addAll("Line", "Dot", "Rectangle", "Circle");
		ComboBox<Integer> size = new ComboBox<>();
		size.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
				25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
		ColorPicker colorPicker = new ColorPicker();
		Alert alert = new Alert(AlertType.WARNING);
		layout.getChildren().addAll(shape, size, colorPicker);

		// papper to draw
		Canvas draw = new Canvas(500, 400);
		GraphicsContext g = draw.getGraphicsContext2D();

		// fixing layout
		BorderPane bp = new BorderPane();
		bp.setTop(layout);
		bp.setCenter(draw);		
		

		// let the action begin
		shape.setOnAction((ActionEvent event) -> {
			//default setting. without this, my code is fucked
			draw.setOnMousePressed(e -> {
			});
			
			draw.setOnMouseReleased(e -> {
			});
			
			draw.setOnMouseDragged(e ->{
			});
			
			//line
			if (shape.getValue().equals("Line")) {
				
				draw.setOnMouseDragged(e -> {
					if (size.getValue()==null) {
						alert.setTitle("I'm warning you!");
						alert.setHeaderText("Pls choose the size");
						alert.showAndWait();
					}
					else {
					int sz = size.getValue();
					double x = e.getX() - sz / 2;
					double y = e.getY() - sz / 2;					
					g.setFill(colorPicker.getValue());
					g.fillRect(x, y, sz, sz);
					}
				
				});
				
			}
			
			// DOT
			if (shape.getValue().equals("Dot")) {
				if (size.getValue()==null) {
					alert.setTitle("I'm warning you!");
					alert.setHeaderText("Pls choose the size");
					alert.showAndWait();
				}
				else {
				draw.setOnMousePressed(e -> {
					int sz = size.getValue();
					double x = e.getX() - sz / 2;
					double y = e.getY() - sz / 2;
					g.setFill(colorPicker.getValue());
					g.fillOval(x, y, sz, sz);
				});
				}
			}
			// Rectangle
			if (shape.getValue().equals("Rectangle")) {
				draw.setOnMousePressed(e -> {
					double x = e.getX();
					double y = e.getY();

					draw.setOnMouseReleased(w -> {
						double width = w.getX() - x;
						double height = w.getY() - y;
						g.setFill(colorPicker.getValue());
						g.fillRect(x, y, width, height);
					});

				});
			}
			//Circle
			if (shape.getValue().equals("Circle")) {
				draw.setOnMousePressed(e -> {
					double x = e.getX();
					double y = e.getY();

					draw.setOnMouseReleased(w -> {
						double diameter = (w.getX() - x) *2;
						
						g.setFill(colorPicker.getValue());
						g.fillOval( x - diameter  / 2, y - diameter / 2, diameter , diameter );
					});
				});
			}
		});

		Scene scene = new Scene(bp, 500, 400);
		primaryStage.setTitle("Tiny Painter");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] agrs) {
		launch(agrs);
	}
}
