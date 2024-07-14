import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethods {

    public static void main(String[] args) {
        // Creating a new TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the map
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        // Displaying the map
        System.out.println(treeMap);

        // Constructors of TreeMap
        // Default constructor
        TreeMap<Integer, String> defaultTreeMap = new TreeMap<>();

        // Constructor with comparator
        TreeMap<Integer, String> comparatorTreeMap = new TreeMap<>(Comparator.reverseOrder());

        // Constructor with another SortedMap
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(3, "Three");
        TreeMap<Integer, String> fromSortedMap = new TreeMap<>(sortedMap);

        // Constructor with another Map
        Map<Integer, String> anotherMap = new TreeMap<>();
        anotherMap.put(4, "Four");
        TreeMap<Integer, String> fromAnotherMap = new TreeMap<>(anotherMap);

        // Methods of TreeMap

        // put(): Inserts a key-value pair into the map
        treeMap.put(3, "Three");

        // putIfAbsent(): Inserts the key-value pair only if the key is not already associated with a value
        treeMap.putIfAbsent(4, "Four");

        // get(): Returns the value to which the specified key is mapped
        String value = treeMap.get(1);

        // remove(): Removes the mapping for the specified key from this map if present
        String removedValue = treeMap.remove(2);

        // remove(key, value): Removes the entry for the specified key only if it is currently mapped to the specified value
        boolean isRemoved = treeMap.remove(3, "Three");

        // containsKey(): Returns true if this map contains a mapping for the specified key
        boolean containsKey = treeMap.containsKey(1);

        // containsValue(): Returns true if this map maps one or more keys to the specified value
        boolean containsValue = treeMap.containsValue("One");

        // isEmpty(): Returns true if this map contains no key-value mappings
        boolean isEmpty = treeMap.isEmpty();

        // size(): Returns the number of key-value mappings in this map
        int size = treeMap.size();

        // clear(): Removes all of the mappings from this map
        treeMap.clear();

        // keySet(): Returns a NavigableSet view of the keys contained in this map
        System.out.println("KeySet: " + treeMap.keySet());

        // values(): Returns a Collection view of the values contained in this map
        System.out.println("Values: " + treeMap.values());

        // entrySet(): Returns a Set view of the mappings contained in this map
        System.out.println("EntrySet: " + treeMap.entrySet());

        // putAll(): Copies all of the mappings from the specified map to this map
        treeMap.putAll(anotherMap);

        // firstKey(): Returns the first (lowest) key currently in this map
        Integer firstKey = treeMap.firstKey();
        System.out.println("First Key: " + firstKey);

        // lastKey(): Returns the last (highest) key currently in this map
        Integer lastKey = treeMap.lastKey();
        System.out.println("Last Key: " + lastKey);

        // firstEntry(): Returns a key-value mapping associated with the least key in this map
        Map.Entry<Integer, String> firstEntry = treeMap.firstEntry();
        System.out.println("First Entry: " + firstEntry);

        // lastEntry(): Returns a key-value mapping associated with the greatest key in this map
        Map.Entry<Integer, String> lastEntry = treeMap.lastEntry();
        System.out.println("Last Entry: " + lastEntry);

        // pollFirstEntry(): Removes and returns a key-value mapping associated with the least key in this map
        Map.Entry<Integer, String> pollFirstEntry = treeMap.pollFirstEntry();
        System.out.println("Poll First Entry: " + pollFirstEntry);

        // pollLastEntry(): Removes and returns a key-value mapping associated with the greatest key in this map
        Map.Entry<Integer, String> pollLastEntry = treeMap.pollLastEntry();
        System.out.println("Poll Last Entry: " + pollLastEntry);

        // lowerKey(): Returns the greatest key strictly less than the given key, or null if there is no such key
        Integer lowerKey = treeMap.lowerKey(2);
        System.out.println("Lower Key: " + lowerKey);

        // floorKey(): Returns the greatest key less than or equal to the given key, or null if there is no such key
        Integer floorKey = treeMap.floorKey(2);
        System.out.println("Floor Key: " + floorKey);

        // ceilingKey(): Returns the least key greater than or equal to the given key, or null if there is no such key
        Integer ceilingKey = treeMap.ceilingKey(2);
        System.out.println("Ceiling Key: " + ceilingKey);

        // higherKey(): Returns the least key strictly greater than the given key, or null if there is no such key
        Integer higherKey = treeMap.higherKey(2);
        System.out.println("Higher Key: " + higherKey);

        // lowerEntry(): Returns a key-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key
        Map.Entry<Integer, String> lowerEntry = treeMap.lowerEntry(2);
        System.out.println("Lower Entry: " + lowerEntry);

        // floorEntry(): Returns a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key
        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(2);
        System.out.println("Floor Entry: " + floorEntry);

        // ceilingEntry(): Returns a key-value mapping associated with the least key greater than or equal to the given key, or null if there is no such key
        Map.Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(2);
        System.out.println("Ceiling Entry: " + ceilingEntry);

        // higherEntry(): Returns a key-value mapping associated with the least key strictly greater than the given key, or null if there is no such key
        Map.Entry<Integer, String> higherEntry = treeMap.higherEntry(2);
        System.out.println("Higher Entry: " + higherEntry);

        // descendingKeySet(): Returns a reverse order NavigableSet view of the keys contained in this map
        System.out.println("Descending KeySet: " + treeMap.descendingKeySet());

        // descendingMap(): Returns a reverse order view of the mappings contained in this map
        System.out.println("Descending Map: " + treeMap.descendingMap());

        // subMap(): Returns a view of the portion of this map whose keys range from fromKey to toKey
        SortedMap<Integer, String> subMap = treeMap.subMap(1, 4);
        System.out.println("Sub Map: " + subMap);

        // headMap(): Returns a view of the portion of this map whose keys are strictly less than toKey
        SortedMap<Integer, String> headMap = treeMap.headMap(3);
        System.out.println("Head Map: " + headMap);

        // tailMap(): Returns a view of the portion of this map whose keys are greater than or equal to fromKey
        SortedMap<Integer, String> tailMap = treeMap.tailMap(2);
        System.out.println("Tail Map: " + tailMap);

        // navigableKeySet(): Returns a NavigableSet view of the keys contained in this map
        System.out.println("Navigable KeySet: " + treeMap.navigableKeySet());

        // clone(): Returns a shallow copy of this TreeMap instance
        TreeMap<Integer, String> clonedMap = (TreeMap<Integer, String>) treeMap.clone();
        System.out.println("Cloned Map: " + clonedMap);

        // Example to show the map after various operations
        System.out.println("Final TreeMap: " + treeMap);
    }
}
