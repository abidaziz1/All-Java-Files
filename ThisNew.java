public class ThisNew {
    void m1(ThisNew t){System.out.println("M1");}
    void m2(){m1(this);}
    public static void main(String[] args) {
        ThisNew t =new ThisNew();
        t.m2();
    }
}
