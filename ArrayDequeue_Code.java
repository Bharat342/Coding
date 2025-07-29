
import java.util.*;

public class ArrayDequeue_Code {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();

        ad.add(10);
        ad.add(20);
        ad.addFirst(30);
        System.out.println(ad); // it will add elements in the first index
        ad.addLast(40);// it will add elements in the last index
        System.out.println(ad);
        // ArrayDeque internally make use of Data Structure called as the Doubly Ended Queue
        // it is a Queue but which can be access from both end.
        System.out.println(ad.peekFirst());
        System.out.println(ad);
        System.out.println(ad.peekLast());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.pollLast());
        System.out.println(ad);
    }
}
