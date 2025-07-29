package collection_framework_code.map;

/*
    HashMap

    A HashMap is a data structure that is used to store data as a Key Value pair and retrieve values based on keys.

    Some of the key characteristics of a hashmap include:
            Not ordered:
                    HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved.
                    However, LinkedHashMap is a variation of HashMap that preserves the insertion order.
            Thread-unsafe:
                    HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, it can lead to data inconsistencies.
                    If thread safety is required, ConcurrentHashMap can be used.
            Capacity and load factor:
                    HashMaps have a capacity, which is the number of elements that it can hold, and a load factor, which is the measure of how full the hashmap can be before it is resized.


      In Java, HashMap is part of the Java Collections Framework and is found in the java.util package.
      It provides the basic implementation of the Map interface in Java. HashMap stores data in (key, value) pairs.
      Each key is associated with a value, and you can access the value by using the corresponding key.

      -> Internally uses Hashing (similar to Hashtable in Java).
        Not synchronized (unlike Hashtable in Java) and hence faster for most of the cases.
        Allows to store the null keys as well, but there should be only one null key object, and there can be any number of null values.
        Duplicate keys are not allowed in HashMap, if you try to insert the duplicate key, it will replace the existing value of the corresponding key.
        HashMap uses keys in the same way as an Array uses an index.
        HashMap allows for efficient key-based retrieval, insertion, and removal with an average O(1) time complexity.

        Note: Keys and value can't be primitive datatype.
        Key in Hashmap is valid if it implements hashCode() and equals() method ,
        it should also be immutable (immutable custom object ) so that hashcode and equality remains constant.
        Value in hashmap can be any wrapper class, custom objects, arrays, any reference type or even null .
        For example, Hashmap can have array as value but not as key.

        For hashMap what is a Underlying Datastructure : HashTable
        -> Initial Hash Table Size (16)
        -> Load Ratio (0.75)
        -> Capacity (16 * 0.75 = 13)

        -> In java the moment we create an Object of HaspMap behind the scene a table will get created with 16 initial capacity.
        -> Constructs an empty HashMap with the default initial capacity (16) and the default load factor/ratio (0.75).
        -> Initially we can store 16 value in it but moment the load of the table happens to be 0.75% percent of this is 13 rows
            when 13 rows are filled with data the table size automatically become double (16 * 2) which is 32
            when again when (32 * 0.75 = 24) which is the capacity = 24 if it will also fill with data then again the table
            size automatically become double (32 * 2 = 64) and so on.
    What is hashing ?
        -> hashing is a technique which is converts horrible looking memory into an Integer value representation.
        -> Hashing in Java is the process of converting a key into an integer (called a hash code) using a hash function,
            so that data can be stored and retrieved quickly in hash-based data structures like HashMap.
        -> hashCode() is present inside the Object class in java which is the parent class of all the classes.
        --> what ever methods presents inside Object class its present in every class in java. we can use those methods in every class in java.
    Advantages of Hashing ?
        -> It will very smartly convert our original text into some number,
            and because of hashing that number helps us a security parameters while saving the password in Database.




 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HashMap_Code {
    public static void main(String[] args) {

        // it's store data in Key & Value Pair
        Map<String, Integer> map = new HashMap<>();

        map.put("8328817874", 4242);
        map.put("8328812344", 4266);
        map.put("8328812344", 4262); // -> Duplicates are not allowed here so the earlier value will be replaced with the new value.
        map.put("8328823434", 4266); // -> But the values can be duplicate.

        System.out.println(map); // printing the map

        System.out.println(map.remove("8328817874")); // remove the data using key & and printing what its removed (it will print the value not key)
        System.out.println(map);

//        doHashing("mike");
//        experiment();
        hashMapCode();

        LinkedList<String> list = new LinkedList();

    }

    static void experiment() {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.put("india", "New Delhi"));
        /*
               -> we have key value pair hashmap and internally hashmap underlying data structure uses of hash table
                    which can store only one value and it will store 'key' only because 'value' can be duplicate but key should be unique.
                    -> we are taking the 'key' and applying Hashing on it. (How can we applyiing hashing on it = by using hashCode() method)
                        exp : System.out.println("india".hashCode()); output -> 70793495
                    -> why we are applying hashing : because whatever input we gave it will first convert into a number.
                    System.out.println(70793495 % 16); output : 7 (7 is nothing but the index value where the 'key' value will allocate memory)
                    -> Here the 16 is the table size and

                Internal Structure of HashMap
                     -> Each entry in a HashMap is represented by a Node Object, which contains:
                        * hash : the hash code of the key.
                        * key : the key object.
                        * value : the associated value.
                        * next : reference to the next node in case of a collision.
                      -> These nodes are stored in an array, and the position of each node is determined by hashing.
                            the key and applying a modulo operaion with the array's length.

                    Collision in Hasing :
                        -> In java, when implementing a HashMap, collisions can occur when two keys hash to the same index.
                            One common approach to handle these collisions is to use a linked list (chaining) to store multiple enteries at the same index.
                            However, you can also use a balanced tree structure (like a TreeNode for a binary tree) when the linked list exceeds a certain threshold.
                            This helps maintain better performance for retrievals when collisions occur.
                                Implementation Overview
                                    1. Chaining with Linked List: When a collision occurs, you can add the new entry to a linked list next index.
                                    2. Switching to TreeNode: if the linked list grows beyond certain threshold (e.g., 8), you can convert it to a balanced tree (like a red-black tree) for better performance.
                        -> Collisions happen when two or more keys point to the same array index.
                            To resolving we have many Technique :
                                -> Chaining, Open addressing, and double hashing are a few technique for resolving collisions.
                                -> Chaining is the more commonly use technique.
                                What is chaining technique :
                                     -> Example : hashIndex = key % noOfBuckets(size of the hashtable)
                                     -> First we have to converts that 'key' value into hashcode then only we can perform(hashIndex = key % noOfBuckets)
                                        because % operation is applicable only happen on Integer value.

                                 -> As per java 8 : when we're doing indexing and a collisionc occur (duplicate 'key' value found)

         */

    }

    static void doHashing(String str) {
        System.out.println(str.hashCode()); // output : 3351542 (hashCode)
         /* -> hashCode() also will work with String class because String class is the child class of Object class.
                and the hashCode() belongs to Object class.
                -> the inheritance always begins from Objects.
          */
    }

    static void hashMapCode() {
        System.out.println();

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "bharat");
        map.put(1, "sharada");
        map.put(4, "narendra");
        map.put(3, "rohan");

//        System.out.println(map); // printing the map
//        System.out.println(map.get(1)); // we are giving the key as input and based on the key it will give the value belongs to that key

//        "map.keySet();" // it will give all the key present in map
        // keys here are stored as a 'set' (Why 'Set' : because 'Set' cannot have duplicate value)

        Set<Integer> keys = map.keySet();
        // keySet() -> keySet only fetch the keys.
        // 'list' can have deplicate values but 'set' cannot have duplicate value(Each value should be unique to each other)
        // Set is the collection of non-repeatative value.

//         approach 1.
//        for(Integer key : keys) {
//            System.out.println(key + " " + map.get(key));
//        }

        // approach 2.
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();// keySet() -> keySet only fetch the keys exp: (2(key)). but entrySet() fetch a key value pair
        // Which means a one entrySet has a key value pair exp: (2(key) = "bharat"(value))
        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}









