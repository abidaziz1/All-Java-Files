class A{
    private int a;
    public void set(int a){this.a=a;}
    public int get(){return a;}
}


public class encap {
    public static void main(String[] args) {
        A e =  new A();
        e.set(10);
        System.out.println(e.get());
    }
}
