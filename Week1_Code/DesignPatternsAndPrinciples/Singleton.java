package DesignPatternsAndPrinciples;

public class Singleton {
  // Private static instance of the same class
  private static Singleton instance;

  // Private constructor to prevent instantiation
  private Singleton() {
  }

  // Public method to provide access to the instance
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}