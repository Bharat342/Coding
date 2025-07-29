package exception.user_define_exception.without_user_define_exception;

import java.util.Scanner;

public class ATM {
    int card_no = 1234;
    int password = 1111;

    int cdNo, pwd;

    void acceptInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Card No : ");
        cdNo = scan.nextInt();

        System.out.println("Enter the password : ");
        pwd = scan.nextInt();
    }

    void verify() {
        if(card_no == cdNo && password == pwd) {
            System.out.println("Welcome!");
        } else {
            System.out.println("invalid input!");
        }
    }
}
