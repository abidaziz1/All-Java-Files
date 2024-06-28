class A{
    int a; double b; String c;
    private A(){
        a=10; b=30.56; c="Aziz";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        A obj = new A();
    }
}

public class privateConstructor {
    public static void main(String[] args) {
        //    private constructor

        A obj = new A();  //can't define from this class as it is a private constructor
    }
}
