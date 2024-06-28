public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {0, 2, 0, 5, 6, 0, 8, 0, 10};

        // Count non-zero elements
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[count] = array[i];
                count++;
            }
        }

        // Fill remaining elements with zeros
        while (count < array.length) {
            array[count] = 0;
            count++;
        }

        // Print the modified array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
