import java.util.Scanner;

public class EncapsulationExmp {

    //        Encapsulation
    private float bankBalance;

    public void setBankBalance(float bankBalance) {
        if(bankBalance > 0) {
            this.bankBalance = bankBalance;
        } else {
            System.out.println("negative value is not allowed");
        }
    }

    public float getbankBalance() {
        return bankBalance;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of N :");
        int n = scan.nextInt();

        EncapsulationExmp EncpExp = new EncapsulationExmp();
        EncpExp.setBankBalance(n);
        System.out.println(EncpExp.getbankBalance());
    }
}
