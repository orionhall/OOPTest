package com.Orion;

public class Hamburger {
    private Bread bread;
    private Meat meat;
    protected Topping topping1;
    protected Topping topping2;
    protected Topping topping3;
    protected Topping topping4;
    protected double price;

    // These constructors are redundant but I don't know what arrays are!

    public Hamburger(Bread bread, Meat meat) {
        this.bread = bread;
        this.meat = meat;
        this.price = calculatePrice();
    }

    public Hamburger(Bread bread, Meat meat, Topping topping1) {
        this.bread = bread;
        this.meat = meat;
        this.topping1 = topping1;
        this.price = calculatePrice();
    }

    public Hamburger(Bread bread, Meat meat, Topping topping1, Topping topping2) {
        this.bread = bread;
        this.meat = meat;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.price = calculatePrice();
    }

    public Hamburger(Bread bread, Meat meat, Topping topping1, Topping topping2, Topping topping3) {
        this.bread = bread;
        this.meat = meat;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.price = calculatePrice();
    }

    public Hamburger(Bread bread, Meat meat, Topping topping1, Topping topping2, Topping topping3, Topping topping4) {
        this.bread = bread;
        this.meat = meat;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
        this.price = calculatePrice();
    }

    double calculatePrice () {
        double price = 2;
        if (this.topping1 != null) {
            price += 0.5;
        }
        if (this.topping2 != null) {
            price += 0.5;
        }
        if (this.topping3 != null) {
            price += 0.5;
        }
        if (this.topping4 != null) {
            price += 0.5;
        }
        return price;
    }

    public double getPrice() {
        return price;
    }

    public void printOrderHeader () {
        System.out.println();
        System.out.println("Orion's Hamburger Shop");
        System.out.println("Order No. " + Math.round(Math.random() * 100));
    }

    public void printOrder () {
        printOrderHeader();
        System.out.println("Regular burger on " + this.bread.getBreadType() + " with a(n) " + this.meat.getMeatType() + " ordered.");
        System.out.printf("Additional toppings: ");
        System.out.printf(getToppingName(topping1) + " ");
        System.out.printf(getToppingName(topping2) + " ");
        System.out.printf(getToppingName(topping3) + " ");
        System.out.printf(getToppingName(topping4) + " ");
        System.out.println();
        System.out.println("Total price for this order: " + getPrice() + ".");
        System.out.println();
    }

    public String getBreadType() {
        return this.bread.getBreadType();
    }

    public String getMeatType() {
        return this.meat.getMeatType();
    }

    public String getToppingName (Topping topping) {
        if (topping != null) {
            return topping.getName() + " ";
        } else {
            return "";
        }
    }
}
