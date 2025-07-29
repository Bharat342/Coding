package interface_abstract;

public class User2 extends Payment {
    @Override
    public void payUsing() {
        upiPay();
    }
}
