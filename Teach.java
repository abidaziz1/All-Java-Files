class Teacher{
    private String name, gender;
    private String phone;

   Teacher(){
    System.out.println("No Value.");
   }
   Teacher(String n, String m, String ph){
    this.name=n; this.gender=m; this.phone=ph;
   }
   void displayInformation(){
    System.out.println(this.gender);
    System.out.println(this.name);
    System.out.println(this.phone);
    System.out.println("\n");
}
}


public class Teach {
    public static void main(String[] args){
        Teacher teacher1= new Teacher();
       // teacher1.setInformation("Abid Aziz", "Male", "01642818018");
        teacher1.displayInformation();
    
        Teacher teacher2 = new Teacher();
       // teacher2.setInformation("Arafat Aziz", "Male", "01783592030");
        teacher2.displayInformation();
    }
}
