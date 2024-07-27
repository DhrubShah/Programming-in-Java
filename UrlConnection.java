import java.net.*;
import java.io.*;
public class UrlConnection {
    public static void main(String[] args) throws Exception{

        URL u=new URL("ncit.com");
        URLConnection cn=u.openConnection();
        InputStream i=cn.getInputStream();
        int value;
        while((value=i.read())!=-1){
            System.out.println((char)value);
        }
        i.close();
        
    }
    
}
