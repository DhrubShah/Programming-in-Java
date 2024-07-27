import java.awt.*;
import java.awt.event.*;
public class Closable  extends WindowAdapter{
    Frame f;
    public Closable(){
        f=new Frame();
        f.setSize(200,200);
        f.setVisible(true);
        f.addWindowListener(this);        
    }
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public static void main(String[] args) {
        new Closable();
    }
    
}
