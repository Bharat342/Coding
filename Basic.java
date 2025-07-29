
class BankAccountt {
    static String bankName;

    int accountNumber;
    int balance;

    BankAccountt(int accountNumber, int deposit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    static void setBankName() {
        bankName = "PSA BANK";
    }

    void deposit() {
        balance += 5000;
    }
    void displayDetails() {
        System.out.println("bank name : " + bankName + " account number : "+
                accountNumber + " balance : "+ balance );
    }
}

public class Basic {
    public static void main(String[] args) {
        BankAccountt bt = new BankAccountt(12345, 12000);
        BankAccountt.setBankName();
        bt.deposit();
        bt.displayDetails();
    }
}
