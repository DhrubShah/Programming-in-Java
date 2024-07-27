import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<String>();
        names.add("Hemraj");
        names.add("Nice");
        names.add("Hii");
        System.out.println(names);
        names.set(1,"Ram");
        names.set(2,"Hari");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
    }
}
