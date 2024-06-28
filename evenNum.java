import java.util.Scanner;
public class evenNum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        int count = 0;
        while(num!=0){
           int digit = num % 10;
            if(digit%2!=0){count++;}
            num/=10;
        }if(count>=1){
            System.out.println("false");
        } else{
            System.out.println("true");
        }
    }
}
