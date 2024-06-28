public class nested_catch {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            try{
                String a="ABid Aziz";
                System.out.println(a.toUpperCase());
            }
            catch(Exception e1){
                System.out.println(e1.getMessage());
        }
        finally{
            System.out.println("This is final block");
        }
        }
    }   //same vabe nested finally block o banano zabe.
}
