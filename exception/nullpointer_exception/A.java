package exception.nullpointer_exception;

public class A {
    // 1. Accessing methods or fields on a null return
    String s = null;

    // 2. Calling methods on a null return
    String checkLength() {
        return null;
    }

    // 3. Using Null in Array
    String[] arr = new String[3];

    // 4. Autoboxing null values
    void checkAutoBoxException() throws NullPointerException {
        Integer test = null;
        int result = test + 5; //NPE during unboxing
        System.out.println(result);
    }
}

