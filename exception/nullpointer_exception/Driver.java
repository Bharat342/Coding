package exception.nullpointer_exception;

public class Driver {
    public static void main(String[] args) {
        A a = new A();
        try {
            // 1. Accessing methods or fields on a null return
            /*
            System.out.println(a.s.length());
             */

            // 2. Calling methods on a null return
            /*
            String s = a.checkLength();
            System.out.println(s.toLowerCase());
             */

            // 3. Using Null in Array
            /*
            System.out.println(a.arr[0].length());
             */
            // 4. Autoboxing null values

            a.checkAutoBoxException();

        } catch(NullPointerException e) {
//            e.printStackTrace();
            System.out.println("Exception is handled!");
        }
    }

}
