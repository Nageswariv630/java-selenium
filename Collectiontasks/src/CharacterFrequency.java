import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            // If character already exists, increment its count
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                freqMap.put(c, 1);
            }
        }

        // Print the frequency map
        System.out.println(freqMap);
    }
}
