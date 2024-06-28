public class FindMissingNumber {
    public static void main(String[] args){
        int[] array= {1,2,3,4,5,7};
        int n= array.length+1;

        int expectedsum= n*(n+1)/2;
        int actualsum=0;
        for (int i=0; i<array.length; i++){
            actualsum= actualsum+array[i];
        }
        System.out.println("Missing number is: " + (expectedsum-actualsum));
    }
}
