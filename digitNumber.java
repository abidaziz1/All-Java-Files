public class digitNumber {
   public static void main(String[] args) {
    int number = 12345;
    int count = 0;
    while (number!= 0) {
      if(number%10==2){count++;}
      number /= 10;
    }System.out.println("The number of time 2 is present: "+ count);
   }
}
