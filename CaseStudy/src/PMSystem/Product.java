package PMSystem;
public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int stockQty;

    public Product(String id, String name, double price, int stockQty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQty = stockQty;
    }

    public boolean reduceStock(int quantity) {
        if (stockQty >= quantity) {
            stockQty -= quantity;
            return true;
        }
        return false;
    }

    public void updateStock(int quantity) {
        stockQty += quantity;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayDetails();
}