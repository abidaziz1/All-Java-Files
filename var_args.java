class A{
    void add(int ... args) {
        int sum=0;
        for(int x:args) {
            sum+=x;
        }
        System.out.println("Sum is "+sum);
    }
}

public class var_args {
    public static void main(String[] args) {
        A a= new A();
        a.add(); a.add(10); a.add(10,20);
        a.add(10,20,30);
        a.add(10,20,30,40);
    }
}
