package org.example.lesson1.homeWork;

import java.util.List;

public class Category {
    private String name;
    private List<Product> products;


    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    /**
     *
     * @return список товаров
     */
    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
            products.add(product);
    }public void removeProduct(Product product) {
            products.remove(product);
    }

    @Override
    public String toString() {
        return name + ": " + products;
    }
}
