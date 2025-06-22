package DesignPatternsAndPrinciples.Singleton;

public class Singleton {

  // Step 1: Create a private static instance variable
  private static Singleton instance;

  // Step 2: Make the constructor private to prevent instantiation from outside
  private Singleton() {
    System.out.println("Singleton instance created!");
  }

  // Step 3: Provide a public static method to get the single instance (Lazy
  // Initialization)
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton(); // Create the instance only if it doesn't exist
    }
    return instance;
  }

  // Step 4: Example method
  public void showMessage() {
    System.out.println("Hello from Singleton!");
  }
}
