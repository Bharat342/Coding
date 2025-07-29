import java.util.Scanner;

class BankAccount1 {
    private float balance;

    public void setBalance(float balance) {
        if(balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Can't be modified it is an negative value :");
        }
    }

    public float getBalance() {
        return balance;
    }
}

public class EncapsulationProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit :");
        int n = scan.nextInt();

        BankAccount1 ba = new BankAccount1();

        ba.setBalance(n);
        System.out.println("Your Bank Balance is :" + ba.getBalance());
    }
}
