package bank_mini_project;

import java.util.Scanner;

public class ATM {

    int cardNo;
    int password;

    Scanner scan = new Scanner(System.in);
    void takeInput() {
        System.out.println("Enter you Card No : ");
        cardNo = scan.nextInt();

        System.out.println("Enter your password : ");
        password = scan.nextInt();
    }

     void verify() throws Exception {
         if(cardNo == 1234 && password == 1111) {
             System.out.println("Welcome");
         } else {
             UserDefineException ude = new UserDefineException();
             System.out.println(ude.getMessage());
             throw ude;
         }
    }

    void initialise() {
        try {
            takeInput();
            verify();
        }catch(Exception e) {
            try {
                takeInput();
                verify();
            }catch(Exception f) {
                try {
                    takeInput();
                    verify();
                }catch(Exception g) {
                    System.out.println("your card is blocked!");
                }
            }
        }
    }

}
