
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
public class Borderpane extends Application {
    @Override
    public void start(Stage s){
        Label top=new Label("Top");
        Label bottom=new Label("Bottom");
        Label right=new Label("Right");
        Label left=new Label("Left");
        Label center=new Label("Center"); 
        BorderPane root=new BorderPane();
        root.setRight(right);
        root.setLeft(left);
        root.setBottom(bottom);
        root.setTop(top);
        root.setCenter(center);

        Scene scene=new Scene(root,200,400);
        s.setScene(scene);
        s.setTitle("BorderPane JFX");





        s.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
