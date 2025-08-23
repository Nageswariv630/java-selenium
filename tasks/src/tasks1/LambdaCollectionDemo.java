package tasks1;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaCollectionDemo {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Steve", "Aaron", "Charlie");

        System.out.println("✅ All Names:");
        names.forEach(name -> System.out.println(name));

        System.out.println("\n✅ Names Starting with 'A':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println(name));

        System.out.println("\n✅ Names Sorted Alphabetically:");
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        sortedNames.forEach(name -> System.out.println(name));
    }
}

