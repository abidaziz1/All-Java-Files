import java.util.Scanner;

public class inputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s! How old are you? ", name);
        int age= Integer.parseInt(scanner.nextLine());

        //cleans up the input buffer
        scanner.nextLine();

        System.out.printf("%d is a good age to start programming", age);
        scanner.close();
    }
}


