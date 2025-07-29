package collection_framework_code.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/*
    Map Interface in Java :
        In Java, the Map Interface is part of the java.util package and represents a mapping between a key and a value.
        The Java Map Interface is not a subtype of the Collections interface. So, it behaves differently from the rest of the collection types.

        Key Freatures:
            -> No Duplicates in Keys : Keys should be unique, but values can ve duplicated.
            -> Null Handling : it allows one null key in implementations like HashMap and LikedHashMap, and allows multiple null values in most implementations.
            -> Thread-Safe Alternatives : Use ConcurrentHashMap for thread-safe operations. Also, wrap an existing map using Collections.synchronizedMap() for synchronized access.

            The Map data structure in java is imlemented by two interfaces:
                -> Map Interface
                -> SortedMap Interface
            The three Primary classes that implement these Interfaces are,
                => HashMap
                => TreeMap
                => LinkedHashMap

        Map ---> (Interface)
         ^ -> extends
     SequencedMap ---> (Interface)
         ^ -> extends
      SortdMap ---> (Interface)
         ^ -> extends
     NavigableMap ---> (Interface)
         ^ -> implements
      TreeMap ---> (class)

      Note: Which features are not there in HashMap
           1. sorting feature is not there in HashMap
           2. storing elements in sequence feature is not there in HashMap, Because that implementation itself is not extended there.

    (TreeMap it uses internally Red-Black Tree data structure)
    -> Storing the values in the TreeMap will happen as a key value pair only.
    -> now if we follow this data structure we now carefully observed that how a Red-Black Tree works

    What is the differece between HashMap & TreeMap ?
         HashMap uses Hash Table (data is not sorted,) / TreeMap uses Red-Black Tree data structure (data is sorted)
    Note: 1st Diff. In TreeMap what ever we did in HashMap that will work the Difference is in HashMap it will basically help us to sort our collection this is the biggest advantage
            the data here happens to be sorted where in HashMap data is not sorted. (give this one line answer and keep quite  in interview)
    2nd line answer : HashMap uses an interlying data structure which is Hash table Here the underLying data structure is Red-Black Tree
        2nd Diff. HashMap implements Map, where we can't store data in squence order & can't perform sorting, but we look at the Heirarchy here our TreeMap is Basically having the heirarchy like
                    Map <-extends SequencedMap (storing elements in sequence) <-extends SortedMap (sorting) these are the advantages TreeMap has over HashMap.

 */
public class TreeMap_Code {
    public static void main(String[] args) {
//        Map<Integer, String> map = new TreeMap<>();
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(32, "Bharat");
        map.put(18, "Sharada");
        map.put(78, "Narendra");
        map.put(54, "Rohan");

//        System.out.println(map.get(32)); // -> it will print the value associate with the key 32

        System.out.println(map);
        NavigableMap<Integer, String> navigableMap = map.descendingMap();
        System.out.println(navigableMap); // it will print the emements in descending order based on keys values.


    }
}
