package exception.numberformat_exception;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number :");
        String s = scan.next();

        A a = new A();

        try {
            System.out.println(a.convertStringToInt(s));
            System.out.println(a.convertStringToFloat(s));
            System.out.println(a.convertStringToDouble(s));
        } catch(Exception e) {
//            e.printStackTrace();
            System.out.println("invalid input!");
        }

    }
}