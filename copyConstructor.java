class A{
    int a; String b;
    A(){
        a=10; b="Learn Coding";
        System.out.println(a+" "+b);
    }
    A(A ref){
        a= ref.a; b=ref.b; System.out.println(a+" "+b);
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(obj1);
        //System.out.println(obj1.a+" "+obj1.b);
    }
}
