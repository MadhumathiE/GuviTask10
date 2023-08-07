package GuviTask10;


public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0; // Default radius if not specified
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(); // Using no-argument constructor
        System.out.println("Circle 1 - Radius: " + circle1.radius);
        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

        Circle circle2 = new Circle(3.5); // Using two-argument constructor
        System.out.println("Circle 2 - Radius: " + circle2.radius);
        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());
    }
}