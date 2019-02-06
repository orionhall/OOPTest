package com.Orion;

public class DeluxeBurger extends Hamburger {
    private Side side1;
    private Side side2;
    private double price;

    public DeluxeBurger () {
        super(new Bread("Regular bun"), new Meat("Beef patty"));
        this.side1 = new Side("French fries");
        this.side2 = new Side("Drink");
        this.price = 7.5;
    }

    @Override
    public void printOrder () {
        System.out.println();
        System.out.println("Orion's Hamburger Shop");
        System.out.println("Order No. " + Math.floor(Math.random() * 100));
        System.out.println();
        System.out.println("Deluxe burger ordered.");
        System.out.println("Includes french fries and a drink.");
        System.out.println("Total price for this order: " + price + ".");
        System.out.println();
    }
}
