package JavaPractical;

import java.util.Arrays; // for Arrays.sort()

// WAP to sort a list of numbers

public class practical16 {
    public static void main(String[] args) {

        int numbers[] = {45, 12, 89, 33, 27, 66};

        System.out.println("Original List: " + Arrays.toString(numbers));

        // Sorting using built-in function
        Arrays.sort(numbers);

        System.out.println("Sorted List (Ascending Order): " + Arrays.toString(numbers));
    }
}
