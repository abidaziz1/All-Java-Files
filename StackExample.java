import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // push(E item) - Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushes: " + stack);

        // peek() - Look at the top element without removing it
        System.out.println("Peek: " + stack.peek());

        // pop() - Remove and return the top element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // empty() - Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());

        // search(Object o) - Search for an element
        int position = stack.search("Banana");
        if (position != -1) {
            System.out.println("Banana found at position: " + position);
        } else {
            System.out.println("Banana not found in the stack");
        }

        // Popping all elements to make the stack empty
        stack.pop();
        stack.pop();
        System.out.println("Stack after popping all elements: " + stack);
        System.out.println("Is the stack empty? " + stack.empty());
    }
}
