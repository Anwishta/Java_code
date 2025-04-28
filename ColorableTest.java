interface Colorable {
    // Abstract method to specify how to color
    void howToColor();
}

// Abstract class representing a geometric object
abstract class GeometricObject {
    // Abstract method to calculate the area
    public abstract double getArea();
}

// Class representing a square that extends GeometricObject and implements Colorable
class Square extends GeometricObject implements Colorable {
    private double side;

    // Constructor to initialize the side of the square
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area of the square
    @Override
    public double getArea() {
        return side * side;
    }

    // Implementation of the howToColor method from Colorable
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}

// A simple class to demonstrate non-colorable geometric objects
class Circle extends GeometricObject {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class ColorableTest {
    public static void main(String[] args) {
        // Create an array of GeometricObjects
        GeometricObject[] objects = new GeometricObject[5];

        // Initialize the array with Squares and Circles
        objects[0] = new Square(4);
        objects[1] = new Circle(3);
        objects[2] = new Square(5);
        objects[3] = new Circle(2);
        objects[4] = new Square(6);

        // Iterate through the objects array
        for (GeometricObject obj : objects) {
            // Display the area of the object
            System.out.println("Area: " + obj.getArea());

            // Check if the object is an instance of Colorable and invoke howToColor if true
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}
 