import java.util.Scanner;
public class SumCalculator {
    public static int sum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = sum(number);
            System.out.println("The sum of all numbers from 1 to " + number + " is " + result);
        }
        scanner.close();
    }}
