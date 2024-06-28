import java.util.Scanner;
public class validPasswordCheck {
    public static void main(String[] args) {
        System.out.println("A password must have at least ten characters.");
        System.out.println("A password consists of only letters and digits.");
        System.out.println("A password must contain at least two digits.");
        Scanner input = new Scanner(System.in);
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String passwd = input.nextLine();
        if (passwdCheck(passwd)) {
            System.out.println("Password is valid: " + passwd);
        } else {
            System.out.println("Password is invalid: " + passwd);
        }
        input.close();
    }
    public static boolean passwdCheck(String passwd) {
        if (passwd.length() < 10) {
            System.out.println("A password must have at least ten characters.");
            return false;
        }
        int digitCount = 0;
        for (int i = 0; i < passwd.length(); i++) {
            char ch = passwd.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch)) {
                System.out.println("A password consists of only letters and digits.");
                return false;
            }
        }
        if (digitCount < 2) {
            System.out.println("A password must contain at least two digits.");
            return false;
        }
        return true;
    }
}
