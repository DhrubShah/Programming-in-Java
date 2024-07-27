import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class MenuBAr extends JFrame implements ActionListener {
    JLabel lb;
    JMenu m;
    JMenuBar mb;
    JMenuItem i1,i2,i3;
    public MenuBAr(){
        lb=new JLabel();
        setSize(200,200);
        add(lb);
        mb=new JMenuBar();
        add(mb);
        m=new JMenu("File");
        mb.add(m);
        i1=new JMenuItem("Item 1");
        i2=new JMenuItem("Item 2");
        i3=new JMenuItem("Item 3");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        lb.setBounds(200,100,200,200);
        setLayout(new FlowLayout());
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        setVisible(true);
        

        }
        @Override
        public void actionPerformed(ActionEvent e){
            String i=e.getActionCommand();
            lb.setText(i);



    }
    public static void main(String[] args) {
        new MenuBAr();
    }
    
    
}
