public class useMyPoint {
	
  public static void main(String[] args) {
    MyPoint a = new MyPoint(0, 0);
    MyPoint b = new MyPoint(10, 30.5);

    System.out.printf("The distance between the points %s and %s is %f.\n", a, b, b.distance(a));
  }
}


// a representation of an x,y plane
class MyPoint {
  private double __x;
  private double __y;

  // Creating the point (0,0) using a no arg constructor
  public MyPoint() {
    this(0, 0);
  }

  // Constructing a point with specified coordinates
  public MyPoint(double x, double y) {
    this.__x = x;
    this.__y = y;
  }

  // Calculating the distance between this Point and the specified point of the MyPoint type


  public double distance(double x, double y) {
    // d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
    return Math.sqrt((x - this.__x) * (x - this.__x) + (y - this.__y) * (y - this.__y));
  }

  // Calculating the distance from this point to another point with specified coordinates

  public double distance(MyPoint other) {
    return other.distance(this.__x, this.__y);
  }

  // finding the distance from the point (0,0)
  public double distance() {
    return this.distance(0.0, 0.0);
  }


  // Showing an understandable display of MyPoint
  public String toString() {
    return String.format("(%f, %f)", this.__x, this.__y);
  }



}
