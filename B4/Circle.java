package B4;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle 1: ");
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Area = " + c1.getArea());

        Circle c2 = new Circle();
        System.out.println("Circle 2: ");
        System.out.println("Radius = " + c2.getRadius());
        System.out.println("Area = " + c2.getArea());
    }
}
