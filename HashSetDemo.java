import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // Constructors
        // Default constructor
        HashSet<String> set1 = new HashSet<>();
        
        // Constructor with initial capacity
        HashSet<String> set2 = new HashSet<>(20);
        
        // Constructor with initial capacity and load factor
        HashSet<String> set3 = new HashSet<>(20, 0.75f);
        
        // Constructor with another collection
        List<String> list = Arrays.asList("One", "Two", "Three");
        HashSet<String> set4 = new HashSet<>(list);
        
        // Adding elements
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
        set1.add("Grapes");
        
        // Adding duplicate element
        set1.add("Apple"); // Duplicate, will not be added
        
        // Displaying the HashSet
        System.out.println("HashSet: " + set1);
        
        // Checking if an element exists
        System.out.println("Contains 'Banana'? " + set1.contains("Banana"));
        System.out.println("Contains 'Mango'? " + set1.contains("Mango"));
        
        // Removing elements
        set1.remove("Grapes");
        System.out.println("After removing 'Grapes': " + set1);
        
        // Checking size
        System.out.println("Size of the HashSet: " + set1.size());
        
        // Checking if HashSet is empty
        System.out.println("Is the HashSet empty? " + set1.isEmpty());
        
        // Iterating through the HashSet
        System.out.println("Iterating over HashSet:");
        for (String element : set1) {
            System.out.println(element);
        }
        
        // Using iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clearing the HashSet
        set1.clear();
        System.out.println("After clearing, is the HashSet empty? " + set1.isEmpty());
        
        // Cloning the HashSet
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Cherry");
        HashSet<String> clonedSet = (HashSet<String>) set2.clone();
        System.out.println("Cloned HashSet: " + clonedSet);
        
        // Using addAll to add elements from another collection
        set3.addAll(set2);
        System.out.println("After addAll: " + set3);
        
        // Using retainAll to retain common elements
        set3.add("Dragonfruit");
        set3.retainAll(set2);
        System.out.println("After retainAll: " + set3);
        
        // Using removeAll to remove elements present in another collection
        set3.removeAll(set2);
        System.out.println("After removeAll: " + set3);
        
        // Checking if it contains all elements of another collection
        System.out.println("Does set2 contain all elements of list? " + set2.containsAll(list));
    }
}
