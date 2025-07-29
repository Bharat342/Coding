package smart_payment_system;

abstract public class User implements PaymentMethod {
    protected String name;
    protected String eMail;

    User(String name, String eMail) {
        this.name = name;
        this.eMail = eMail;
    }

    abstract public void printUserDetails();
}
