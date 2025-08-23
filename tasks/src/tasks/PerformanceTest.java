package tasks;

public class PerformanceTest {
    public static void main(String[] args) {
        int iterations = 100_000;
        String appendStr = "a";

        // Test String (using +=)
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += appendStr;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String (+=) time: " + (endTime - startTime) + " ms");

        // Test StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendStr);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer append time: " + (endTime - startTime) + " ms");

        // Test StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendStr);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder append time: " + (endTime - startTime) + " ms");
    }
}

