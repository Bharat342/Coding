package collection_framework_code;

import java.util.LinkedList;

public class LinkedList_Code1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(22);
        list.add(33);

        System.out.println(list.get(2)); // O(n)

        list.addFirst(5); // O(1)
        list.addLast(40); // O(1)

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);

        list.removeIf(x -> x % 2 == 0);// used lamdax expRression
        // to validate for removing even numbers in the list
        System.out.println(list);

    }
}


