package collection_framework_code;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Vector_Code {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5);// initialising capacity of the verctor
        // Default capacity of vector is 10 like arraylist only
//        System.out.println(vector.capacity());
        // we can check the capacity of the vector also unlike arraylist
        // for this method is there for vector ".capacity()"
        // here vector size will increase by double(old size * 2) where in arraylist size will increase by 1.5 time(old size * 1.5)

        // checking the capacity of the vector which we gave as 5
        System.out.println(vector.capacity());

        //inserting 2 values in the vector
        vector.add(1);
        vector.add(1);

        // then checking the size of the vector. It will give how many content are there inside the vector
        System.out.println("Size : " + vector.size());
        // inserting again more 3 value inside the vector
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("Capacity : " + vector.capacity()); // checking the capacity again
        // here we inserting one more value to the vector but the size we gave for this vector is 5 but we are exceeding
        // then automatically size of the vector will increase by (old value * 2)
        vector.add(1);
        // after inserting the value we are checking the capacity of the vector and size also
        System.out.println("Capacity : " + vector.capacity()); // before Capacity it was 5 but now it become (old size * 2) 5 * 2 = 10
        System.out.println("Size : " + vector.size());// size means the total number of contect present inside the verctor which is nothing but 6

        // if we want our vector capacity to be increse by scecific number then we can tell that also
        // exp : Vector<Integer> vector = new Vector<>(5, 3);
        // In vector Constructor the first index is for initialised the capcity and the second index we are giving to increse the capacity by specific number
        // Now when the capacity == size then the capacity will increase by 3 unlike double the capacity.

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        Vector<Integer> vector1 = new Vector<>(linkedList);
        //System.out.println(vector1); // OR

//        for(int x : vector1) {
//            System.out.print(x + " ");
//        }

//        for(int i=0; i<vector1.size(); i++) {
//            System.out.println(vector1.get(i));
//        }

        System.out.println(vector1);
        vector1.set(2,40); // replace 40 in 2nd index
        System.out.println(vector1);
        vector1.add(50);// add the value in last index
        System.out.println(vector1);
        System.out.println(vector1.firstElement());

        vector1.clear(); // Removes all elements from the Vector.
        System.out.println(vector1);

    }
}
