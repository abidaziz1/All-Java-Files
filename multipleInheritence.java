class A{
   int x=10;
}
class B extends A {
int x=5;
void display(){
   System.out.println(super.x);
}
    
}
public class multipleInheritence {
    public static void main(String[] args) {
      B obj=new B();
        obj.display();
    }
}
