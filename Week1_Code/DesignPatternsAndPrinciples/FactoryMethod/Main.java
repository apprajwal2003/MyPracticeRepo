package DesignPatternsAndPrinciples.FactoryMethod;

public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    // Get Circle
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    shape1.draw(); // Output: Drawing a Circle

    // Get Square
    Shape shape2 = shapeFactory.getShape("SQUARE");
    shape2.draw(); // Output: Drawing a Square

    // Invalid shape
    Shape shape3 = shapeFactory.getShape("TRIANGLE");
    if (shape3 == null) {
      System.out.println("Invalid shape type.");
    }
  }
}
