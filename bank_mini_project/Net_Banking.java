package bank_mini_project;
import java.util.*;

public class Net_Banking {
    int pinNumber = 862001;
    public int destUpi;
    public float amount;
    public String mesg;

    Scanner sc = new Scanner(System.in);
     Bank bank= new Bank();

    void upiPay() {
        System.out.println("Welcome to Bharat NetBanking");
        System.out.println("Pay Through UPI ");
        destUpi = sc.nextInt();

        System.out.println("Enter the Amount");
        amount = sc.nextFloat();
    }

    void checkUpi() throws Exception {
        if(bank.getAccount_Balance() >= amount){
            System.out.println("Enter the pin");
            if(pinNumber == sc.nextInt()) {
                System.out.println("Money Transferred Successfully");
                System.out.println("Your Remaining Balance is :" + (bank.getAccount_Balance()-amount));
            }else {
                UserDefineException userDefineException = new UserDefineException();
                throw userDefineException;
            }

        } else {
            System.out.println("Insufficient Account Balance");
        }
    }
    void initializeUpiPay() {
       try {
           upiPay();
           checkUpi();
       } catch(Exception e) {
           try {
               checkUpi();
           } catch (Exception f){
               try {
                   checkUpi();
               } catch (Exception g) {
                   System.out.println("Pin Blocked");
               }
           }
       }
    }
}
