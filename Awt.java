import java.awt.*;
import java.awt.event.*;
class Awt extends WindowAdapter{
    Frame f;
    public Awt(){
        f=new Frame("Close");
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public static void main(String[] args) {
        new Awt();
    }

}