package JavaPractical;

// WAP to illustrate math functions supported by Java language

public class practical05 {
    public static void main(String[] args) {

        double num1 = 25.0;
        double num2 = 4.0;
        double num3 = -10.5;

        System.out.println("Given Numbers: num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);
        System.out.println("\n--- Java Math Functions ---");

        System.out.println("Square root of num1: " + Math.sqrt(num1));
        System.out.println("Power (num1 ^ num2): " + Math.pow(num1, num2));
        System.out.println("Absolute value of num3: " + Math.abs(num3));
        System.out.println("Maximum of num1 and num2: " + Math.max(num1, num2));
        System.out.println("Minimum of num1 and num2: " + Math.min(num1, num2));
        System.out.println("Random number between 0 and 1: " + Math.random());
        System.out.println("Ceil of 5.3: " + Math.ceil(5.3));
        System.out.println("Floor of 5.3: " + Math.floor(5.3));
        System.out.println("Round of 5.6: " + Math.round(5.6));
    }
}