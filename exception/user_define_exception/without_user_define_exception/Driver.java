package exception.user_define_exception.without_user_define_exception;

public class Driver {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.acceptInput();
        atm.verify();
    }
}
