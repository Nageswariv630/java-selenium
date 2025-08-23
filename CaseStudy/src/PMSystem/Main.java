package PMSystem;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "Anjali Mehra");

        Product phone = new Electronics("E101", "Smartphone", 20000, "Samsung", 24, 5);
        Product tshirt = new Clothing("C202", "T-Shirt", 800, "M", "Cotton", 10);
        Product book = new Book("B301", "Java Basics", 500, "James Gosling", "Education", 8);
        Product chair = new Furniture("F401", "Chair", 3500, "Wood", "45x45x90cm", 3);

        Order order = new Order("O1001", customer);
        order.addProduct(phone);
        order.addProduct(tshirt);
        order.addProduct(book);
        order.addProduct(chair);

        order.showOrderDetails();

        Discount discount = amount -> amount * 0.85; // 15% discount
        double discountedTotal = discount.apply(order.getTotalAmount());
        System.out.println("\nDiscounted Total: ₹" + discountedTotal);

        Payment payment = new CashOnDelivery();
        payment.processPayment(discountedTotal);

        order.cancelOrder();
        order.showOrderDetails();
    }
}
