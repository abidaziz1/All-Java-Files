import java.util.Scanner;
public class MinutesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        long minutes = scanner.nextLong();
        long years = minutes / (60 * 24 * 365);
        long remainingMinutes = minutes % (60 * 24 * 365);
        long days = remainingMinutes / (60 * 24);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        scanner.close();
    }}
