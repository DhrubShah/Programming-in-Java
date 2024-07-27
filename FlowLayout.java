import java.awt.*;

public class FlowLayout extends Frame{
   
     public FlowLayout(){

     
        setSize(100,100);
        Button []btn=new Button[4];
        for(int i=0;i<4;i++){
            btn[i]=new Button(""+(i+1));
            add(btn[i]);

        }
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayout();
    }

    
}

    
