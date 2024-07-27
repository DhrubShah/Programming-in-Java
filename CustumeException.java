import java.util.*;

public class CustumeException extends Exception {
    public CustumeException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int sem;

    public Student(String name, int sem) throws CustumeException {
        if (sem > 8 || sem <= 0) {
            throw new CustumeException("Invalid Semester");
        }
        this.name = name;
        this.sem = sem;
    }

    public String toString() {
        return "Name: " + name + ", Semester: " + sem;
    }

    public static void main(String[] args) {
        try {
            String name;
            int sem;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name:");
            name = scan.next();
            System.out.println("Enter semester (1-8):");
            sem = scan.nextInt();
            Student s = new Student(name, sem);
            System.out.println(s);
            scan.close();
        } catch (CustumeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer for semester.");
        }
    }
}
