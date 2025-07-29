package smart_payment_system;

import java.util.Scanner;

public class Customer extends User {

    Scanner scan = new Scanner(System.in);

    public Customer(String name, String eMail) {
        super(name, eMail);
    }

    void makePayment() {
        Credit_Card_Payment ccp = new Credit_Card_Payment();
        Paypal_Payment pp = new Paypal_Payment();
        UPI_Payment up = new UPI_Payment();

        System.out.println("Choose any number for services : ");
        int input = scan.nextInt();

//        int input = paymentMethod_option();

        if(input == 1) {

        } else if(input == 2) {

        } else if(input == 3) {

        } else {
            System.out.println("invalid mayment method input Please try again!");
        }
    }

    /*
    int paymentMethod_option() {
        System.out.println();
        System.out.println("Enter 1 for Credit_Card Payment : ");
        System.out.println("Enter 2 for Paypal_payment : ");
        System.out.println("Enter 3 for UPI Payment : ");

        int input = scan.nextInt();

        return input;
    }
     */

    @Override
    public void pay(double amount) {

    }

    @Override
    public void printUserDetails() {
        System.out.println(name);
        System.out.println(eMail);
        System.out.println();// amount should be print
        System.out.println();// payment method should be print
        System.out.println();// payment status
    }

}
