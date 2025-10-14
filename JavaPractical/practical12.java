package JavaPractical;

// WAP to illustrate application of classes and objects

class Student {
    // Data members (variables)
    String name;
    int age;
    int marks;

    // Method to set student details
    void setData(String n, int a, int m) {
        name = n;
        age = a;
        marks = m;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class practical12 {
    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();
        s1.setData("Depinder Singh", 20, 85);

        // Creating second object
        Student s2 = new Student();
        s2.setData("Messi", 19, 90);

        // Displaying data
        System.out.println("Student Details:\n");
        s1.display();
        s2.display();
    }
}