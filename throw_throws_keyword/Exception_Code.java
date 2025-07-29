package throw_throws_keyword;

import java.util.Scanner;

public class Exception_Code {
    void test() throws Exception  {

        System.out.println("Test Connectin Established..");
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter Value for A : ");
            int a = scan.nextInt();

            System.out.println("Enter value for B : ");
            int b = scan.nextInt();

            int c = a/b;
            System.out.println(c);

        }catch(Exception e) {
            System.out.println("Exception Handled in Test()!");
            throw e;
        }
        finally {
            System.out.println("Test Connection Terminated..");
        }
    }
}
