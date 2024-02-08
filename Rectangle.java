
public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double rectangleArea() {
        return width * height;
    }

    public double rectanglePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 5);

        System.out.println("Area of rectangle (in sq.m.) - " + rectangle.rectangleArea());
        System.out.println("Perimeter of rectangle (in m.)- " + rectangle.rectanglePerimeter());
    }
}