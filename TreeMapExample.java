import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();

        // put() - Insert key-value pairs into the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        // Output the map
        System.out.println("Initial Map: " + map); // {Four=4, One=1, Three=3, Two=2}

        // get() - Retrieve a value based on a key
        System.out.println("Value for key 'Two': " + map.get("Two")); // 2

        // containsKey() - Check if a key is present in the map
        System.out.println("Contains key 'Three': " + map.containsKey("Three")); // true

        // containsValue() - Check if a value is present in the map
        System.out.println("Contains value 4: " + map.containsValue(4)); // true

        // size() - Get the number of key-value pairs in the map
        System.out.println("Size of map: " + map.size()); // 4

        // isEmpty() - Check if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty()); // false

        // remove() - Remove a key-value pair based on the key
        map.remove("Four");
        System.out.println("Map after removing key 'Four': " + map); // {One=1, Three=3, Two=2}

        // replace() - Replace a value for a specified key
        map.replace("One", 10);
        System.out.println("Map after replacing value for key 'One': " + map); // {One=10, Three=3, Two=2}

        // keySet() - Get a set of all keys in the map
        System.out.println("Keys in map: " + map.keySet()); // [One, Three, Two]

        // values() - Get a collection of all values in the map
        System.out.println("Values in map: " + map.values()); // [10, 3, 2]

        // entrySet() - Get a set of all key-value pairs in the map
        System.out.println("Entries in map: " + map.entrySet()); // [One=10, Three=3, Two=2]

        // putIfAbsent() - Insert a key-value pair if the key is not already present
        map.putIfAbsent("Two", 20);
        map.putIfAbsent("Five", 5);
        System.out.println("Map after putIfAbsent: " + map); // {Five=5, One=10, Three=3, Two=2}

        // compute() - Compute a value for a specified key
        map.compute("Three", (key, val) -> val * 2);
        System.out.println("Map after compute on key 'Three': " + map); // {Five=5, One=10, Three=6, Two=2}

        // merge() - Merge a new value with an existing value for a specified key
        map.merge("Two", 8, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("Map after merge on key 'Two': " + map); // {Five=5, One=10, Three=6, Two=10}

        // firstKey() - Get the first (lowest) key
        System.out.println("First key: " + map.firstKey()); // Five

        // lastKey() - Get the last (highest) key
        System.out.println("Last key: " + map.lastKey()); // Two

        // headMap() - Get a view of the portion of the map whose keys are less than a given key
        System.out.println("HeadMap (less than 'Three'): " + map.headMap("Three")); // {Five=5, One=10}

        // tailMap() - Get a view of the portion of the map whose keys are greater than or equal to a given key
        System.out.println("TailMap (greater than or equal to 'Three'): " + map.tailMap("Three")); // {Three=6, Two=10}

        // subMap() - Get a view of the portion of the map whose keys range from a given start (inclusive) to end (exclusive) key
        System.out.println("SubMap (from 'Five' to 'Two'): " + map.subMap("Five", "Two")); // {Five=5, One=10, Three=6}

        // forEach() - Iterate over the map's key-value pairs
        System.out.print("Map entries: ");
        map.forEach((key, value) -> System.out.print(key + "=" + value + " ")); // Five=5 One=10 Three=6 Two=10
        System.out.println();

        // clear() - Remove all key-value pairs from the map
        map.clear();
        System.out.println("Map after clear: " + map); // {}
    }
}
