package throw_throws_keyword;

public class Driver {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Main Method Connection estd..");
        Exception_Code ec = new Exception_Code();
        try {
            ec.test();
        } catch(Exception e) {
            System.out.println("Exception Handled in main");
        }

        System.out.println("Main Method Connection terminated..");
//        System.out.println(Integer.MAX_VALUE);
    }

}
    
