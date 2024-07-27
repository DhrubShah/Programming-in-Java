import java.util.*;
import java.util.InputMismatchException;
public class Additon {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try{

        
        System.out.println("Enter a value");
        int a=scan.nextInt();
        System.out.println("Enter another value");
        int b=scan.nextInt();
        int ans=a/b;
        System.out.println(ans);


    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }catch(InputMismatchException e){
        System.out.println("Please Enter only numbers");
    }finally{
        System.out.println("End!!!!");
    }
    scan.close();

    }
    
}
