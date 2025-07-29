package bank_mini_project;

public abstract class Bank_Details implements Bank_Interface {
    String bank_Name = "CAMLIN BANK";
    String bank_IFSC_No = "12345";
    String bank_Address = "Bangalore";

    public void bank_Details() {
        System.out.println("Bank Name : " + bank_Name);
        System.out.println("Bank IFSC No : " + bank_IFSC_No);
        System.out.println("Bank Address : " + bank_Address);
    }
}
