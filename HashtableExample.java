import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;
import java.util.Collection;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // put() - Insert key-value pairs into the hashtable
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("Four", 4);

        // Output the hashtable
        System.out.println("Initial Hashtable: " + hashtable); // {One=1, Four=4, Two=2, Three=3}

        // get() - Retrieve a value based on a key
        System.out.println("Value for key 'Two': " + hashtable.get("Two")); // 2

        // containsKey() - Check if a key is present in the hashtable
        System.out.println("Contains key 'Three': " + hashtable.containsKey("Three")); // true

        // containsValue() - Check if a value is present in the hashtable
        System.out.println("Contains value 4: " + hashtable.containsValue(4)); // true

        // size() - Get the number of key-value pairs in the hashtable
        System.out.println("Size of hashtable: " + hashtable.size()); // 4

        // isEmpty() - Check if the hashtable is empty
        System.out.println("Is the hashtable empty? " + hashtable.isEmpty()); // false

        // remove() - Remove a key-value pair based on the key
        hashtable.remove("Four");
        System.out.println("Hashtable after removing key 'Four': " + hashtable); // {One=1, Two=2, Three=3}

        // replace() - Replace a value for a specified key
        hashtable.replace("One", 10);
        System.out.println("Hashtable after replacing value for key 'One': " + hashtable); // {One=10, Two=2, Three=3}

        // keySet() - Get a set of all keys in the hashtable
        Set<String> keys = hashtable.keySet();
        System.out.println("Keys in hashtable: " + keys); // [One, Two, Three]

        // values() - Get a collection of all values in the hashtable
        Collection<Integer> values = hashtable.values();
        System.out.println("Values in hashtable: " + values); // [10, 2, 3]

        // entrySet() - Get a set of all key-value pairs in the hashtable
        Set<java.util.Map.Entry<String, Integer>> entries = hashtable.entrySet();
        System.out.println("Entries in hashtable: " + entries); // [One=10, Two=2, Three=3]

        // putIfAbsent() - Insert a key-value pair if the key is not already present
        hashtable.putIfAbsent("Two", 20);
        hashtable.putIfAbsent("Five", 5);
        System.out.println("Hashtable after putIfAbsent: " + hashtable); // {One=10, Two=2, Three=3, Five=5}

        // compute() - Compute a value for a specified key
        hashtable.compute("Three", (key, val) -> val * 2);
        System.out.println("Hashtable after compute on key 'Three': " + hashtable); // {One=10, Two=2, Three=6, Five=5}

        // merge() - Merge a new value with an existing value for a specified key
        hashtable.merge("Two", 8, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("Hashtable after merge on key 'Two': " + hashtable); // {One=10, Two=10, Three=6, Five=5}

        // elements() - Get an enumeration of the values in the hashtable
        Enumeration<Integer> enumeration = hashtable.elements();
        System.out.print("Elements in hashtable: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " "); // 10 10 6 5
        }
        System.out.println();

        // keys() - Get an enumeration of the keys in the hashtable
        Enumeration<String> keyEnumeration = hashtable.keys();
        System.out.print("Keys in hashtable: ");
        while (keyEnumeration.hasMoreElements()) {
            System.out.print(keyEnumeration.nextElement() + " "); // One Two Three Five
        }
        System.out.println();

        // forEach() - Iterate over the hashtable's key-value pairs
        System.out.print("Hashtable entries: ");
        hashtable.forEach((key, value) -> System.out.print(key + "=" + value + " ")); // One=10 Two=10 Three=6 Five=5
        System.out.println();

        // clear() - Remove all key-value pairs from the hashtable
        hashtable.clear();
        System.out.println("Hashtable after clear: " + hashtable); // {}
    }
}
