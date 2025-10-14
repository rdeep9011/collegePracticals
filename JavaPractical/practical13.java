package JavaPractical;

// WAP to find largest value using nesting of methods

public class practical13 {

    // Method to find the largest of two numbers
    int largest(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // Method to find the largest of three numbers (nested call)
    int largestOfThree(int x, int y, int z) {
        int temp = largest(x, y); // calling another method
        return largest(temp, z);  // nested call
    }

    public static void main(String[] args) {
        practical13 obj = new practical13();

        int num1 = 25, num2 = 78, num3 = 39;

        System.out.println("Numbers are: " + num1 + ", " + num2 + ", " + num3);
        int result = obj.largestOfThree(num1, num2, num3);

        System.out.println("Largest number is: " + result);
    }
}
