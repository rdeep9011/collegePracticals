package JavaPractical;

// WAP to illustrate the use of method overriding

// Parent class
class Shape {
    void area() {
        System.out.println("Area cannot be defined for generic shape.");
    }
}

// Child class 1
class Rectangle extends Shape {
    void area() {
        double length = 10.0, breadth = 5.0;
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

// Child class 2
class Circle extends Shape {
    void area() {
        double radius = 7.0;
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class practical15 {
    public static void main(String[] args) {

        Shape s; // reference variable of parent class

        s = new Shape();
        s.area();  // calls Shape's version

        s = new Rectangle();
        s.area();  // calls Rectangle's overridden version

        s = new Circle();
        s.area();  // calls Circle's overridden version
    }
}
