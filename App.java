class App{
    String name;
    int id;
    int monthlysalary;
    public App(String name,int id,int monthlysalary){
        this.id=id;
        this.name=name;
        this.monthlysalary=monthlysalary;
    }
    int getYearly(){
        return monthlysalary*12;
    }
    String getDetails(){
        String detail;
        detail="name="+this.name+" Id ="+this.id+ " Monthy Salary="+this.monthlysalary+" Yearly Salary="+this.getYearly();
        return detail;
    }
}
class Teacher extends App{
    int sub;
    public Teacher(String name,int id,int monthlysalary,int sub){
        super(name, id, monthlysalary);
        this.sub=sub;
    }
    @Override
    int getYearly(){
        return this.sub*12+super.getYearly();
    }
    @Override
    String getDetails(){
        return super.getDetails()+" Sub="+this.sub;
    }
    


}
class Test{
    public static void main(String[] args) {
        App a=new App("Hemraj",06,6969);
    
        Teacher t=new Teacher("DOD", 60, 6969, 5);
        System.out.println(a.getDetails());
        System.out.println(t.getDetails());
    }
}