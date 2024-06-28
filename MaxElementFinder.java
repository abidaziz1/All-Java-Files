import java.util.Scanner;
public class MaxElementFinder {
    public static int findMax(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.max(array[n - 1], findMax(array, n - 1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int maxElement = findMax(array, n);
        System.out.println("The maximum element in the array is " + maxElement);
        scanner.close();
    }}
