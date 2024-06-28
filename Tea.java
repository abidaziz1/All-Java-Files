 class Teacher {  //public removed when in same class
   private String name, gender;  //private missed
   private String phone;
    void setInformation(String n, String g, String ph){
        this.name=n; this.gender=g; this.phone=ph;
    }  
//Using this helps differentiate between the instance variables and the local variables with the same name.
    void displayInformation(){
        System.out.println(this.gender);
        System.out.println(this.name);
        System.out.println(this.phone);
        System.out.println("\n");
    }
}

public class Tea{
public static void main(String[] args){
    Teacher teacher1= new Teacher();
    teacher1.setInformation("Abid Aziz", "Male", "01642818018");
    teacher1.displayInformation();

    Teacher teacher2 = new Teacher();
    teacher2.setInformation("Arafat Aziz", "Male", "01783592030");
    teacher2.displayInformation();
}}

