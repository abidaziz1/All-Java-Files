class InnerVarLenArg {
 void add(int ... num){
    int sum=0;
    for(int x:num){
        sum+=x;
    }
    System.out.println(sum);
 }
    
}

public class varLenArg {
    public static void main(String[] args) {
        InnerVarLenArg obj=new InnerVarLenArg();
        obj.add(10,20,30,40,50);
        obj.add(10,20);
        obj.add(72,28,98);
    }
}
