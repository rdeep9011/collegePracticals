//WAP to demonstrate the use of command line arguments.

package JavaPractical;

public class practical02 {
    public static void main(String[] args) {

        String[] arguments = {"Hello", "Depinder", "Singh"};

        System.out.println("Number of arguments: " + arguments.length);

        if (arguments.length == 0) {
            System.out.println("No arguments passed!");
        } else {
            System.out.println("Arguments are:");
            for (int i = 0; i < arguments.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + arguments[i]);
            }
        }
    }
}
