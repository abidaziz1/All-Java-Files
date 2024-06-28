import java.util.Scanner;
public class SmallestNumberFinder {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1= scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2= scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3= scanner.nextInt();
        int smallest = findsmallest(num1,num2,num3);
        System.out.println("The smallest number is: "+ smallest);
        scanner.close();   
    }
public static int findsmallest(int a, int b, int c){
    int smallest=a;
    if(b<smallest){
        smallest=b;
    }
    if(c<smallest){
        smallest=c;
    }
    return smallest;
}}

