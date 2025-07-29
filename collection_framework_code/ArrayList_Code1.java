package collection_framework_code;

import java.util.*;

public class ArrayList_Code1 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();

//        list.add(10);
//        list.add(20);
//        list.add(30);

        // add() will add the element but set() will replace the element

//        System.out.println(list);
//        System.out.println(list.contains(34));
//        System.out.println(list.add(50));
//        System.out.println(list);
//        System.out.println(list.set(2, 99));
//        System.out.println(list);
//        list.add(99);
//        System.out.println(list);

//        for(int a : list) {
//            System.out.println(a);
//        }

//        for(int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        list.remove(3);
//        System.out.println(list);
//        System.out.println(list.size());
//        list.trimToSize();
//        System.out.println(list.getClass().getName());
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//        System.out.println(list2);
//        List<Integer> list1 = List.of(4, 5, 6, 7, 8, 9);
//
//        list2.addAll(list1);
//        System.out.println(list2);


//        list.add(3);
//        list.add(5);
//        list.add(2);
//        list.add(1);
//        Collections.sort(list);
//        list.sort(null);
//        System.out.println(list);

//        List<String> list = new ArrayList<>();
//
//        list.add("banana");
//        list.add("apple");
//        list.add("date");

//        list.sort(null);
//        System.out.println(list);

        List<String> list = Arrays.asList("banana", "date", "apple");
        list.sort(new StringLengthComparator());
        System.out.println(list);

    }
}













