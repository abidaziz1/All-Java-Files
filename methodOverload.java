class Overload{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(float a, float b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class methodOverload {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.add(10, 20);
        obj.add(10.5f, 20.5f);

        obj.add(10, 20, 30);
    }
}
