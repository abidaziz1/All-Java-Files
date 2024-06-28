class Person {
  String name;
 int age;

 String gender;
 void displayInformation1(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Gender: "+gender);
 }
    
}

class Teacher extends Person {
 String qualification;        //private diye thakle setQualification(), getQualification() method create kora lagbe
 void displayInformation2(){
   displayInformation1();
    System.out.println("Qualification: "+qualification);
 }
    
}
public class Inheritance {
    public static void main(String[] args) {
      Teacher t1 = new Teacher();
      t1.name = "John";
      t1.age = 22;
      t1.gender = "Female";
      t1.qualification = "B.Sc in CSE";
      t1.displayInformation2();

      Teacher t2= new Teacher();
      t2.name = "Johhny";
      t2.age = 23;
      t2.gender = "Male";
      t2.qualification = "B.Sc in EEE";
      t2.displayInformation2();
    }
}
