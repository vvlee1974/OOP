package org.example.lesson1.homeWork;

public class Product {
    protected String name;
    protected Double price;
    protected Integer rating;

    public Product(String name, Double price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "(" + rating + ". " + name + " / " + price + ")";
    }
}
