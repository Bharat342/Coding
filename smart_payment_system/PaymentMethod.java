package smart_payment_system;

@FunctionalInterface
public interface PaymentMethod {
    void pay(double amount);
}

