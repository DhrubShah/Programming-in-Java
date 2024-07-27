import java.util.Scanner;
abstract class Athlete{
    String name;
    String teamName;
    public Athlete(String name,String teamName){
        this.name=name;
        this.teamName=teamName;
    }
    abstract void display();

}
class Football extends Athlete{
    int goals;
    public Football(String name,String teamName,int goals){
        super(name,teamName);
        this.goals=goals;
         
    }
    @Override
    void display(){
        System.out.println("Names="+name+" Goals="+goals+" Team Name="+teamName);

    }
}
class Cricket extends Athlete{
    int run;
    int wicket;
    public Cricket(String name,String teamName,int run,int wicket){
        super(name, teamName);
        this.run=run;
        this.wicket=wicket;

    }
    void display(){
        System.out.println("Name="+name+" Runs="+run+" Wickets="+wicket+" Team Name="+teamName);
    }
}
class Nice{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         System.out.println("Enter Name of a footballer ");
         String fname=scan.next();
         System.out.println("Enter Name of team of a footballer ");
         String ftname=scan.next();
         System.out.println("Enter goals ");
         int goals=scan.nextInt();
         Football f=new Football(fname, ftname, goals);
         f.display();

         System.out.println("Enter Name of a Cricketer ");
         String cname=scan.next();
         System.out.println("Enter Team Name of a Cricketer ");
         String ctname=scan.next();
         System.out.println("Enter Total number of runs ");
         int run=scan.nextInt();

         System.out.println("Enter Total number of wickets ");
         int wkt=scan.nextInt();
         Cricket c=new Cricket(cname, ctname, run, wkt);
         c.display();
         scan.close();
         

    }
}