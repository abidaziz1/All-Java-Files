import java.util.LinkedList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add: " + list); // Output: [Apple, Banana, Cherry]

        // Adding all elements from another collection
        LinkedList<String> anotherList = new LinkedList<>();
        anotherList.add("Date");
        anotherList.add("Elderberry");
        list.addAll(anotherList);
        System.out.println("After addAll: " + list); // Output: [Apple, Banana, Cherry, Date, Elderberry]

        // Clearing the LinkedList
        list.clear();
        System.out.println("After clear: " + list); // Output: []

        // Cloning the LinkedList
        list.add("Fig");
        list.add("Grape");
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList); // Output: [Fig, Grape]

        // Checking if the list contains a specific element
        System.out.println("Contains 'Fig': " + list.contains("Fig")); // Output: true
        System.out.println("Contains 'Apple': " + list.contains("Apple")); // Output: false

        // Getting the index of a specific element
        System.out.println("Index of 'Grape': " + list.indexOf("Grape")); // Output: 1
        System.out.println("Index of 'Apple': " + list.indexOf("Apple")); // Output: -1

        // Ensuring a minimum capacity
        //list.ensureCapacity(10);
        // No direct output, but it ensures that the list can hold at least 10 elements without resizing

        // Getting an element at a specific index
        System.out.println("Element at index 1: " + list.get(1)); // Output: Grape

        // Using an iterator to traverse the list
        Iterator<String> iterator = list.iterator();
        System.out.print("Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // Output: Iterator: Fig Grape 

        // Removing an element
        list.remove("Fig");
        System.out.println("After remove 'Fig': " + list); // Output: [Grape]

        // Removing an element by index
        list.remove(0);
        System.out.println("After remove at index 0: " + list); // Output: []

        // Retaining only the elements in the list that are contained in another collection
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        LinkedList<String> retainList = new LinkedList<>();
        retainList.add("Banana");
        retainList.add("Cherry");
        list.retainAll(retainList);
        System.out.println("After retainAll: " + list); // Output: [Banana, Cherry]

        // Removing all elements contained in another collection
        LinkedList<String> removeList = new LinkedList<>();
        removeList.add("Banana");
        list.removeAll(removeList);
        System.out.println("After removeAll: " + list); // Output: [Cherry]

        // Setting an element at a specific index
        list.set(0, "Apple");
        System.out.println("After set: " + list); // Output: [Apple]

        // Getting the size of the list
        System.out.println("Size: " + list.size()); // Output: 1

        // Getting a sublist of the list
        list.add("Banana");
        list.add("Cherry");
        List<String> sublist = list.subList(1, 3);
        System.out.println("Sublist: " + sublist); // Output: [Banana, Cherry]

        // Converting the list to an array
        Object[] array = list.toArray();
        System.out.print("Array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println(); // Output: Array: Apple Banana Cherry 

        // Converting the list to a typed array
        String[] stringArray = list.toArray(new String[0]);
        System.out.print("Typed Array: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println(); // Output: Typed Array: Apple Banana Cherry 

        // Checking if the list is empty
        System.out.println("Is empty: " + list.isEmpty()); // Output: false

                // Getting the last index of a specific element
                list.add("Apple");
                System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple")); // Output: 3
        
                // Replacing all elements using a UnaryOperator
                list.replaceAll(e -> e.toUpperCase());
                System.out.println("After replaceAll: " + list); // Output: [APPLE, BANANA, CHERRY, APPLE]
        
                // Sorting the list
                list.sort(Comparator.naturalOrder());
                System.out.println("After sort: " + list); // Output: [APPLE, APPLE, BANANA, CHERRY]
        
                // Performing an action for each element
                System.out.print("forEach: ");
                list.forEach(e -> System.out.print(e + " "));
                System.out.println(); // Output: forEach: APPLE APPLE BANANA CHERRY 
        
                // Offer and poll operations
                list.offer("Date");
                System.out.println("After offer: " + list); // Output: [APPLE, APPLE, BANANA, CHERRY, DATE]
                System.out.println("Poll: " + list.poll()); // Output: APPLE
                System.out.println("After poll: " + list); // Output: [APPLE, BANANA, CHERRY, DATE]
        
                // Peek operation
                System.out.println("Peek: " + list.peek()); // Output: APPLE
                System.out.println("After peek: " + list); // Output: [APPLE, BANANA, CHERRY, DATE]
        
                // Element operation
                System.out.println("Element: " + list.element()); // Output: APPLE
                System.out.println("After element: " + list); // Output: [APPLE, BANANA, CHERRY, DATE]
            }
        }