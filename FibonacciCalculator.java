import java.util.Scanner;
public class FibonacciCalculator {
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int result = fibonacci(number);
            System.out.println("The " + number + "th Fibonacci number is " + result);
        }
        scanner.close();
    }}
