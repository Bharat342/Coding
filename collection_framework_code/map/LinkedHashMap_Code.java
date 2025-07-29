package collection_framework_code.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

/*
    In Java, LinkedHashMap is a class that combines the features of a HashMap with a linked list to maintain a predictable iteration order.
             it stores key-value pairs like HashMap but also maintains a doubly-linked list running through its entries, preserving the order in which keys were inserted.

    Kay Fretures of LinkedHashMap :
                        -> Maintains Insertion Order : Unlike HashMap, which doesn't guarantee any specific iteration order,
                            LinkedHashMap maintains the order in which keys are inserted. This means when hou iterate over the map,
                            entries are returned in the order they were added.
                        -> Access Order Option : When creating a LinkedHashMap, you can specify weather it should maintain insertin orer (accessOrder = false) or access order (accessOrder = true).
                           In access order, entries are moverd to the end oft the lst when accessed, which is useful for implementing LRU(Least Recently Used) caches.
                        -> Performance : LInkedHashMap provides constant-time performance (O(1)) for basic operations like get() and put(), similar to HashMap. However,
                            it uses more memory due to the additional linked list that maintains the order.
                        -> Null Keys and Values : It allows one null key and multiple null values, just like HashMap.
                        -> Not Synchroniszed : LinkedHashMap is not synchronized. if multiple threads access a LinkedHashMap concurrently and at least onwe of the threads modifies it structurally, it must be synchronized externally.
                Diff between HashMap and LinkedHashMap ?
                    In HashMap order of insertion is not maintains where in LinkedHashMap order of insertion is maintains.
                    why because LinkedHashMap implements SequencedMap Collection.
                    What is the job of SequencedMap Collection Interface : maintain the insertion order. (Where HashMap doesn't maintain that)

    public class LinkedHashMap<K,V> extends HashMap<K,V> implements SequencedMap<K,V>
    -> LinkedHashMap Maintain the order of insertion because it is implementing 'SequencedMap' Interface.
        and it is extending HashMap also so every method will be present inside LinkedHashMap also.
 */

public class LinkedHashMap_Code {
    public static void main(String[] args) {
//        Map<Integer, String> map = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(9, "Bharat");
        map.put(18, "Pankaj");
        map.put(3, "Sharada");

        System.out.println(map); // output : {9=Bharat, 18=Pankaj, 3=Sharada}
        // printing the map -> it will print in the order in which order we inserted the elements.

//        SequencedMap<Integer, String> reversed;// it will reverse the order of insertion of elements of 'map' and will give the output
//        reversed = map.reversed();
//        System.out.println(reversed);

        System.out.println(map.reversed());

    }
}
