import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
public class Vbox extends Application{
    @Override
    public void start(Stage s){
        Button b1=new Button();
        Button b2=new Button();
        Button b3=new Button();
        VBox root=new VBox();
        root.getChildren().addAll(b1,b2,b3);
        Scene scene=new Scene(root,200,200);
        s.setScene(scene);
        s.setTitle("VBOX JFX");
      
        s.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
