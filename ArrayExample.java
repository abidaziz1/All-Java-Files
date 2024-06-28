public class ArrayExample {
    public static void main(String[] args) {
        int[][] arr = {{2, 7, 8}, {3, 6, 1}, {7, 4, 2}};
        for (int[] row : arr) {
            for (int element : row) {
                System.out.println(element);
            }
        }
    }
}