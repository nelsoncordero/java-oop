package com.oop.tasks.polymorphism;

public class Bicycle extends Land{

    private boolean exerciseBike;

    public Bicycle(String name, int price, boolean hasMotor, boolean exerciseBike) {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }

    public boolean isExerciseBike() {
        return exerciseBike;
    }

    public void setExerciseBike(boolean exerciseBike) {
        this.exerciseBike = exerciseBike;
    }

    @Override
    public String displayDAta() {
        return super.displayDAta() + ", exercise = " + isExerciseBike();
    }

}
