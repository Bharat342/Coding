package exception.propogate_moverment;

import java.util.Scanner;

public class Demo1 {
    void fun1() {
        System.out.println("Connection Stablished in Demo1..");

//        try {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter a numirator : ");
//            int a = scan.nextInt();
//
//            System.out.println("Enter a Denomirator : ");
//            int b = scan.nextInt();
//
//            int c = a/b; // in this line Arthemetic Exception may generate
//            System.out.println(c);
//        } catch(Exception e) {
//            System.out.println("invalid input..");
//        }

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a numirator : ");
            int a = scan.nextInt();

            System.out.println("Enter a Denomirator : ");
            int b = scan.nextInt();

            int c = a/b; // in this line Arthemetic Exception may generate
        // when exception occur and the method doesn't handle the Exception
        // it doesn't directly go to the default handler instead
        // Exception object gets propogated below the stack if the caller of the method also has not handled
        //then again it will propogate below the stack if the caller also has not handled
        // then again it will propogate below the stack
        //And if ultimatly all method in the stack is over and none of them given the try catch it reaches the default Exception Handler.
         //once the exception object handeled propogation stops
            System.out.println(c);


        System.out.println("Connection Terminated in Demo1..");

    }
}
