import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Step 1: Input temperature strings
        String[] tempStrings = { "36", "38", "40" };

        // Step 2: Convert to integers (Celsius) using Integer.parseInt()
        ArrayList<Integer> celsiusList = new ArrayList<>();
        for (String temp : tempStrings) {
            int celsius = Integer.parseInt(temp); // parsing from String to int
            celsiusList.add(celsius);             // autoboxing to Integer
        }

        // Step 3: Convert Celsius to Fahrenheit and store in ArrayList<Double>
        ArrayList<Double> fahrenheitList = new ArrayList<>();
        for (int celsius : celsiusList) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            fahrenheitList.add(fahrenheit); // autoboxing to Double
        }

        // Step 4: Print both Celsius and Fahrenheit values
        System.out.println("Celsius to Fahrenheit Conversion:");
        System.out.println("---------------------------------");
        for (int i = 0; i < celsiusList.size(); i++) {
            System.out.println("Celsius: " + celsiusList.get(i) +
                               "°C  ->  Fahrenheit: " + String.format("%.2f", fahrenheitList.get(i)) + "°F");
        }
    }
}

