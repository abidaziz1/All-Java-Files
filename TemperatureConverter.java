import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
        scanner.close();
    }}
