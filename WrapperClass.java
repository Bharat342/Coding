

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10; // Storing data in primitive datatype

        // These all are creating an object of Wrapper classes and storing the value inside the object's reference address
//        Integer a1 = new Integer(10); // (Boxing)
        Integer a2 = 11;// -> (AutoBoxing) // Storing data in Wrapper Class's Integer object
        Float f = 10.23f;
        Double d = 234.234;
        Long l = 34243424l;
        Boolean b = true;

        int value = a2; // Here are we are converting the Wrapper classes object's value into primitive datatype value and storing.
        System.out.println(value);
        // This is only called UnBoxing (Reading the data from a Wrapper classes object only called UnBoxing..)
        /*
        Advantages of Wrapper Classes :
        1. Object Manupulation : Wrapper classes allow primitive types to be treated as objects, enabling the use of data structures like
           ArrayList, which can only store objects.
        2. Utility Methods : They provide utility methods for converting between types (e.g Integer.parseInt(), Double.valueOf())
        // Another Advantage of Wrapper classes is Utility methods that we can se

        Integer.valueOf(10) --> is a method in java that converts the integer value 10 into an "Integer" object.
        This method is a part of the Integer class and is commonly used for autoboxing or explicitly creating an Integer object from a primitive int.

       Note : There are 2 ways to store data in java ->
             1. using primitive datatype Ex : int a = 10;
             2. using creating object of Wrapper class and store inside that object Ex : Integer a = 10; ('a' is object reference address of Integer)
         */
    }
}
