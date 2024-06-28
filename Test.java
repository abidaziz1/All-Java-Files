class  A {
A show(){
System.out.println("Parent");
return new A();
}
}

class B extends A{
B show(){
    super.show();
    System.out.println("Child");
    return this;
}
}

public class Test {
    public static void main(String[] args) {
        B b= new B();
        b.show();
    }
}
