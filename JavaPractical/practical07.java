package JavaPractical;

// WAP to demonstrate 'else if ladder'

public class practical07 {
    public static void main(String[] args) {

        int marks = 78;

        System.out.println("Marks obtained: " + marks);
        System.out.print("Grade: ");

        if (marks >= 90) {
            System.out.println("A+");
        } 
        else if (marks >= 80) {
            System.out.println("A");
        } 
        else if (marks >= 70) {
            System.out.println("B");
        } 
        else if (marks >= 60) {
            System.out.println("C");
        } 
        else if (marks >= 50) {
            System.out.println("D");
        } 
        else {
            System.out.println("Fail");
        }
    }
}
