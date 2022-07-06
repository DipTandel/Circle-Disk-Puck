//Disk
//ICS4U1, Dip Tandel
//Dec 13, 2021

public class Disk extends Circle {
  private double thickness;
  private double volume = 0;

  public Disk() {
    super(0); //uses circle constructor Circle(0)
    thickness = 0.0;
  }

  public Disk(double r, double t) {
    super(r);
    thickness = t;
  }

  public void setThickness(double t) {
    thickness = t;
  }

  public double getThickness() {
    return thickness;
  }

  public void setVolume() {
    volume = (3.14 * super.getRadius() * super.getRadius()) * (thickness);
  }

  public double getVolume() {
    return volume;
  }

  public boolean equals(Disk i) {
    if (i.getThickness() == thickness && i.getRadius() == super.getRadius()) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return ("The disk has a thickness of: " + thickness);
  }
}
