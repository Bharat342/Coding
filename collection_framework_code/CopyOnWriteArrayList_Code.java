package collection_framework_code;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_Code {
    public static void main(String[] args) {
//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList();
        // "Copy on Write" means that whenever a write operation
        // like adding and removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // this ensures that others threads reading the list while it's being modified are unaffected

        // Read Operations : Fast and Direct, since they happen on a stable list without interference from modification.
        // Write Operations : A new copy of the list is created for every modifiacation.
        //                      The reference to the list is then updated so that subsuquent reads use this new list.

        // when we should use this class : when we have the demands of write is less and reads is more then we should so with this class.


        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Bharat");
        list.add("Sharada");
        list.add("Narendra");
        list.add("Rohan");

        for(String s : list) {
            System.out.println(s);
            if(s.equalsIgnoreCase("narendra")) {
                list.add("Naik");
            }
        }

        // old = new
        System.out.println(list);

        CopyOnWriteArrayList_Code copyOnWriteArrayListCode = new CopyOnWriteArrayList_Code();
        copyOnWriteArrayListCode.sharedList();

    }

    void sharedList() {

//        List<String> list = new ArrayList<>(); // here we are getting exception.
        List<String> list = new CopyOnWriteArrayList<>(); // thats why
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");

        Thread readerThread = new Thread(() -> {
            try{
                while(true) {
                    //iterate through the list
                    for(String item : list) {
                        System.out.println("Reading items: " + item);
                        Thread.sleep(100); // Small Delay to simulate work
                    }
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        });

        Thread writerThread = new Thread(() -> {
            try{
                while(true) {
                    Thread.sleep(500); // Delay to allow reading to start first
                    list.add("item4");
                    System.out.println("Added item4 to the list...");

                    Thread.sleep(500);
                    list.remove("item1");
                    System.out.println(list);
                    System.out.println("Remove item1 from the list.");
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        });
        readerThread.start();
        writerThread.start();
    }
}
