import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class MouseTrack extends JFrame implements MouseListener, MouseMotionListener{
    JTextField t1;
    JTextField t2;
    public MouseTrack(){
        setSize(200,200);
        t1=new JTextField();
        t2=new JTextField();
        add(t1);
        add(t2);
        t1.setColumns(20);
        t2.setColumns(20);
        t1.setEditable(false);
        t2.setEditable(false);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseMotionListener(this);
        addMouseListener(this);


    }
    @Override
    public void mouseMoved(MouseEvent e){
        t2.setText("X="+e.getX()+" Y="+e.getY());
    }
    public void mouseEntered(MouseEvent e){
        t1.setText("IN");
    }
    public void mouseExited(MouseEvent e){
        t1.setText("Out");
    }
    public void mouseDragged(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public static void main(String[] args) {
        new MouseTrack();
    }


    
}
