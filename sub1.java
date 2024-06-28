class super1 {
    void m1(){System.out.println("extra class");}
}
public class sub1 extends super1{
    void m1(){System.out.println("main class");}
    void show(){m1(); super.m1();}
    public static void main(String[] args) {
        sub1 s=new sub1();
        s.show();
    }
}
