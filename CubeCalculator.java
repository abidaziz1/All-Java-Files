import java.util.Scanner;
public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double cube = Math.pow(number, 3);
        int truncatedCube = (int) cube;
        System.out.println("The cube of " + number + " truncated to an integer is: " + truncatedCube);
        scanner.close();
    }}
