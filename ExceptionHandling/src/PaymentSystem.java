
// Abstract class
abstract class PaymentMethod {
    abstract void pay(double amount);
}

// CreditCard class
class CreditCard extends PaymentMethod {
    String cardNumber;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}

// UPI class
class UPI extends PaymentMethod {
    String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }
}

// Cash class
class Cash extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " in Cash");
    }
}

// Main class
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod method1 = new CreditCard("1234567890123456");
        PaymentMethod method2 = new UPI("user@upi");
        PaymentMethod method3 = new Cash();

        method1.pay(1500.00);
        method2.pay(500.00);
        method3.pay(250.00);
    }
}

