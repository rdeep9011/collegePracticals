package JavaPractical;

// WAP to print a pattern using continue or break statement

public class practical10 {
    public static void main(String[] args) {

        int rows = 7; // total rows for pattern

        System.out.println("Pattern using 'continue' and 'break' statements:\n");

        for (int i = 1; i <= rows; i++) {

            // Skip printing the 3rd line
            if (i == 3) {
                System.out.println("(Skipped row " + i + " using continue)");
                continue; // skips rest of loop for i=3
            }

            // Stop the loop completely at 5th row
            if (i == 6) {
                System.out.println("(Stopped at row " + i + " using break)");
                break;
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // new line
        }
    }
}
