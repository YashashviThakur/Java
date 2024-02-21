
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double geRadius() {
        return radius;
    }

    public double circleArea() {
        return 3.17 * radius * radius;
    }

    public double circleCircumference() {
        return 2 * 3.17 * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7);

        System.out.println("Area of circle (in sq.m.) - " + circle.circleArea());
        System.out.println("Circumference of circle (in m.)- " + circle.circleCircumference());
    }
}