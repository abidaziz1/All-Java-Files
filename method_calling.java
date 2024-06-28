public class method_calling {
    public static void main(String[] args) {
        try{
            m1();
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled by main method..!");
        }
    }
    public static void m1(){
        try{
            m2();}
        catch(ArithmeticException e){
            System.out.println("Exception handled by m1 method..!");
        }}
    public static void m2(){
        try{
            int a=9/0;
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled by m2 method..!");
        }
        }
}
