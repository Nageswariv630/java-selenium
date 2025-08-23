package tasks;

public class task11 {
    public static void main(String[] args) {
        // Create StringBuffer and append a sentence
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World!");

        System.out.println("After append: " + sb);

        // Insert a word at index 6 (before "World")
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);

        // Delete the word "Beautiful " (from index 6 to 16)
        sb.delete(6, 16);
        System.out.println("After delete: " + sb);
    }
}

