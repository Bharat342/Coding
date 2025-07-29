package exception;

import java.util.Scanner;

public class Exception_Code {

/*
// Writing program without using exception Handling
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Connection Established!");

            System.out.println("Enter the Numerator : ");
            int a = scan.nextInt();

            System.out.println("Enter the Denomirator : ");
            int b = scan.nextInt();

            int c = a/b; // Here we will get "ArithmeticException"

            System.out.println(c);

        System.out.println("Connection Terminated!");

    }

 */


    //Here we are writing program using Exception Handling.
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Connection Established!");

            System.out.println("Enter the Numerator : ");
            int a = scan.nextInt();

            System.out.println("Enter the Denomirator : ");
            int b = scan.nextInt();

            int c = a/b; // in this line exception will generate
            // But we are handling the exception using try & catch block
            // when an exception will generate it will create an exception object then it will give to Runtime System
            // then runtime system will check for catch block is there any catch block is present to handle the exception
            // if it presents then exception will be handeled and normal termination will happen
            // otherwise runtime system will give the exception the to the Default exception haldler which will abruptly terminate the program
            // where we may lose the data.
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Something Wrong Happened..."); // giving the message after handled the exception
        }

        System.out.println("Connection Terminated!");

    }
}
