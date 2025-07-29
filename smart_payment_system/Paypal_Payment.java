package smart_payment_system;

public class Paypal_Payment {
    PaymentMethod pm = (amount) -> {
        System.out.println("paypal_Payment : " + amount);
    };
}
