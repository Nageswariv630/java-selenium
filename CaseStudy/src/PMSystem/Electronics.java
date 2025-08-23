package PMSystem;
public class Electronics extends Product {
    private String brand;
    private int warrantyInMonths;

    public Electronics(String id, String name, double price, String brand, int warrantyInMonths, int stockQty) {
        super(id, name, price, stockQty);
        this.brand = brand;
        this.warrantyInMonths = warrantyInMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + name + ", Brand: " + brand + ", Warranty: " + warrantyInMonths + " months");
    }
}