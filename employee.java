import java.util.Scanner;

class Shape {
    
   
    double area(double radius) {
        return Math.PI * radius * radius;  // Area = π * r^2
    }

    // Method to calculate area of a rectangle (overloaded)
    double area(double length, double width) {
        return length * width;  // Area = length * width
    }

    // Method to calculate area of a triangle (overloaded)
    double area(int base, double height) {
        return 0.5 * base * height;  // Area = 1/2 * base * height
    }
}

public class ShapeCalc {  // Ensure class name matches file name (ShapeCalc.java)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        
        // Circle area calculation
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of the circle: " + shape.area(radius));
        
        // Rectangle area calculation
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Area of the rectangle: " + shape.area(length, width));

        // Triangle area calculation
        System.out.print("Enter the base of the triangle: ");
        int base = sc.nextInt();  // Changing to int to distinguish from the rectangle
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of the triangle: " + shape.area(base, height));
        
        sc.close();  // Closing scanner to release resources
    }
}
