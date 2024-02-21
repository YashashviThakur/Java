public class RectangleShape extends Shape {
    private double length;
    private double width;
  
    public RectangleShape(double length, double width) {
      this.length = length;
      this.width = width;
    }
    public double getArea() {
      return length * width;
    }
    public double getPerimeter() {
      return (2 * (length + width));
    }
  }
