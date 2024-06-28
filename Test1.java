class Test1 {
    int a;
    int b;
Test1(){
    this(10,20);
    System.out.println("Inside default constructor");
}
Test1(int a, int b){
    this.a= a;
    this.b= b;
    System.out.println("Inside parameterized constructor");
}
public static void main(String[] args) {
    Test1 object = new Test1();
}
}


class Test2{
    int a; int b;
    Test2(){a=10;b=20;}
    Test2 get(){ return this;}
    void display(){System.out.println("a = "+a+" b = "+b);}
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.get().display();
    }
}

class Tes{
    int a; int b;
    Tes(){
        a=10; b=20;
    }
    void display(Tes obj){
        System.out.println("a = "+obj.a+ " b = "+obj.b);
    }
    void get(){display(this);}  //equivalent to display(object)
    public static void main(String[] args) {
        Tes object = new Tes();
        object.get();
    }
}


class TEst{
    void display(){
        this.show();
        System.out.println("Inside display function");
    }
    void show(){
        System.out.println("Inside show method");
    }
    public static void main(String[] args) {
        TEst t1 = new TEst();
        t1.display();
    }
}