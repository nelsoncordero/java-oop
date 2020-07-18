package com.oop.tasks.polymorphism;

public class Car extends Land{

    private boolean useGas;

    public Car(String name, int price, boolean hasMotor, boolean useGas) {
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    public boolean isUseGas() {
        return useGas;
    }

    public void setUseGas(boolean useGas) {
        this.useGas = useGas;
    }

    @Override
    public String displayDAta() {
        return super.displayDAta() + ", useGas = " + isUseGas();
    }
}
