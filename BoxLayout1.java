import javax.swing.*;
public class BoxLayout1 extends JFrame{
    public BoxLayout1(){
        JButton b1 = new JButton("Btn1");
        JButton b2 = new JButton("Btn2");
        JButton b3 = new JButton("Btn3");
        JButton b4 = new JButton("Long named Btn1");
        JButton b5 = new JButton("5");

        add(b1);
        add(b2);
        add(b3);
       add(b4);
        add(b5);

        // Set layout manager to BoxLayout for content pane
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Set alignment for buttons
        b1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b4.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b5.setAlignmentX(JButton.CENTER_ALIGNMENT);

      pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayout1();
    }
}
