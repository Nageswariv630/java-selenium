
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeys {
    public static void main(String[] args) {
        // Create an unsorted HashMap
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Banana");
        unsortedMap.put(1, "Apple");
        unsortedMap.put(4, "Date");
        unsortedMap.put(2, "Cherry");

        // Create a TreeMap from the HashMap to sort by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        // Print the sorted map
        System.out.println("Sorted Map by Keys:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

