import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get the ListIterator
        ListIterator<String> listIterator = list.listIterator();

        // Traverse the list forward
        System.out.println("Forward traversal:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);

            // Modify element conditionally
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry");
            }
        }

        // Traverse the list backward
        System.out.println("Backward traversal:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }

        // Print the modified list
        System.out.println("Modified list: " + list);
    }
}
