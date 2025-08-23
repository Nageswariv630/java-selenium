package PMSystem;
public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String id, String name, double price, String size, String material, int stockQty) {
        super(id, name, price, stockQty);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + name + ", Size: " + size + ", Material: " + material);
    }
}