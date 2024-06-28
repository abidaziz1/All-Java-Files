public class multiple_catch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int a=10,b=0;
        try {    
            System.out.println(arr[10]);
            System.out.println(a/b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
    }
} 
//kahini hocche je prothom jei exception pabe tar problem solve korbe sudhu