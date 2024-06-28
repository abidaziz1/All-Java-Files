class callbyref{
    String name;
    void change(callbyref r2){
        r2.name= "Arafat";
    }
}

public class CallByReference {
    public static void main(String[] args) {
        callbyref r1 = new callbyref();
        r1.name = "Ahsan";
        System.out.println("Before: "+r1.name);

        r1.change(r1);
        System.out.println("After: "+r1.name);
    }
}
