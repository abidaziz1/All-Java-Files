public final class MyFinalClass {
    public final void display() {
        System.out.println("This method cannot be overridden");
    }
}

final int number = 42; // This value cannot be changed

class ExtendedClass extends MyFinalClass { // This will cause a compile-time error
    @Override
    public void display() { // Error: cannot override final method from MyFinalClass
        System.out.println("Trying to override");
    }
}
