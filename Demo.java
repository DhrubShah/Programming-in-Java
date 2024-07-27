import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
public class Demo extends Application {
@Override
public void start(Stage s)throws Exception{
	Button btn1=new Button("btn1");
	Button btn2=new Button ("Btn2");
	HBox root=new HBox();
	root.getChildren().addAll(btn1,btn2);
	Scene scene=new Scene(root,400,400);
	s.setScene(scene);
	s.setTitle("java fx");
	s.show();
	
}
	public static void main(String[] args) {
		launch(args);	}

}
