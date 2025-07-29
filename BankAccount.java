
import java.util.Scanner;

abstract class BankAccount {
    static String bankName;
    static String ifscCode;

     static {
        bankName = "-PSA Bank-";
        ifscCode = "PSA00123";
    }

    abstract void checkDetails(int a, String b);
    abstract void checkBalance(int a, String b);
    abstract void customerCareService();
}

class Customer extends BankAccount {

    private int accountNo;
    private String AccHolName;
    private float balance;
    private String password;

    public Customer() {

    }

    public Customer(int accountNo, String accHolName, float balance, String password) {
        this.accountNo = accountNo;
        AccHolName = accHolName;
        this.balance = balance;
        this.password = password;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccHolName() {
        return AccHolName;
    }

    public void setAccHolName(String accHolName) {
        AccHolName = accHolName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void checkDetails(int inputAccNo, String inputPwd) {
        if(getAccountNo() == inputAccNo && getPassword().equals(inputPwd)) {
            System.out.println("xyz...");
        } else {
            System.out.println("invalid Input!");
        }
    }

    void checkBalance(int inputAccNo, String inputPwd) {
        if(getAccountNo() == inputAccNo && getPassword().equals(inputPwd)) {
            System.out.println(getBalance());
        } else {
            System.out.println("invalid Input!");
        }
    }

    void customerCareService() {
        System.out.println("Not Eligible for Customer Care service..");
    }
}

class PremiumCustomer extends Customer {
    private int premiumId;

    public PremiumCustomer() {

    }

    public PremiumCustomer(int accountNo, String accHolName, float balance, String password, int premiumId) {
        super(accountNo, accHolName, balance, password);
        this.premiumId = premiumId;
    }

    public int getPremiumId() {
        return premiumId;
    }

    public void setPremiumId(int premiumId) {
        this.premiumId = premiumId;
    }

    void customerCareService() {
        System.out.println("Eligible for Customer Care service..");
    }
}

class Bank {
    void permit(BankAccount bankAccount) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Account No :");
        int accNo = scan.nextInt();

        System.out.println("Enter Your Password : ");
        String pwd = scan.next();

        bankAccount.checkDetails(accNo, pwd);
        bankAccount.checkBalance(accNo, pwd);
        bankAccount.customerCareService();
    }
}

class Driver {

    Scanner scan = new Scanner(System.in);
    Bank bank = new Bank();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Driver driver = new Driver();

       while(scan.nextInt() == 1) {
           System.out.println("---WELCOME TO XYZ BANK ---");
           System.out.println();

           System.out.println("Enter No to choose Services..");
           System.out.println();

           System.out.println("1. Create an Account..");
           System.out.println("2. Create an Premium Account..");
           System.out.println("3. View Account Details..");
       }



        int input = scan.nextInt();

        while(input > 0 && input <= 2) {
            if(input == 1) {
                driver.createAccount();
            } else if(input == 2) {
                driver.createPremiumAccount();
            }
        }
    }

    void createAccount() {
        System.out.println("Set a Account No :");
        int a = scan.nextInt();
        System.out.println();

        System.out.println("Set an Account Holder Name :");
        String b = scan.next();
        System.out.println();

        System.out.println("Enter the Amount you want to deposit :");
        float c = scan.nextFloat();
        System.out.println();

        System.out.println("Set a Strong Password :");
        String d = scan.next();
        System.out.println();

        Customer customer = new Customer(a, b, c, d);
        bank.permit(customer);
    }

    void createPremiumAccount() {
        System.out.println("Set a Account No :");
        int e = scan.nextInt();
        System.out.println();

        System.out.println("Set an Account Holder Name :");
        String f = scan.next();
        System.out.println();

        System.out.println("Enter the Amount you want to deposit :");
        float g = scan.nextFloat();
        System.out.println();

        System.out.println("Set a Strong Password :");
        String h = scan.next();
        System.out.println();

        System.out.println("Set a Premium Id :");
        int i = scan.nextInt();
        System.out.println();

        PremiumCustomer premiumCustomer = new PremiumCustomer(e, f, g, h, i);
        bank.permit(premiumCustomer);
    }
}
