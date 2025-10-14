package JavaPractical;

import java.util.Arrays;

// WAP to alphabetically order a list of strings

public class practical17 {
    public static void main(String[] args) {

        String names[] = {"Simran", "Depinder", "Aman", "Karan", "Harpreet"};

        System.out.println("Original List: " + Arrays.toString(names));

        // Sorting alphabetically (A–Z)
        Arrays.sort(names);
        System.out.println("Sorted List (A–Z): " + Arrays.toString(names));

        // Sorting in reverse alphabetical order (Z–A)
        String reverse[] = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reverse[i] = names[names.length - 1 - i];
        }
        System.out.println("Sorted List (Z–A): " + Arrays.toString(reverse));
    }
}
