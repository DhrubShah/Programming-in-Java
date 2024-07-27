// Java code :

import java.applet.Applet;
import java.awt.*;

public class Applet1 {
    String msg;
    void init(){
        msg=getParameter("College");
    }
    public void paint(Graphics g){
        g.drawString(msg,100,120);
    }
}






//HTML code:

/* 

<html>
<body>
<applet code="Applet1.class" height="100" width="100">
<param name="college" value ="ncit">
</applet>
</body>
</html>

*/

