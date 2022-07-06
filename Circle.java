//Circle
//ICS4U1, Dip Tandel
//Dec 13, 2021

public class Circle {
  private double r;
  private double area = 0;

  public Circle() {
    r = 0.0;
  }

  public Circle(double r) {
    this.r = r;
  }

  public void setRadius(double r) {
    this.r = r;
  }

  public double getRadius() {
    return r;
  }

  public double circumference() {
    return (2 * 3.14 * r);
  }

  public void setArea() {
    area = (3.14 * r * r);
  }

  public double getArea() {
    return area;
  }

  public String toString() {
    return ("The cirlce has a radius of: " + r);
  }
}
