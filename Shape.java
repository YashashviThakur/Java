
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    public static void main(String[] args) {

        Shape rectangle = new RectangleShape(6, 8);
        Shape circle = new CircleShape(7);
        Shape triangle = new TriangleShape(4, 3, 2);
    

        System.out.println("Area of Rectagle is = " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle is = " + rectangle.getPerimeter()+ "\n");
    
        System.out.println("Area of Circle is = " + circle.getArea());
        System.out.println("Perimeter of Circle is = " + circle.getPerimeter()+ "\n");
    
        System.out.println("Area of Triangle is = " + triangle.getArea());
        System.out.println("Perimeter of Triangle is = " + triangle.getPerimeter());
      }
}
