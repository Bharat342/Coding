package bank_mini_project;

import java.util.Scanner;

public class Bank extends Bank_Details {

    Scanner scan = new Scanner(System.in);

    private String name;
    private int account_No;
    private String password;
//    private float account_Balance;
    float account_Balance = 10000;
    public Bank(String name, int account_No, String password) {
        this.name = name;
        this.account_No = account_No;
        this.password = password;
    }

    public Bank() {

    }

    public String getName() {
        return name;
    }

    public int getAccount_No() {
        return account_No;
    }

    public String getPassword() {
        return password;
    }

    public float getAccount_Balance() {
        return account_Balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount_No(int account_No) {
        this.account_No = account_No;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccount_Balance(float  account_Balance) {
        this.account_Balance = account_Balance;
    }

    public boolean checkUser() {
        System.out.println();
        System.out.println("Enter your Account No :");
        int a = scan.nextInt();

        System.out.println("Enter your password :");
        String pwd = scan.next();

        if(a == getAccount_No() && pwd.equals(getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void create_Account() {
        System.out.println();
        System.out.println("WELCOME TO CAMLIN BANK");

        System.out.println("Enter your Name : ");
        setName(scan.next());

        System.out.println("Create an Account No : ");
        setAccount_No(scan.nextInt());

        System.out.println("Create an Password : ");
        setPassword(scan.next());

        System.out.println("Account Created Successfully ");
        Driver.services();
    }

    public void account_Details() {

        if(checkUser()) {
            System.out.println("Account Holder Name :" + getName());
            System.out.println("Account No :" + getAccount_No());
            System.out.println("Account Balance :" + getAccount_Balance());
        } else {
            System.out.println("invalid input please try again later!");
        }

    }

    @Override
    public void deposit_Money() {
        if(checkUser()) {
            System.out.println("Enter the amount you want to deposit :");
            setAccount_Balance(getAccount_Balance() + scan.nextFloat());
            System.out.println("Money Deposit Successful!");
            System.out.println("Updated Account Balance : " + getAccount_Balance());
        }
    }

    @Override
    public void check_Balance() {
        if(checkUser()) {
            System.out.println("Your Account Balance :" + getAccount_Balance());
        }else {
            System.out.println("invalid input please try again later :");
        }
    }

    @Override
    public void withdraw_money() {
        if(checkUser()) {
            System.out.println("Enter the Amount you want to withdraw :");
            float amount = scan.nextInt();
            if(amount >= getAccount_Balance()) {
                setAccount_Balance(getAccount_Balance() - scan.nextFloat());
                System.out.println("Money Withdraw Successful!");
                System.out.println("Updated Account Balance : " + getAccount_Balance());
            }else {
                System.out.println("invalid input try again!");
            }
        }else {
            System.out.println("invalid input try again later..");
        }
    }
}
