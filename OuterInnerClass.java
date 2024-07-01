public class OuterInnerClass {
    private String message = "Hello";
    class InnerClass{
        void display(){
            System.out.println(message);
        }
    }
public static void main(String[] args) {
    OuterInnerClass outer = new OuterInnerClass();
    OuterInnerClass.InnerClass inner = outer.new InnerClass();
    inner.display();
}
}
