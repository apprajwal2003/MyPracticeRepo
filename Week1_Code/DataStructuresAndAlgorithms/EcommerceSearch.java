package DataStructuresAndAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class EcommerceSearch {

  // Function to perform a linear search on a list of products
  public static int linearSearch(List<String> products, String target) {
    for (int i = 0; i < products.size(); i++) {
      if (products.get(i).equalsIgnoreCase(target)) {
        return i; // Return the index of the found product
      }
    }
    return -1; // Return -1 if the product is not found
  }

  public static void main(String[] args) {
    List<String> products = new ArrayList<>();
    products.add("Laptop");
    products.add("Smartphone");
    products.add("Tablet");
    products.add("Smartwatch");

    String targetProduct = "Tablet";
    int index = linearSearch(products, targetProduct);

    if (index != -1) {
      System.out.println("Product found at index: " + index);
    } else {
      System.out.println("Product not found.");
    }
  }
}
