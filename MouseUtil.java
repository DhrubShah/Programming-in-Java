import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
public class MouseUtil extends JFrame implements ActionListener,MouseListener {
    JMenuBar mb;
    JPopupMenu file;
    JLabel lb;
    JMenuItem i1,i2,i3;
    public MouseUtil(){
        setSize(200,200);
        mb=new JMenuBar();
        file=new JPopupMenu();
        mb.add(file);
        lb=new JLabel();
        file.add(lb);
        i1=new JMenuItem("Item 1");
        i2=new JMenuItem("Item 2");
        i3=new JMenuItem("Item 3");
        file.add(i1);
        file.add(i2);
        file.add(i3);
        lb.setBounds(100,100,100,100);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        addMouseListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String i=e.getActionCommand();
        lb.setText(i);
    }
    public void mouseClicked(MouseEvent e){
        lb.setText("X="+e.getX()+" Y="+e.getY());
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}

    public static void main(String[] args) {
        new MouseUtil();
    }

    
}
