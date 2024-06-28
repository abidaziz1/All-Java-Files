import java.util.Scanner;
public class threeInt {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b= scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c= scanner.nextInt();
        scanner.close();
        int sum = (a+b+c)/3;
        if(sum==b){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
