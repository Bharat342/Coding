package collection_framework_code.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    Set is used for storing unique elements.(In List Duplicate Elements are allowed but no in Set)
    (In HashMap the key cannot be duplicate but values can be duplicate)
    -> but what if i have a requirement in my project such that we have to store Unique elements then in that case we should always go with Set
        when we are talking about Set. then we have something called as SequencedSet
    -> In Set what we get is only Unique element(Duplicate element will not be stored here)
    -> Set is an interface (so who is implementing Set Interface : There are many classes who implement Set Interface)
    -> HashSet Directly Implement Set, Which Means the order in which i entered the element the order will not be retained.
    -> LinkedHashSet extends HashSet and Directly implements SequencedSet(it was introduced in java 21.)
    -> Before java version 21 - SequencedSet, SequencedMap and Sequenced Collection was not there.
    Coming to HashSet & HashMap what is the difference ?
        -> In HashMap Elements are stored in key-value pairs (But in HashSet content not stored as a key-value pairs)
            -> In HashSet What is the data structure internally it is using/ Tell me the internal working of HashSet ?
               Note : HashSet uses Hashing & it also uses Hash table & HaspMap internally
            -> when we are using HashSet is internally using HashMap only and when we are using is internally using Hash Table only.
        ->

 */
public class HashSet_Code {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Bharat");
        set.add("Sharada");
        set.add("Narendra");
        set.add("Rohan");
        set.add("Bharat");
        // 5 element we inserted but only 4 element get inserted into the HashSet
        System.out.println(set);// printing the set

        System.out.println(set.size());// output : 4 (Because we cannot have duplicate value)

        // -> 1st. way to iterate
//        for(String val: set) {
//            System.out.println(val);
//        }

        // -> 2nd way to iterate (Here we can use iterator)
        Iterator<String> stringIterator = set.iterator();
        while (stringIterator.hasNext()) { // -> it will check weather the element present or not.
            System.out.println(stringIterator.next()); // -> printing the element
        }

        boolean result = set.contains("Bharat"); // internally it is checking the map.containsKey() only and it will give us true or false.
        System.out.println(result); // printing the result (true/ false)
        // which means HashSet is nothing being implemented internally except one thing that is being done which is 'Unique value'.
        // set.contains() is coming from map.containsKey() only which is belongs to HashMap class.
        // all the set values are stored in HashMap as a key-value Pairs key here is "Bharat" and value here is fixed "PRESENT" for all keys.

        boolean remove_result = set.remove("Bharat"); // here also in internally it uses HaspMap remove() method only HashSet doesn't have its own remove method rather its uses HashMap methods.
        // we are calling the remove method but internally its using the map remove() method.
        System.out.println(remove_result); // -> it will return true if it will remove else will return false.
        System.out.println(set); // printing the  set again after removing. (we should say like in interview "Sir HashSet internally uses HashMap")
        /*
        Now values that are being stored here is not key-value pairs like HashMap then how come Hash Table is being use.
        Note : 1. But HashSet is actually is using internally HashMap only. But the element should unique.
                2. Inside a Hash Table the values of "set" stored as a key and in the place of value is store a 'PRESENT' object
                    which is common for every 'set' values in key place
                    (Because HashMap cannot have duplicate key but it can have dupliceate values except one null value is allowed)


         */
    }
}
