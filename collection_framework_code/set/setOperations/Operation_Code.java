package collection_framework_code.set.setOperations;

import java.util.HashSet;
import java.util.Set;

/*
        Union : It is a combination of both the Set (Here we are combining 2 different data structures is only called Union)

     */
public class Operation_Code {
    public static void main(String[] args) {
//        unionOperation();
        intersectionOperation();
    }

    public static void unionOperation() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(4);

        System.out.println(set1);
        System.out.println(set1.addAll(set2)); // now it is combining set2 with set1, and it will give the output as : true/ false
        System.out.println(set1); // added updated set1 we will get as output : [4, 5, 11, 12]

        System.out.println(set2);
    }

    public static void intersectionOperation() {

        /*
            -> we want the common elements between 2 sets.
         */

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(6);

//        System.out.println(set1.containsAll(set2)); // Returns true if this set contains all the elements of the specified collection. If the specified collection is also a set, this method returns true if it is a subset of this set.
//        // subset means set2 all elements should be present inside set1 then only it will return as ture else it will return false.
//
//        System.out.println(set1.removeAll(set2)); // here the common elements between these 2 set will remove from set1, and it will return true/ false
//        System.out.println(set1); // [12] -> 10 was common between set1 and set2
//        System.out.println(set2); // [10, 15] -> set2 will give output as it is because we didn't remove from set2 we remove the common element from set1

//        set1.retainAll(set2);
//        System.out.println(set1);

//        To find the intersection of two sets in Java, you can use the retainAll() method provided by the Set interface. This method modifies the set it is called on to keep only the elements that are also contained in the specified collection
        //retainAll() modifies the calling set. If you don't want to change set1, make a copy of it first.
        //This works with any types of Set, including TreeSet, LinkedHashSet, etc.
        /*
            Difference between List and Set ?







                Use Cases:
                    Use List when:
                            You need duplicates
                            You need to access elements by index
                            You care about the exact insertion order
                    Use Set when:
                            You want to eliminate duplicates
                            You need fast membership checks
                            You don't care about element position.
         */


    }
}
