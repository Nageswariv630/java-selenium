package PMSystem;

public class CashOnDelivery implements Payment {
    public void processPayment(double amount) {
        System.out.println("Cash on Delivery selected. Amount: ₹" + amount);
    }
}