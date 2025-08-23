package PMSystem;

public class UpiPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}




