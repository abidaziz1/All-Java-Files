import java.util.HashMap;
import java.util.Map;
public class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }  }}
