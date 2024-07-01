class Greeting {
    void sayHello(){
        System.out.println("In greeting class");
    };
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        // Anonymous inner class implementing the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        greeting.sayHello();  // Output: Hello, World!
    }
}
// HEre greeting.sayHello(); will output for hello world, not for in Greeting  class