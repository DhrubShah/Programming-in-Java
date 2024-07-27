import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class Gridpane extends Application{
    @Override
    public void start(Stage s){
        Label uname=new Label("User Name");
        Label psd=new Label("Password");
        TextField t=new TextField();
        PasswordField p=new PasswordField();
        Button b=new Button("Login");
        GridPane root=new GridPane();
        root.addColumn(0, uname,psd);
        root.addColumn(1, t,p,b);
        Scene scene=new Scene(root,200,200);
        s.setScene(scene);
        s.setTitle("GridLayout");
        s.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
