package DesignPatternsAndPrinciples;

public abstract class FactoryMethod {
    public abstract Product createProduct();

    public void someOperation() {
        Product product = createProduct();
        product.performAction();
    }
}

class ConcreteProductA extends Product {
    @Override
    public void performAction() {
        System.out.println("Performing action in ConcreteProductA");
    }
}

class ConcreteProductB extends Product {
    @Override
    public void performAction() {
        System.out.println("Performing action in ConcreteProductB");
    }
}

abstract class Product {
    public abstract void performAction();
}

class ConcreteFactoryA extends FactoryMethod {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB extends FactoryMethod {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

class FactoryMethodDemo {
    public static void main(String[] args) {
        FactoryMethod factoryA = new ConcreteFactoryA();
        factoryA.someOperation(); // Outputs: Performing action in ConcreteProductA

        FactoryMethod factoryB = new ConcreteFactoryB();
        factoryB.someOperation(); // Outputs: Performing action in ConcreteProductB
    }
}
