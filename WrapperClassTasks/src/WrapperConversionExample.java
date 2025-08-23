public class WrapperConversionExample {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int intPrimitive = 42;
        double doublePrimitive = 3.14;
        char charPrimitive = 'A';

        // Step 2: Convert primitives to wrappers using valueOf()
        Integer intWrapper = Integer.valueOf(intPrimitive);
        Double doubleWrapper = Double.valueOf(doublePrimitive);
        Character charWrapper = Character.valueOf(charPrimitive);

        // Step 3: Convert wrappers back to primitives using xxxValue()
        int intUnboxed = intWrapper.intValue();
        double doubleUnboxed = doubleWrapper.doubleValue();
        char charUnboxed = charWrapper.charValue();

        // Step 4: Print all values
        System.out.println("Primitive to Wrapper and Back:");
        System.out.println("-------------------------------");
        System.out.println("int: " + intPrimitive + " -> Integer: " + intWrapper + " -> int: " + intUnboxed);
        System.out.println("double: " + doublePrimitive + " -> Double: " + doubleWrapper + " -> double: " + doubleUnboxed);
        System.out.println("char: " + charPrimitive + " -> Character: " + charWrapper + " -> char: " + charUnboxed);
    }
}

