public class ArrayCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        System.out.println("Original array: ");
        for (int element : originalArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Copied array: ");
        for (int element : copiedArray) {
            System.out.print(element + " ");
        }   }}
