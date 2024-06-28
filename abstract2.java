abstract class Shape{
    double dim1,dim2;
    Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area();
}

class circle extends Shape{
    circle(double r){
        super(r, r);
    }
    double area(){
        return Math.PI * this.dim1 * this.dim2;
    }
}

class rectangle extends Shape{
    rectangle(double l, double b){
        super(l, b);
    }
    double area(){
        return this.dim1 * this.dim2;
    }
}

public class abstract2 {
    public static void main(String[] args) {
        Shape sh;
        sh = new circle(3);
        System.out.println("Area of circle is: " + sh.area());

        sh = new rectangle(2,3);
        System.out.println("Area of rectangle is: " + sh.area());
    }
}
