class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    void specificMethod() {
        System.out.println("Dog-specific method");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.makeSound();
        Dog d = (Dog) a;  // Downcasting
        d.specificMethod();  // Output: Dog-specific method
    }
}
