import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Confirm extends WindowAdapter {
    JFrame f;
public Confirm(){
 f=new JFrame();
 f.setSize(400,500);
 f.setVisible(true);
 f.addWindowListener(this);
 f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
@Override
public void windowClosing(WindowEvent e){
    int choice=JOptionPane.showConfirmDialog(f, "Do you want to Exit ?","Alert",JOptionPane.PLAIN_MESSAGE);

if(choice==JOptionPane.YES_OPTION){
    System.exit(0);
}
    
}
public static void main(String[] args) {
    new Confirm();
}
}