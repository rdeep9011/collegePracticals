package JavaPractical;

// WAP to find the area and volume of a room using single inheritance

// Base class
class Room {
    double length;
    double breadth;

    // Constructor to initialize room dimensions
    Room(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }
}

// Derived class (Single Inheritance)
class RoomVolume extends Room {
    double height;

    // Constructor for RoomVolume that calls parent constructor
    RoomVolume(double l, double b, double h) {
        super(l, b); // call parent constructor
        height = h;
    }

    // Method to calculate volume
    double volume() {
        return length * breadth * height;
    }
}

public class practical14 {
    public static void main(String[] args) {

        RoomVolume room1 = new RoomVolume(10.5, 8.0, 12.0);

        System.out.println("Room Details:");
        System.out.println("Length: " + room1.length + " m");
        System.out.println("Breadth: " + room1.breadth + " m");
        System.out.println("Height: " + room1.height + " m");

        System.out.println("\nArea of Room: " + room1.area() + " sq.m");
        System.out.println("Volume of Room: " + room1.volume() + " cubic m");
    }
}
