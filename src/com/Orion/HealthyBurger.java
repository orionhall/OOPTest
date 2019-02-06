package com.Orion;

public class HealthyBurger extends Hamburger {
    private String name;
    private Topping topping5;
    private Topping topping6;

    public HealthyBurger() {
        super(new Bread("Whole wheat"), new Meat("Turkey patty"));
        this.name = "Healthy burger";
        this.price = calculatePrice();
    }

    public HealthyBurger(Topping topping1) {
        super(new Bread("Whole wheat"), new Meat("Turkey patty"), topping1);
        this.name = "Healthy burger";
        this.price = calculatePrice();
    }

    public HealthyBurger(Topping topping1, Topping topping2) {
        super(new Bread("Whole wheat"), new Meat("Turkey patty"), topping1, topping2);
        this.name = "Healthy burger";
        this.price = calculatePrice();
    }

    public HealthyBurger(Topping topping1, Topping topping2, Topping topping3) {
        super(new Bread("Whole wheat"), new Meat("Turkey patty"), topping1, topping2, topping3);
        this.name = "Healthy burger";
        this.price = calculatePrice();
    }

    public HealthyBurger(Topping topping1, Topping topping2, Topping topping3, Topping topping4) {
        super(new Bread("Whole wheat"), new Meat("Turkey patty"), topping1, topping2, topping3, topping4);
        this.name = "Healthy burger";
        this.price = calculatePrice();
    }

    public HealthyBurger(Topping topping1, Topping topping2, Topping topping3, Topping topping4, Topping topping5) {
        super(new Bread("Whole wheat"), new Meat("Turkey patty"), topping1, topping2, topping3, topping4);
        this.name = "Healthy burger";
        this.topping5 = topping5;
        this.price = calculatePrice();
    }

    public HealthyBurger(Topping topping1, Topping topping2, Topping topping3, Topping topping4, Topping topping5, Topping topping6) {
        super(new Bread("Whole wheat"), new Meat("Turkey patty"), topping1, topping2, topping3, topping4);
        this.name = "Healthy burger";
        this.topping5 = topping5;
        this.topping6 = topping6;
        this.price = calculatePrice();
    }

    @Override
    double calculatePrice() {
        double price = super.calculatePrice();
        if (this.topping5 != null) {
            price += 0.5;
        }
        if (this.topping6 != null) {
            price += 0.5;
        }
        return price;
    }

    @Override
    public void printOrder () {
        printOrderHeader();
        System.out.println("Healthy burger on " + getBreadType() + " with a(n) " + getMeatType() + " ordered.");
        System.out.printf("Additional toppings: ");
        System.out.printf(getToppingName(topping1) + " ");
        System.out.printf(getToppingName(topping2) + " ");
        System.out.printf(getToppingName(topping3) + " ");
        System.out.printf(getToppingName(topping4) + " ");
        System.out.printf(getToppingName(topping5) + " ");
        System.out.printf(getToppingName(topping6) + " ");
        System.out.println();
        System.out.println("Total price for this order: " + getPrice() + ".");
        System.out.println();
    }
}
