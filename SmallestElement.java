public class SmallestElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        int smallest = array[0];
        for (int element : array) {
            if (element < smallest) {
                smallest = element;
            }       }
        System.out.println("The smallest element in the array is " + smallest);
    }}
