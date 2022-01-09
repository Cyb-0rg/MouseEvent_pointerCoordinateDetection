package drawLine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ballLine extends Application{
	
	Label label1 = new Label ("label");
	Text text1 =new Text ("text");
	Line line1 = new Line();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		Pane pane = new Pane();
		
		
		label1.setLayoutX(10);
		label1.setLayoutY(10);
		
		
		text1.setLayoutX(280);
		text1.setLayoutY(300);	
		
		

		line1.setFill(Color.FORESTGREEN);
		
		  line1.setStartX(12); line1.setStartY(12);
		  
			/* line1.setEndX(20); line1.setEndY(20); */
		 
		
		
		pane.getChildren().addAll(label1,text1, line1);
		
		Scene scene =new Scene (pane, 600,600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		scene.setOnMouseMoved(e ->mouseMotion(e));
		
		
	}
	
	public void mouseMotion(MouseEvent e){
		
		label1.setLayoutX( e.getX() );
		label1.setLayoutY( e.getY() );
		
		text1.setText( e.getX() +", "+ e.getY() );
		System.out.println( e.getX() +", "+ e.getY() );
		
		
		
		  line1.setStartX(e.getX()); 
		  line1.setStartY(e.getY());
		  
		  line1.setEndX( e.getX()+10.1); 
		  line1.setEndY( e.getY()+10.1 );
		 
		
	}
	
	
	
	
	

}
