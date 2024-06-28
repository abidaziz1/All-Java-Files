public class excep1 {
    public static void main(String[] args) {
        int a= 10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is finally block. This will always execute");
        }
        //rest of the code
    }    
}
