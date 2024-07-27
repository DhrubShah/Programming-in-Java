import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
public class Calculator extends JFrame implements ActionListener{
    JTextField t1;
JTextField t2;
JTextField ans;
JButton add;
JButton sub;
JButton div;
JButton mul;
    public Calculator(){
        setSize(200,200);
         t1=new JTextField();
        t2=new JTextField();
         ans=new JTextField();
         add=new JButton("+");
         sub=new JButton("-");
         div=new JButton("/");
         mul=new JButton("*");
        t1.setColumns(20);
        t2.setColumns(20);
        ans.setColumns(20);
        add(t1);
        add(t2);
        add(ans);
        add(add);
        add(sub);
        add(mul);
        add(div);
        ans.setEditable(false);
        setLayout(new FlowLayout());
        setVisible(true);
        add.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        sub.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    @Override
    public void actionPerformed(ActionEvent e){
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    if(e.getSource()==add){
        ans.setText(""+(a+b));
    }else if(e.getSource()==sub){
        ans.setText(""+(a-b));
    }else if(e.getSource()==mul){
        ans.setText(""+(a*b));
    }else{
        ans.setText(""+(a/b));
    }

    
    }
    public static void main(String[] args) {
        new Calculator();
    }


    
}
