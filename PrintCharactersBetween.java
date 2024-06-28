public class PrintCharactersBetween {
    public static void main(String[] args) {
        char start = 'A';
        char end = 'P';
        printCharactersBetween(start, end);
    }
    public static void printCharactersBetween(char start, char end) {
        int count = 0;       
        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
            count++;
            if (count % 20 == 0) {
                System.out.println();
            }
        }
        if (count % 20 != 0) {
            System.out.println();
        }
    }
}
