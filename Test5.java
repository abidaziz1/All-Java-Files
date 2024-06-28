public class Test5 {
    int a;
    int b;
    Test5() {
        this(10, 20);
        System.out.println("Inside default constructor \n");
    }
    Test5(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
    public static void main(String[] args) {
        Test5 object = new Test5();
    }}
