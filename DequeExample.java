import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a Deque using LinkedList
        Deque<String> deque = new LinkedList<>();

        // Adding elements to the deque
        deque.add("Element 1 (Tail)");        // add() inserts at the tail
        deque.addFirst("Element 2 (Head)");   // addFirst() inserts at the head
        deque.addLast("Element 3 (Tail)");    // addLast() inserts at the tail
        deque.push("Element 4 (Head)");       // push() is equivalent to addFirst()
        deque.offer("Element 5 (Tail)");      // offer() inserts at the tail
        deque.offerFirst("Element 6 (Head)"); // offerFirst() inserts at the head
        deque.offerLast("Element 7 (Tail)");  // offerLast() inserts at the tail

        System.out.println("Deque after adding elements: " + deque);

        // Accessing elements from the deque
        System.out.println("First Element: " + deque.getFirst());   // getFirst() fetches the head
        System.out.println("Last Element: " + deque.getLast());     // getLast() fetches the tail
        System.out.println("Peek Element: " + deque.peek());        // peek() fetches the head
        System.out.println("Peek First Element: " + deque.peekFirst()); // peekFirst() fetches the head
        System.out.println("Peek Last Element: " + deque.peekLast());   // peekLast() fetches the tail

        // Removing elements from the deque
        System.out.println("Removed First Element: " + deque.removeFirst()); // removeFirst() removes the head
        System.out.println("Removed Last Element: " + deque.removeLast());   // removeLast() removes the tail
        System.out.println("Popped Element: " + deque.pop());    // pop() removes the head (equivalent to removeFirst())
        System.out.println("Poll Element: " + deque.poll());     // poll() removes the head
        System.out.println("Poll First Element: " + deque.pollFirst()); // pollFirst() removes the head
        System.out.println("Poll Last Element: " + deque.pollLast());   // pollLast() removes the tail

        System.out.println("Deque after removing elements: " + deque);

        // Iterating through the elements in the deque
        deque.add("Element 8");
        deque.add("Element 9");
        deque.add("Element 10");

        System.out.println("Iterating through the deque using iterator:");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating through the deque using descending iterator:");
        Iterator<String> descendingIterator = deque.descendingIterator();
        while(descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }
        
        // Clearing the deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}
