package PMSystem;

public class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card.");
    }
}
