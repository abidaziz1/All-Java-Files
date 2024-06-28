import java.util.Scanner;
import java.text.DecimalFormat;

public class computeFV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly deposit: ");
        double monthlyDeposit = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.printf("%-10s%-15s%n", "Years", "FutureValue");

        // Calculate and print future value for each year
        for (int year = 1; year <= years; year++) {
            double futureValue = 0;
            // Loop through each month up to the current year
            for (int month = 1; month <= year * 12; month++) {
                // Calculate the future value of each monthly deposit
                futureValue += monthlyDeposit * Math.pow(1 + monthlyInterestRate, (year * 12) - month + 1);
            }
            System.out.printf("%-10d%-15s%n", year, df.format(futureValue));
        }

        input.close();
    }
}
