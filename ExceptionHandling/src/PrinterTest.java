interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultifunctionPrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class PrinterTest {
    public static void main(String[] args) {
        MultifunctionPrinter printer = new MultifunctionPrinter();
        printer.print();
        printer.scan();
    }
}

