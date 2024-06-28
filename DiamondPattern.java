import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int middle = rows / 2 + 1; 
        for (int i = 1; i <= middle; i++) {
            for (int j = middle; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = middle - 1; i > 0; i--) {
            // Print leading spaces
            for (int j = middle; j > i; j--) {
                System.out.print(" ");     }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");   }
            System.out.println();  }
        scanner.close();
    }}
