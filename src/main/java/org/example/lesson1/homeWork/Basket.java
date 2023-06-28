package org.example.lesson1.homeWork;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;

    public Basket(ArrayList<Product> products) {
        this.products = products;
    }

    public Basket() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
