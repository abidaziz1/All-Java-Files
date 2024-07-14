import java.util.*;

public class TreeSetMethods {

    public static void main(String[] args) {
        // Creating a new TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the set
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);

        // Displaying the set
        System.out.println("TreeSet: " + treeSet);

        // Constructors of TreeSet
        // Default constructor
        TreeSet<Integer> defaultTreeSet = new TreeSet<>();

        // Constructor with Comparator
        Comparator<Integer> comparator = Integer::compare;
        TreeSet<Integer> comparatorTreeSet = new TreeSet<>(comparator);

        // Constructor with another Collection
        List<Integer> list = Arrays.asList(5, 6, 4);
        TreeSet<Integer> collectionTreeSet = new TreeSet<>(list);

        // Constructor with another SortedSet
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(7, 8, 9));
        TreeSet<Integer> sortedSetTreeSet = new TreeSet<>(sortedSet);

        // Methods of TreeSet

        // add(): Adds the specified element to this set if it is not already present
        treeSet.add(4);

        // addAll(): Adds all of the elements in the specified collection to this set
        treeSet.addAll(Arrays.asList(5, 6, 7));

        // remove(): Removes the specified element from this set if it is present
        treeSet.remove(7);

        // contains(): Returns true if this set contains the specified element
        boolean contains = treeSet.contains(1);

        // isEmpty(): Returns true if this set contains no elements
        boolean isEmpty = treeSet.isEmpty();

        // size(): Returns the number of elements in this set
        int size = treeSet.size();

        // clear(): Removes all of the elements from this set
        treeSet.clear();

        // clone(): Returns a shallow copy of this TreeSet instance
        TreeSet<Integer> clonedTreeSet = (TreeSet<Integer>) treeSet.clone();

        // iterator(): Returns an iterator over the elements in this set in ascending order
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        // descendingIterator(): Returns an iterator over the elements in this set in descending order
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println("Descending Iterator: " + descendingIterator.next());
        }

        // first(): Returns the first (lowest) element currently in this set
        Integer firstElement = treeSet.first();

        // last(): Returns the last (highest) element currently in this set
        Integer lastElement = treeSet.last();

        // lower(): Returns the greatest element in this set strictly less than the given element, or null if there is no such element
        Integer lowerElement = treeSet.lower(3);

        // higher(): Returns the least element in this set strictly greater than the given element, or null if there is no such element
        Integer higherElement = treeSet.higher(3);

        // floor(): Returns the greatest element in this set less than or equal to the given element, or null if there is no such element
        Integer floorElement = treeSet.floor(3);

        // ceiling(): Returns the least element in this set greater than or equal to the given element, or null if there is no such element
        Integer ceilingElement = treeSet.ceiling(3);

        // pollFirst(): Retrieves and removes the first (lowest) element, or returns null if this set is empty
        Integer polledFirst = treeSet.pollFirst();

        // pollLast(): Retrieves and removes the last (highest) element, or returns null if this set is empty
        Integer polledLast = treeSet.pollLast();

        // subSet(): Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive
        SortedSet<Integer> subSet = treeSet.subSet(2, 5);

        // headSet(): Returns a view of the portion of this set whose elements are strictly less than toElement
        SortedSet<Integer> headSet = treeSet.headSet(3);

        // tailSet(): Returns a view of the portion of this set whose elements are greater than or equal to fromElement
        SortedSet<Integer> tailSet = treeSet.tailSet(3);

        // Example to show the set after various operations
        System.out.println("Final TreeSet: " + treeSet);
    }
}
