import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        Arrays.sort(array);
        System.out.println("Array in ascending order:");
        for (int element : array) {
            System.out.print(element + " ");
        } }}
