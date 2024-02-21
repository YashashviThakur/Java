
abstract class CalculateShape {
        public static void main(String[] args) {

            Rectangle rectangle = new Rectangle(5.0, 8.0);
            Circle circle = new Circle(3.5);
            Triangle triangle = new Triangle(4.0, 5.0, 6.0);
    
            System.out.println("Area of Rectangle : " + rectangle.rectangleArea() + ", Perimeter of Rectangle - " + rectangle.rectanglePerimeter());
            System.out.println("Area of Circle - " + circle.circleArea() + ", Circumference of Circle - " + circle.circleCircumference());
            System.out.println("Area of Triangle" + triangle.TriangleArea() + ", Perimeter of Triangle - " + triangle.TrianglePerimeter());
        }
}