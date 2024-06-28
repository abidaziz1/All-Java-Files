public class sumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int findsum = countsum(number);
        System.out.println("Sum of digits: " + findsum);
    }
    public static int countsum(int number){
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }return sum;
    }  
}
