public class Square {
  private double side;
  final int MAX_SIDE_LENGTH = 10;

  public double Square(double theSide) {
    double side=theSide;
    return side;
  }

  public double getSide() {
    return side;
  }

  public double setSide(double theSide) {
    side=theSide;
    return side;
  }

  public String toString() {
    return "Square with side length = " + side;
  }

  public double area() {
    double area=side*side;
    return area;
  }

  public double diagonal() {
    double diagonal=Math.sqrt(2*side*side);
    return diagonal;
  }
}

