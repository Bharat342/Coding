package interface_abstract;

abstract public class Payment implements Example{
    void upiPay() {
        System.out.println("Paying Through upi");
    }

    void netBankPay() {
        System.out.println("Paying Through netbanking");
    }

    @Override
    public abstract void payUsing();
}
