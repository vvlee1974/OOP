package org.example.lesson1.homeWork;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     *
     * @param product выбранный товар
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return " " + products ;
    }
}
