public class ArrayProductCalculator {
    public static int product(int[] array, int n) {
        if (n <= 0) {
            return 1;
        }
        return array[n - 1] * product(array, n - 1);
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int result = product(array, array.length);
        System.out.println("The product of all numbers in the array is " + result);
    }}
