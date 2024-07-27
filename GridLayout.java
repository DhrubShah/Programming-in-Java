import java.awt.*;

public class GridLayout extends Frame {
    public GridLayout(){
        setSize(100,100);
        Button []btn=new Button[4];
        for(int i=0;i<4;i++){
            btn[i]=new Button(""+(i+1));
            add(btn[i]);

        }
        setLayout(new java.awt.GridLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayout();
    }

    
}
