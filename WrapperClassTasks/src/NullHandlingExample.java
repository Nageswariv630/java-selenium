import java.util.Optional;

public class NullHandlingExample {
    public static void main(String[] args) {
        // Step 1: Declare a Double and assign null
        Double balance = null;

        // Step 2: Try unboxing (will throw NullPointerException)
        try {
            double primitiveBalance = balance;  // unboxing null → NPE
            System.out.println("Balance: " + primitiveBalance);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException when unboxing null Double!");
        }

        // Step 3a: Fix using Optional
        Optional<Double> optionalBalance = Optional.ofNullable(balance);
        double safeBalance1 = optionalBalance.orElse(0.0);  // use 0.0 as default
        System.out.println("Safe balance using Optional: " + safeBalance1);

        // Step 3b: Fix using default value strategy (manual check)
        double safeBalance2 = (balance != null) ? balance : 0.0;
        System.out.println("Safe balance using default value: " + safeBalance2);
    }
}

