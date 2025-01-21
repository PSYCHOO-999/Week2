import java.util.Scanner;

class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayArea() {
        System.out.println("Radius: " + radius + ", Area: " + calculateArea());
    }
}

public class Lv01_Problem02_CircleMain {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.displayArea();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle customCircle = new Circle(radius);
        customCircle.displayArea();
        scanner.close();
    }
}
