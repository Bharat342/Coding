
/*
bank name
account number
account holder name
password
balance
deposit

create account
check balance
deposit 
deactivate account -> pending
*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Oops_Bank_MiniProject {
    static String bankName;
    private int accNum;
    private String accHolName;
    private String password;
    private float balance;
    private float deposit;


    static {
        bankName = "PSA Bank!..";
    }

    public Oops_Bank_MiniProject() {

    }

    public Oops_Bank_MiniProject(int accNum, String accHolName, String password, float balance, float deposit) {
        this.accNum = accNum;
        this.accHolName = accHolName;
        this.password = password;
        this.balance = balance;
        this.deposit = deposit;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }
    public int getAccNum() {
        return accNum;
    }

    public void setAccHolName(String accHolName) {
        this.accHolName = accHolName;
    }
    public String getAccHolName() {
        return accHolName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }
    public float getDeposit() {
        return deposit;
    }

    Scanner scan = new Scanner(System.in);

    void createAccount() {
        System.out.println("# PSA ACCOUNT CREATION #");
        System.out.println();

        System.out.println("Give an 4 to 6 digits Account No :");
        setAccNum(scan.nextInt());

        System.out.println("Enter Your Name :");
        setAccHolName(scan.next());

        System.out.println("Create a Strong Password :");
        setPassword(scan.next());

        System.out.println("Enter the Amount you want to deposit");
        setDeposit(scan.nextFloat());

        System.out.println("THANK YOU FOR CREATING ACCOUNT..");
    }

    void checkBalance() {
        System.out.println("Enter Your Accout No :");
        int acNo = scan.nextInt();
        System.out.println("Enter Your Password :");
        String pwd = scan.next();

        if(acNo == getAccNum() && pwd.equals(getPassword())) {
//            System.out.println("Your Account Balance is :" + getBalance());
            System.out.println("Your Account Balance is :" + getDeposit());
        } else {
            System.out.println("invalid Credential Try Again later!");
        }
    }

    void deposit() {
        System.out.println("Enter Your Accout No :");
        int acNo = scan.nextInt();
        System.out.println("Enter Your Password :");
        String pwd = scan.nextLine();

        if(acNo == getAccNum() && pwd.equals(getPassword())) {
            System.out.println("Enter the Amount you want to deposit : ");
            setDeposit(scan.nextFloat());
            setBalance(getDeposit() + getBalance());
            System.out.println("your updated Balance is : " + getBalance());
        } else {
            System.out.println("invalid Credential Try Again later!");
        }
    }
}

class Launch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("### Welcome to PSA Bank ###");
        System.out.println();
        System.out.println("Press No. to Choice Services.");
        System.out.println();
        System.out.println("1. Create an Account.");
        System.out.println("2. Account Details.");
        System.out.println("3. Check Account Balance.");
        System.out.println("4. Deposit Money.");
        System.out.println("5. Deactivite Account.");
        System.out.println();
        System.out.println("0. Exit.");

        System.out.println("Enter Your input :");
        int a = scan.nextInt();
        Launch launch = new Launch();
        launch.executeSelection(a);

        System.out.println("invalid input Try again!");
        System.exit(0);
    }

    void executeSelection(int input) {
        Oops_Bank_MiniProject bank = new Oops_Bank_MiniProject();
        while(input  >=0 && input <= 5) {
            if(input == 1) {
                bank.createAccount();
                input = 3;
            } else if(input == 2) {

            } else if(input == 3) {
                bank.checkBalance();
                System.exit(0);
            } else if(input == 4) {
                bank.deposit();
            } else {

            }
        }
    }
}











