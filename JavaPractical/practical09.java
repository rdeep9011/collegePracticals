package JavaPractical;

// WAP to compute the 'power of 2'

public class practical09 {
    public static void main(String[] args) {

        int exponent = 8;
        int base = 2;
        int result = 1;
        int i = 1;

        System.out.println("Computing " + base + " raised to the power " + exponent);

        // Using while loop
        while (i <= exponent) {
            result = result * base;
            i++;
        }

        System.out.println(base + " ^ " + exponent + " = " + result);
    }
}
