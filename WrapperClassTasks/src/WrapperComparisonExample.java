public class WrapperComparisonExample {
    public static void main(String[] args) {
        // Case 1: Autoboxing (within cache range -128 to 127)
        Integer a = 100;
        Integer b = 100;

        // Case 2: Explicit object creation (always creates new object)
        Integer x = new Integer(100);
        Integer y = new Integer(100);

        System.out.println("Autoboxed Comparison:");
        System.out.println("a == b      : " + (a == b));        // true (cached)
        System.out.println("a.equals(b) : " + a.equals(b));     // true (same value)

        System.out.println("\nExplicit new Integer Comparison:");
        System.out.println("x == y      : " + (x == y));        // false (different objects)
        System.out.println("x.equals(y) : " + x.equals(y));     // true (same value)

        System.out.println("\nMixed Comparison:");
        System.out.println("a == x      : " + (a == x));        // false (different references)
        System.out.println("a.equals(x) : " + a.equals(x));     // true (same value)
    }
}
