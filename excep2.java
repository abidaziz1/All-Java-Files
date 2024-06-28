public class excep2 {
    public static void main(String[] args) {
        String str= null;
        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException e){
            System.out.println("Null can't be casted");
    }

    String str1= "Hello";
    try{
        int a = Integer.parseInt(str1);
        System.out.println(a);
    }
    catch(NumberFormatException e1){
        System.out.println("String can't be casted to int");
    
}}
}