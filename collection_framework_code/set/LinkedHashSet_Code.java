package collection_framework_code.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Code {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>(); // -> its internally extends HashSet and implements SequencedSet
//        Set<String> set = new LinkedHashSet<>();

        set.add("Bharat");
        set.add("Sharada");
        set.add("Narendra");
        set.add("Rohan");
        set.add("Bharat");

        System.out.println(set); // printing the set
        System.out.println(set.reversed()); // printing the set in reversed order
        // LinkedHashSet extends HashSet(inheriting so that all the method can be usable of HashSet) implements  SequencedSet is an interface
        // which is extending SequencedCollection extends Collection

        // What is the internal structure of LinkedHashSet ?
         /*
              -> LinkedHashSet and HashSet the data structure is same because internally HashSet is using HashMap only
                and LinkedHashSet uses HashSet only which is indirectly using HashMap only.(LinkedHashSet is extending HashSet) and HashMap is using Hash table internally and hash table is created using hashing.
                TreeSet is internally uses TreeMap : like this only HashSet is internally uses HashMap
                data structure of TreeSet : Red-Black Tree (What is the difference)
             -> TreeMap can contains duplicate values.
             Difference between HashSet and LinkedHashSet ?
                * In HashSet Elements should be unique
                * But order of insertion is not maintain (if want to maintain insertion order and we don't want to have duplicate elements then we can go with LinkedHashSet)
          */

    }
}
