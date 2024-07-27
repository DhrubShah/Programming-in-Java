//App to check weather the String is palindrome or not

import java.net.*;
import java.io.*;
import java.util.*;

// Server.java Code : 

public class Server {
    public static void main(String[] args)throws Exception {
        ServerSocket ss=new ServerSocket(4000);
        // Server Running
        Socket s=ss.accept();
        //Client is connected
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        String word=dis.readUTF();
        String ans=isPalindrome(word);
        dos.writeUTF(ans);
        dis.close();
        ss.close();
        dos.close();
        s.close();
    }
    public static String isPalindrome(String data){
    String rev;
    for(int i=data.length();i>=0;i--){
        rev=rev+data.charAt(i);
    }
    if(rev.equalsIgnoreCase(data)){
        return "Is Palindrome";
    }else{
        return "Is not Palindrome";
    }

    }
    
}



// Client.java code:


class Client{
    public static void main(String[] args)throws Exception {
        Socket s=new Socket("localhos",4000);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF(word);
        String ans=dis.readUTF();
        System.out.println(word+" is "+ans);

        s.close();
        dis.close();
        dos.close();
        scan.close();
    }
    
}



//NOte we have to save these file differently 