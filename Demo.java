class Shape {
    double get_area(double r) {
        return Math.PI * r * r; // Area of a circle
    }
    double get_area(double side_1, double side_2) {
        return 0.5 * side_1 * side_2; // Area of a right triangle
    }
    double get_area(double side_1, double side_2, double side_3) {
        double s = (side_1 + side_2 + side_3) / 2;
        return Math.sqrt(s * (s - side_1) * (s - side_2) * (s - side_3)); // Area of a triangle
    }
}

public class Demo {
    public static void main(String[] args) {
        Shape shape = new Shape(); 
        double circleArea = shape.get_area(5.3);
        System.out.println("The area of the circle is: " + circleArea);

        double triangleArea = shape.get_area(5, 9, 12);
        System.out.println("The area of the triangle is: " + triangleArea);
    }
}