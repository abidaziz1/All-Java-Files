public class Throws2 {
    public static void wait1() throws InterruptedException {
        for(int i=1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }  

    public static void main(String[] args)   {
        try{
            wait1(); // Corrected to wait1()
            System.out.println(10/0); // This will throw ArithmeticException
        }
        catch(InterruptedException e){ // Added to handle InterruptedException
            System.out.println("InterruptedException: " + e.getMessage());
        }
        catch(ArithmeticException e){ // Separated catch block for ArithmeticException
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        System.out.println("End of the program");
    }
}