import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Connection Stablished");
        try {
            System.out.println("Enter the value of a : ");
            int a = scan.nextInt();

            System.out.println("Enter the value of b : ");
            int b = scan.nextInt();
            int c = a/b;
            System.out.println("The Result is : " + c);
        } catch(Exception e) {
            System.out.println("Enter valid value please");
        }
        System.out.println("Program Terminated.");
    }
}