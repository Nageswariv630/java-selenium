package PMSystem;
import java.util.*;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private boolean isCancelled;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
        this.isCancelled = false;
    }

    public void addProduct(Product product) {
        if (isCancelled) {
            System.out.println("Cannot add product. Order is cancelled.");
            return;
        }

        if (product.reduceStock(1)) {
            products.add(product);
            totalAmount += product.getPrice();
            System.out.println("Added to order: " + product.name);
        } else {
            System.out.println("Failed to add product due to insufficient stock.");
        }
    }

    public void showOrderDetails() {
        System.out.println("\n🔹 Order Details");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());

        if (products.isEmpty()) {
            System.out.println("No products in the order.");
        } else {
            for (Product product : products) {
                product.displayDetails();
            }
        }

        System.out.println("Total Amount: ₹" + totalAmount);
        System.out.println("Status: " + (isCancelled ? "Cancelled" : "Active"));
    }

    public void cancelOrder() {
        if (!isCancelled) {
            isCancelled = true;
            System.out.println("✅ Order " + orderId + " has been cancelled.");

            for (Product p : products) {
                p.updateStock(1);
            }
        } else {
            System.out.println("⚠️ Order " + orderId + " is already cancelled.");
        }
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}