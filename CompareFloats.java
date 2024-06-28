import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();
        if (areEqualUptoThreeDecimalPlaces(num1, num2)) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
        scanner.close();
    }
    public static boolean areEqualUptoThreeDecimalPlaces(float num1, float num2) {
        int intNum1 = (int) (num1 * 1000);
        int intNum2 = (int) (num2 * 1000);
        return intNum1 == intNum2;
    }}
