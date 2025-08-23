public class StringParsingExample {
    public static void main(String[] args) {
        // Step 1: Declare string inputs
        String intString = "123";
        String doubleString = "45.67";
        String booleanString = "true";

        // Step 2: Parse strings into primitives
        int parsedInt = Integer.parseInt(intString);
        double parsedDouble = Double.parseDouble(doubleString);
        boolean parsedBoolean = Boolean.parseBoolean(booleanString);

        // Step 3: Print values and their types
        System.out.println("Parsed Values:");
        System.out.println("--------------");
        System.out.println("String: \"" + intString + "\" -> int: " + parsedInt + " (" + ((Object)parsedInt).getClass().getSimpleName() + ")");
        System.out.println("String: \"" + doubleString + "\" -> double: " + parsedDouble + " (" + ((Object)parsedDouble).getClass().getSimpleName() + ")");
        System.out.println("String: \"" + booleanString + "\" -> boolean: " + parsedBoolean + " (" + ((Object)parsedBoolean).getClass().getSimpleName() + ")");
    }
}

