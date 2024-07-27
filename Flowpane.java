import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
public class Flowpane extends Application {
    @Override
    public void start(Stage s)throws Exception{
        Label l=new Label("Hii");
        Label l2=new Label ("Nice");
        FlowPane root =new FlowPane();
        root.getChildren().addAll(l,l2);
        Scene scene=new Scene(root,200,200);
        root.setHgap(3);
        s.setScene(scene);
        s.setTitle("FlowPane JFX");


        s.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
