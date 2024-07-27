public class ToString {
    int roll;
    String name;
    public ToString(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public String toString(){
        return this.name+this.roll;
    }
    public static void main(String[] args) {
        ToString t=new ToString("Hemraj", 06);
        System.out.println(t);
    }
    
}
