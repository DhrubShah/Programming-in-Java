import java.net.*;
public class URLProcessing {
    public static void main(String[]args)throws Exception{

        URL u=new URL("htpps:ncit.com");
        System.out.println(u.getProtocol());
        System.out.println(u.getHost());
        System.out.println(u.getPort());

    }
    
}
