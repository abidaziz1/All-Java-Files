import java.util.*;

public class HashtableMethods {

    public static void main(String[] args) {
        // Creating a new Hashtable with generics
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding key-value pairs to the table
        hashtable.put(1, "One");
        hashtable.put(2, "Two");

        // Displaying the table
        // System.out.println(hashtable);

        // Constructors of Hashtable
        // Default constructor
        Hashtable<Integer, String> defaultHashtable = new Hashtable<>();

        // Constructor with initial capacity
        Hashtable<Integer, String> capacityHashtable = new Hashtable<>(10);

        // Constructor with initial capacity and load factor
        Hashtable<Integer, String> capacityLoadFactorHashtable = new Hashtable<>(10, 0.75f);

        // Constructor with another Map
        Map<Integer, String> anotherMap = new Hashtable<>();
        anotherMap.put(3, "Three");
        Hashtable<Integer, String> fromAnotherMap = new Hashtable<>(anotherMap);

        // Methods of Hashtable

        // put(): Inserts a key-value pair into the table
        hashtable.put(3, "Three");

        // putIfAbsent(): Inserts the key-value pair only if the key is not already associated with a value
        hashtable.putIfAbsent(4, "Four");

        // get(): Returns the value to which the specified key is mapped
        String value = hashtable.get(1);

        // remove(): Removes the mapping for the specified key from this table if present
        String removedValue = hashtable.remove(2);

        // remove(key, value): Removes the entry for the specified key only if it is currently mapped to the specified value
        boolean isRemoved = hashtable.remove(3, "Three");

        // containsKey(): Returns true if this table contains a mapping for the specified key
        boolean containsKey = hashtable.containsKey(1);

        // containsValue(): Returns true if this table maps one or more keys to the specified value
        boolean containsValue = hashtable.containsValue("One");

        // isEmpty(): Returns true if this table contains no key-value mappings
        boolean isEmpty = hashtable.isEmpty();

        // size(): Returns the number of key-value mappings in this table
        int size = hashtable.size();

        // clear(): Removes all of the mappings from this table
        hashtable.clear();

        // keySet(): Returns a Set view of the keys contained in this table
        Set<Integer> keySet = hashtable.keySet();
        // System.out.println("KeySet: " + keySet);

        // values(): Returns a Collection view of the values contained in this table
        // System.out.println("Values: " + hashtable.values());

        // entrySet(): Returns a Set view of the mappings contained in this table
        // System.out.println("EntrySet: " + hashtable.entrySet());

        // putAll(): Copies all of the mappings from the specified map to this table
        hashtable.putAll(anotherMap);

        // getOrDefault(): Returns the value to which the specified key is mapped, or the defaultValue if this map contains no mapping for the key
        String defaultValue = hashtable.getOrDefault(5, "Default");

        // contains(): Returns true if this table maps one or more keys to the specified value
        boolean contains = hashtable.contains("One");

        // elements(): Returns an enumeration of the values contained in this table
        Enumeration<String> elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            // System.out.println("Element: " + elements.nextElement());
        }

        // keys(): Returns an enumeration of the keys contained in this table
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            // System.out.println("Key: " + keys.nextElement());
        }

        // clone(): Creates a shallow copy of this hashtable
        @SuppressWarnings("unchecked")
        Hashtable<Integer, String> clonedHashtable = (Hashtable<Integer, String>) hashtable.clone();
        // System.out.println("Cloned Hashtable: " + clonedHashtable);

        // Example to show the table after various operations
        // System.out.println("Final Hashtable: " + hashtable);
    }
}
