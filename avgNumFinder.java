public class avgNumFinder {
    public static void main(String[] args) {
        int num1=21;   int num2=22;   int num3=23;
        int avg= findavg(num1,num2,num3);
        System.out.println(avg);
    }
    public static int findavg(int a, int b, int c){
        int avg=(a+b+c)/3;
        return avg;
    }}
