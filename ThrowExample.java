public class ThrowExample {
    public void checkAge(int age) {
        if (age < 18) {
            // Throw an unchecked exception
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        ThrowExample obj = new ThrowExample();
        try {
            obj.checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}