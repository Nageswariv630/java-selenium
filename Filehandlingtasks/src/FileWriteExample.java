import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String fileName = "info.txt";

        try {
            // Step 1: Write initial content (overwrite if file exists)
            FileWriter writer = new FileWriter(fileName);
            writer.write("Java I/O is powerful!\n");
            writer.close();

            // Step 2: Append additional content
            FileWriter appendWriter = new FileWriter(fileName, true); // true = append mode
            appendWriter.write("Learn Java step-by-step");
            appendWriter.close();

            System.out.println("Content written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

