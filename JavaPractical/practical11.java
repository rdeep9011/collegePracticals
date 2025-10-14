package JavaPractical;

// WAP to find area using constructors

class Rectangle {
    double length, breadth;

    // Constructor to initialize values
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }
}

public class practical11 {
    public static void main(String[] args) {

        // Create object and pass values through constructor
        Rectangle rect1 = new Rectangle(10.5, 5.2);
        Rectangle rect2 = new Rectangle(8.0, 6.0);

        System.out.println("Area of Rectangle 1: " + rect1.area());
        System.out.println("Area of Rectangle 2: " + rect2.area());
    }
}

