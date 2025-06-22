package DesignPatternsAndPrinciples.Singleton;

// Main.java
public class Main {
  public static void main(String[] args) {

    // Get the only object from Singleton class
    Singleton obj1 = Singleton.getInstance();
    obj1.showMessage();

    // Try getting another reference to check if it's the same object
    Singleton obj2 = Singleton.getInstance();
    obj2.showMessage();

    // Compare both references
    if (obj1 == obj2) {
      System.out.println("Both references point to the same instance.");
    } else {
      System.out.println("Different instances (this shouldn't happen).");
    }
  }
}
