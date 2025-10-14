package JavaPractical;

import java.util.Scanner;

/*
WAP to handle exceptions using try and catch blocks
*/

public class practical25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Take two numbers from user
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Perform division (can throw ArithmeticException)
            int result = num1 / num2;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }

        System.out.println("Program continues after exception handling...");
    }
}
