
import java.util.LinkedList;

public class StackUsingLinkedList {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        System.out.println(ll); // print all the elements present inside the stack
        // putting elements into the stack using Linkedlist
        // stack follow first in last out (FILO) or last in first out (LIFO) principle
        System.out.println(ll.pop());
        // pop() method will retrieve the last data which is inserted into the stack and delete form the stack
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);



    }
}
