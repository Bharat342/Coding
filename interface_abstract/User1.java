package interface_abstract;

public class User1 extends Payment{
    @Override
    public void payUsing() {
        netBankPay();
    }
}
