package DataStructuresAndAlgorithms.EcommerceSearch;

import java.util.*;

class Product {
  String name;
  double price;

  Product(String name, double price) {
    this.name = name;
    this.price = price;
  }
}

class ProductSearch {
  private Map<String, Product> productMap = new HashMap<>();

  public void addProduct(Product product) {
    productMap.put(product.name.toLowerCase(), product);
  }

  public Product searchByName(String name) {
    return productMap.get(name.toLowerCase());
  }
}

class Main {
  public static void main(String[] args) {
    ProductSearch search = new ProductSearch();
    search.addProduct(new Product("Laptop", 60000));
    search.addProduct(new Product("Phone", 25000));

    Product result = search.searchByName("laptop");
    if (result != null) {
      System.out.println("Found: " + result.name + " for Rs " + result.price);
    } else {
      System.out.println("Product not found.");
    }
  }
}
