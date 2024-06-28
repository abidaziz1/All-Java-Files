/**
 * InnerCallByValue
 */ 
class InnerCallByValue {
  void change(int i){
    i=20;
  }
    
}

public class CallByValue {
    public static void main(String[] args) {
        InnerCallByValue ob= new InnerCallByValue();
        int x=10;
        System.out.println("Before calling: "+x);
        ob.change(x);
        System.out.println("After calling: "+x);   //value will not be changed, as just copy is transferred
    }
}
