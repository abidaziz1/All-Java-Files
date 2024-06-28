import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class array {
    public static void main(String[] args){
        char vowels[]= {'e', 'a', 'o', 'u', 'i'};
        Arrays.sort(vowels);

        int startIndex=1; int endingIndex=4;
        // Arrays.sort(vowels,startIndex,endingIndex);
        System.out.println(Arrays.toString(vowels));

        char key ='o';
        int foundIndex = Arrays.binarySearch(vowels, key);
        System.out.println(foundIndex);

        int numbers[]= {1,2,3,4,5};
        int copyOfNumbers[] = Arrays.copyOfRange(numbers, startIndex, endingIndex);
        Arrays.fill(numbers,0);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));


        ArrayList<Integer>number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
    
        number.remove(4);
        System.out.println(number.toString());
        System.out.println(number.get(2));

        number.clear();
        System.out.println(number.toString());

        // number.set(2,Integer.valueOf(30));
        // System.out.println(number.toString());

       // System.out.println(number.sort(Comparator.naturalOrder()));
        // isEmpty method

        number.forEach(num ->{
            System.out.println(num*2);
        });
        System.out.println(number.toString());
    }
}
