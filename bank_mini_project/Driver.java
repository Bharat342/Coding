package bank_mini_project;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();
        ATM atm = new ATM();
        Net_Banking netBanking = new Net_Banking();

        System.out.println();
        System.out.println("<-- Welcome to CAMLIN BANK -->");
        System.out.println("Enter number to choose Services : ");

        System.out.println("Create Account : 1");
        System.out.println("Already Have an Account : 2");
        System.out.println("Visit ATM : 3");
        System.out.println("Visit NetBanking : 4");

//        if(scan.nextInt() == 1) {
//            bank.create_Account();
//        } else if(scan.nextInt() == 2) {
//            services();
//        } else if(scan.nextInt() == 3) {
//            atm.initialise();
//        } else if(scan.nextInt() == 4) {
//            netBanking.initializeUpiPay();
//        }
//        atm.initialise();
        netBanking.initializeUpiPay();
    }

    public static void services() {
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);
       if(bank.checkUser()) {
           System.out.println();
           System.out.println("Check Account Details : 1");
           System.out.println("Check Account Balance : 2");
           System.out.println("Deposit Money : 3");
           System.out.println("Withdraw Money : 4");
           if(scan.nextInt() == 1) {
               bank.account_Details();
           }else if(scan.nextInt() == 2) {
               bank.getAccount_Balance();
           }else if(scan.nextInt() == 3) {
               bank.deposit_Money();
           }else if(scan.nextInt() ==4) {
               bank.withdraw_money();
           } else {
               System.out.println("Please Choose valid Number!");
           }
       }else {
           System.out.println("invalid input please try again later!");
       }
    }
}
