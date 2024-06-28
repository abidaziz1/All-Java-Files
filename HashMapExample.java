import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // put() - Insert key-value pairs into the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        // Output the map
        System.out.println("Initial Map: " + map); // {One=1, Two=2, Three=3, Four=4}

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
        System.out.println("Map after removing key 'Four': " + map); // {One=1, Two=2, Three=3}

        // replace() - Replace a value for a specified key
        map.replace("One", 10);
        System.out.println("Map after replacing value for key 'One': " + map); // {One=10, Two=2, Three=3}

        // keySet() - Get a set of all keys in the map
        System.out.println("Keys in map: " + map.keySet()); // [One, Two, Three]

        // values() - Get a collection of all values in the map
        System.out.println("Values in map: " + map.values()); // [10, 2, 3]

        // entrySet() - Get a set of all key-value pairs in the map
        System.out.println("Entries in map: " + map.entrySet()); // [One=10, Two=2, Three=3]

        // putIfAbsent() - Insert a key-value pair if the key is not already present
        map.putIfAbsent("Two", 20);
        map.putIfAbsent("Five", 5);
        System.out.println("Map after putIfAbsent: " + map); // {One=10, Two=2, Three=3, Five=5}

        // compute() - Compute a value for a specified key
        map.compute("Three", (key, val) -> val * 2);
        System.out.println("Map after compute on key 'Three': " + map); // {One=10, Two=2, Three=6, Five=5}

        // merge() - Merge a new value with an existing value for a specified key
        map.merge("Two", 8, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("Map after merge on key 'Two': " + map); // {One=10, Two=10, Three=6, Five=5}

        // forEach() - Iterate over the map's key-value pairs
        System.out.print("Map entries: ");
        map.forEach((key, value) -> System.out.print(key + "=" + value + " ")); // One=10 Two=10 Three=6 Five=5
        System.out.println();

        // clear() - Remove all key-value pairs from the map
        map.clear();
        System.out.println("Map after clear: " + map); // {}
    }
}

/*
Fast access time: HashMaps provide constant time access to elements, which means that retrieval and insertion of elements are very fast, usually O(1) time complexity.
Uses hashing function: HashMaps uses a hash function to map keys to indices in an array. This allows for a quick lookup of values based on keys.
Stores key-value pairs: Each element in a HashMap consists of a key-value pair. The key is used to look up the associated value.
Supports null keys and values: HashMaps allow for null values and keys. This means that a null key can be used to store a value, and a null value can be associated with a key.
Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved. However, LinkedHashMap is a variation of HashMap that preserves the insertion order.
Allows duplicates: HashMaps allow for duplicate values, but not duplicate keys. If a duplicate key is added, the previous value associated with the key is overwritten.
Thread-unsafe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, it can lead to data inconsistencies. If thread safety is required, ConcurrentHashMap can be used.
Capacity and load factor: HashMaps have a capacity, which is the number of elements that it can hold, and a load factor, which is the measure of how full the hashmap can be before it is resized.
 */
