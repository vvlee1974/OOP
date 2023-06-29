package org.example.lesson1.homeWork;

public class User {
    private String login;
    private String password;

    private Basket basket;

    public User(String login) {
        this.login = login;
        this.basket = new Basket();
    }

    public String getLogin() {
        return login;
    }

    public String setPassword() {
        return password;
    }

    /**
     * @return содержимое корзины
     */
    public Basket getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "В корзине " + login  + " -"  + basket;
    }
}
