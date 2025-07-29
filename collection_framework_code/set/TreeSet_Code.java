package collection_framework_code.set;

import java.util.TreeSet;

/*
    -> TreeSet is a class which extends AbstractSet(class) and implements NavigableSet(interface)

    -> TreeSet uses TreeMap(What does TreeMap uses internally/ data structure of TreeMap is = Red-Black Tree)
        NavigableSet extends SortedSet / child of SortedSet and SortedSet is a child of SequencedSet / extends SequencedSet again SequencedCollection.
    ->

    // what is the difference : TreeMap can contains Duplicate values.

     // Difference BetWeen HashSet and LinkedHashSet ?
        -> In HashSet the element should be unique but order of insertion is not maintain(if we want to maintain insertion order,
            and we don't want to have duplicate value then we should go for LinkedHashSet)
        -> In LinkedHashSet element are unique and insertion order is unique
        -> In TreeSet elements are Soreted because TreeSet implements SortedSet (Which means the element are going to be Sorted)
        -> TreeSet Sort the element in alphabatical order, and also it remove all the duplicate element (But HashSet and LinkedHashSet are not Sorted)
            if we want a Sorted set then we should go with TreeSet.
        -> TreeSet is actually using internally data structure of TreeMap(internally uses Red-Black Tree)
        -> The SequencedCollection has some extra features
 */

public class TreeSet_Code {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();

        tree.add("bharat");
        tree.add("sharada");
        tree.add("narendra");
        tree.add("bharat");
        tree.add("rohan");

        System.out.println(tree);
        System.out.println(tree.size()); // it will give us the size of the element
        System.out.println(tree.reversed()); // it will reverse the elements present inside the TreeSet

        /* -> Search on this 2 line perfectly.
            tree.addFirst("pankaj"); // here we will get UnsupportedOperationException because its already being sorted that's why its giving exceptions.
             System.out.println(tree);
         */

        // A list can have elements in sequence but a TreeSet cannot have elements in sequence.

    }
}
