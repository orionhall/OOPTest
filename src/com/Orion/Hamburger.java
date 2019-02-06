package com.Orion;

public class Hamburger {
    private Bread bread;
    private Meat meat;
    private Topping topping1;
    private Topping topping2;
    private Topping topping3;
    private Topping topping4;
    private double basePrice = 2;
    private double price;

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
        double price = this.basePrice;
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

    public void printOrder () {
        System.out.println();
        System.out.println("Orion's Hamburger Shop");
        System.out.println("Order No. " + Math.floor(Math.random() * 100));
        System.out.println();
        System.out.println("Regular burger on " + this.bread.getBreadType() + " with a(n) " + this.meat.getMeatType() + " ordered.");
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

    // Okay this is stupid but I don't know the right way to do this yet :)
    // Need access to it in an inherited class but don't want to make it public
    public String getTopping1Name () {
        if (topping1 != null) {
            return topping1.getName() + " ";
        } else {
            return "";
        }
    }
    public String getTopping2Name () {
        if (topping2 != null) {
            return topping2.getName() + " ";
        } else {
            return "";
        }
    }
    public String getTopping3Name () {
        if (topping3 != null) {
            return topping3.getName() + " ";
        } else {
            return "";
        }
    }
    public String getTopping4Name () {
        if (topping4 != null) {
            return topping4.getName() + " ";
        } else {
            return "";
        }
    }
}
