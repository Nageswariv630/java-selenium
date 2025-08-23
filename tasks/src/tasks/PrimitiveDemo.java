package tasks;

public class PrimitiveDemo {

    // Instance variables (uninitialized - default values will be printed)
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {
        // Local variables (must be initialized before use)
        byte b = 10;
        short s = 200;
        int i = 1000;
        long l = 123456789L;
        float f = 3.14f;
        double d = 99.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("=== Local Primitive Variables (Initialized) ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Create object to check default values of instance variables
        PrimitiveDemo obj = new PrimitiveDemo();

        System.out.println("\n=== Default Values of Instance Variables ===");
        System.out.println("byte: " + obj.defaultByte);
        System.out.println("short: " + obj.defaultShort);
        System.out.println("int: " + obj.defaultInt);
        System.out.println("long: " + obj.defaultLong);
        System.out.println("float: " + obj.defaultFloat);
        System.out.println("double: " + obj.defaultDouble);
        System.out.println("char: [" + obj.defaultChar + "]"); // Empty char
        System.out.println("boolean: " + obj.defaultBoolean);
    }
}
