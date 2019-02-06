package com.Orion;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(new Bread("Poppyseed Muffin"), new Meat("Fish Patty"));
        Hamburger hamburger2 = new Hamburger(new Bread("Whole wheat roll"), new Meat("Cajun beef patty"), new Topping("Spaghetti sauce"));

        HealthyBurger healthyBurger = new HealthyBurger(new Topping("Kale"), new Topping("Seaweed"), new Topping("Miso paste"),
                new Topping("Hummus"), new Topping("Salmon roe"), new Topping("Sesame seeds"));
        HealthyBurger healthyBurger2 = new HealthyBurger();

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        System.out.println("---TABULATING ORDERS---");
        hamburger.printOrder();
        hamburger2.printOrder();
        healthyBurger.printOrder();
        healthyBurger2.printOrder();
        deluxeBurger.printOrder();
        System.out.println("---END OF ORDERS---");
    }
}
