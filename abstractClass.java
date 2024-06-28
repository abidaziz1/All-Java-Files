abstract class MobileUser {
 // declare a non-abstract method
 void call(){System.out.println("Call Method");}
    abstract void sendMessage();   
}

class  Rahim extends MobileUser {
 @Override
    void sendMessage() {
        System.out.println("Hi, I am Rahim");
    } 
}

class Karim extends MobileUser{
    @Override
    void sendMessage() {
        System.out.println("Hi, I am Karim");
    } 
}
public class abstractClass {
    public static void main(String[] args) {
        MobileUser ms;      
        ms = new Rahim();
        ms.call();
        ms.sendMessage();
        ms = new Karim();
        ms.sendMessage();
    }
}
