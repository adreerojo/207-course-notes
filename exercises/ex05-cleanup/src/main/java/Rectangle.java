/**
 * Rectangle class which has a width and height, can be scaled, compared, and can find the area.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a rectangle, giving it a width and height.
     *
     * @param w is the width of the rectangle
     * @param h is the height of the rectangle
     */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Multiplies the width and height, returning the area of the rectangle.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle by {@code factor}, returns nothing.
   *
   * @param factor double the rectangle is scaled by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares 2 rectangles {@code this} and {@code other}.
   *
   * @param other is the {@code Rectangle} we are comparing to
   * @return true when {@code this} greater than {@code other} and false when the opposite is true
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
