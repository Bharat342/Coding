
import java.util.LinkedList;

public class LinkedList_Code {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.addFirst(40);// adding elements to the first index
        ll.addLast(50);// adding elements to the last index
        System.out.println(ll);// print all the elements present inside the list
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        // getFirst method will give the first element of the linkedlist
        // if the linkedlist is empty then this method will give an NoSuchElementException
        // to resolve this problem we make use of peekFirst() which is work same as getFirst()
        // but it will not give an NoSuchElementException even if the linkedlist is empty.
        System.out.println(ll.peekFirst());

        System.out.println(ll.pollFirst());//this method will also give the first element of the linkedlist
        //but after giving the elements it will delete the elements from the list.

        // peekFirst() peekLast() --> peek will retrieve but not delete
        // pollFirst() pollLast() --> poll will retrieve but will also delete

        System.out.println(ll);
    }
}
