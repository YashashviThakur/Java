public class CircleShape extends Shape {
    private double radius;
  
    public CircleShape(double radius) {
      this.radius = radius;
    }
  
    public double getArea() {
      return Math.PI * radius * radius;
    }
  
    public double getPerimeter() {
      return 2 * Math.PI * radius;
    }
  }