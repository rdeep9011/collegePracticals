package JavaPractical;

// WAP to print multiplication table using 'do while loop'

public class practical08 {
    public static void main(String[] args) {

        int num = 5;  
        int i = 1;

        System.out.println("Multiplication Table of " + num + ":");

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}
