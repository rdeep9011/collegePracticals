package JavaPractical;

// WAP to illustrate increment operators

public class practical04 {
    public static void main(String[] args) {
        
        int a = 5;

        System.out.println("Initial value of a: " + a);

        // Pre-increment
        int preIncrement = ++a; 
        System.out.println("After pre-increment (++a): " + preIncrement);

        
        a = 5;

        // Post-increment
        int postIncrement = a++; 
        System.out.println("After post-increment (a++): " + postIncrement);
        System.out.println("Value of a after post-increment: " + a);
    }
}
