import java.util.HashSet;
import java.util.Set;
public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int element : array) {
            if (!seen.add(element)) {
                duplicates.add(element);
            }       }
        System.out.println("Duplicate elements: " + duplicates);
    }}
