//Puck
//ICS4U1, Dip Tandel
//Dec 13, 2021

public class Puck extends Disk {
  private double weight = 0;
  private boolean standard;
  private boolean youth;

  public Puck(double w) {
    super(1.5, 1);
    if (w >= 4 && w <= 4.5) {
      youth = true;
      standard = false;
    } else if (w >= 5 && w <= 5.5) {
      standard = true;
      youth = false;
    } else {
      standard = false;
      youth = false;
    }
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double w) {
    weight = w;
  }

  public String getDivision() {
    if (standard == true) {
      return ("Standard");
    } else if (youth = true) {
      return ("Youth");
    } else {
      return ("Unknown");
    }
  }

  public void equals(Puck p) {
    if (p.getThickness() > super.getThickness()) {
      System.out.println("Other puck more thick");
    } else if (p.getThickness() < super.getthickness) {
      System.out.println("This puck more thick");
    } else {
      System.out.println("THEY EQUAL MAN");
    }
  }

  public String toString() {
    String div;
    if (youth = true) {
      div = "youth";
    } else if (standard = true) {
      div = "standard";
    } else {
      div = "unknown";
    }
    return "This puck is of " + div + " type";
  }
}
