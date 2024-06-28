import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);            }
            System.out.println();        }
        scanner.close();
    }}
