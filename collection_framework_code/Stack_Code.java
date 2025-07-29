package collection_framework_code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Stack_Code {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Stack follow (LIFO) Last in First out principle
        // when we want to insert the element into the stack then the element will be store above the last element get stored
        // when we pop or remove an element from the stack last element will only remove from the stack which is stored last time
        // last in first out -- first in last out
        // Pushing/ Inserting element into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Poping/ removing the element from the stack
//        stack.pop();

        System.out.println(stack);
        Integer i = stack.pop();
        System.out.println(i);

//        System.out.println(stack.getClass().getName()); // printing the class name and printing the class name with path
        // 57682

        Integer peek = stack.peek();// peek method will not remove the element(like pop()) instead it will only show the element.
        System.out.println(peek);

        System.out.println(stack);

        System.out.println(stack.isEmpty()); // to check weather the stack is empty or not it will give us boolean(true/ false).

        System.out.println(stack.size()); // give the size how many elements present inside the stack.

        System.out.println(stack.capacity()); // it will give the capacity (Initial capacity is 10)

        stack.trimToSize(); // it will trim the stack to size to save memory
        System.out.println(stack.capacity());

        System.out.println(stack.search(30)); // it will search the index and give (it is 1 based indexing and start from top to buttom)

        Stack_Code stackCode = new Stack_Code();
//        stackCode.linkedList_As_Stack();
        stackCode.arrayList_As_Stack();

    }

    void linkedList_As_Stack() {
        /*
        -> We can use LinkedList as a stack using LinkedList inbuild methods get with takecare of Stack nature
         */
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);

        System.out.println(linkedList);
        System.out.println(linkedList.getLast()); // (like peek() ) just getting the last element from the linkedlist
        linkedList.removeLast(); // (like pop())Removing the last element from the linkedlist
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty()); // to check weather the stack is empty or not it will give us boolean(true/ false).

    }

    void arrayList_As_Stack() {
        /*
        -> We can use ArrayList also as a stack using ArrayList inbuild methods get with takecare of Stack nature
         */
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        Integer lastElement = arrayList.get(arrayList.size() - 1); // accessing the last element like in Stack
        System.out.println(lastElement); // printing the last element of arraylist.

    }
}





