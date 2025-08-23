import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Original list with duplicates
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("Java");
        languages.add("Python");

        // Remove duplicates using a Set
        Set<String> uniqueLanguages = new HashSet<>(languages);

        // Convert back to a List if needed
        List<String> resultList = new ArrayList<>(uniqueLanguages);

        // Print the list without duplicates
        System.out.println(resultList);
    }
}

