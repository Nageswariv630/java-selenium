package PMSystem;
public class Furniture extends Product {
    private String material;
    private String dimensions;

    public Furniture(String id, String name, double price, String material, String dimensions, int stockQty) {
        super(id, name, price, stockQty);
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + name + ", Material: " + material + ", Size: " + dimensions);
    }
}