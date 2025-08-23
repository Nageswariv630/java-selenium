import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountExample {
    public static void main(String[] args) {
        String fileName = "info.txt";
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as delimiter
                String[] words = line.trim().split("\\s+");
                
                // Skip empty lines
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            reader.close();
            System.out.println("Total words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
