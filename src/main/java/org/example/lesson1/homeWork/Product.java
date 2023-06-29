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

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "(" + rating + ". " + name + " / " + price + ")";
    }
}
