package exception.user_define_exception.with_user_define_exception;

import java.util.Scanner;

public class ATM {
    int acc_No = 1234;
    int password = 1111;
    int acNo, pwd;

    void accept_Input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter account no : ");
        acNo = scan.nextInt();

        System.out.println("Enter password : ");
        pwd = scan.nextInt();
    }

    void verify() throws Exception {
        if(acc_No == acNo && password == pwd) {
            System.out.println("Welcome!");
        }else {
            InvalidUserInputException iue = new InvalidUserInputException();
            System.out.println(iue.getMessage());
            throw iue;
        }
    }
}
