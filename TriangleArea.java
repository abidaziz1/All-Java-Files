import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input side 3: ");
        double side3 = scanner.nextDouble();
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}
