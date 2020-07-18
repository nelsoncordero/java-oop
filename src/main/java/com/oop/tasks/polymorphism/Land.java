package com.oop.tasks.polymorphism;

public class Land extends Transport{

    private boolean hasMotor;

    public Land(String name, int price, boolean hasMotor) {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    public boolean isHasMotor() {
        return hasMotor;
    }

    public void setHasMotor(boolean hasMotor) {
        this.hasMotor = hasMotor;
    }

    public String displayDAta() {
        return "name = " + getName()
                + ", price: " + getPrice()
                + ", hasMotor: " + isHasMotor();
    }
}
