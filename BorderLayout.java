import java.awt.*;
public class BorderLayout {
    Frame f;
    Button North;
    Button South;
    Button West;
    Button Center;
    Button East;
    public BorderLayout(){
        f=new Frame("Example");
        f.setSize(500,500);

        North=new Button("North");
        South=new Button("South");
        West=new Button("West");

        Center=new Button("Center");

        East=new Button("East");
        f.add(North,BorderLayout.NORTH);
        f.add(South,BorderLayout.SOUTH);
        f.add(West,BorderLayout.WEST);
        f.add(Center,BorderLayout.CENTER);
        f.add(East,BorderLayout.EAST);
        f.setLayout(BorderLayout(20,13));
        f.setVisible(true);






    }
    


    public static void main(String[] args) {
        new BorderLayout();
    }
}
