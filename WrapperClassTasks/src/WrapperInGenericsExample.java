// Generic class definition
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class WrapperInGenericsExample {
    public static void main(String[] args) {
        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(123);  // Autoboxing from int to Integer
        Integer intValue = intBox.getValue();
        System.out.println("Integer value from intBox: " + intValue);

        // Box for Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(45.67);  // Autoboxing from double to Double
        Double doubleValue = doubleBox.getValue();
        System.out.println("Double value from doubleBox: " + doubleValue);

        // Optional: print types
        System.out.println("\nTypes:");
        System.out.println("intBox holds: " + intValue.getClass().getSimpleName());
        System.out.println("doubleBox holds: " + doubleValue.getClass().getSimpleName());
    }
}

