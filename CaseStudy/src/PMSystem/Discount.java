package PMSystem;


@FunctionalInterface
public interface Discount {
    double apply(double totalAmount);
}

