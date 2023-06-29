package org.example.lesson1.homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Товары в магазине");
        System.out.println("=================");
        List<Product> products1 = new ArrayList<>();
        Category category1 = new Category("Бытовая техника", products1);
        category1.addProduct(new Product("Холодильник", 26000.00,1));
        category1.addProduct(new Product("Стиральная машина", 26000.00,2));
        category1.addProduct(new Product("Пылесос", 18000.00,3));
        System.out.println(category1);

        List<Product> products2 = new ArrayList<>();
        Category category2 = new Category("Электроника", products2);
        category2.addProduct(new Product("Телевизор", 50000.00, 1));
        category2.addProduct(new Product("Смартфон", 60000.00, 2));
        category2.addProduct(new Product("Ноутбук", 150000.00, 3));
        System.out.println(category2);

        User user1 = new User("Vasya-321");
        User user2 = new User("Petya-123");
        System.out.println();

        Random random = new Random();
        int r1 = random.nextInt(products1.size());
        int r2 = random.nextInt(products2.size());
        user1.getBasket().addProduct(category1.getProducts().get(r1));
        category1.getProducts().remove(r1);
        user1.getBasket().addProduct(category2.getProducts().get(r2));
        category2.getProducts().remove(r2);
        System.out.println(user1 );

        int r3 = random.nextInt(products1.size());
        int r4 = random.nextInt(products2.size());
        user2.getBasket().addProduct(category1.getProducts().get(r3));
        category1.getProducts().remove(r3);
        user2.getBasket().addProduct(category2.getProducts().get(r4));
        category2.getProducts().remove(r4);
        System.out.println(user2);

        System.out.println();
        System.out.println("Остатки товаров в магазине");
        System.out.println("==========================");
        System.out.println(category1);
        System.out.println(category2);
    }
}
