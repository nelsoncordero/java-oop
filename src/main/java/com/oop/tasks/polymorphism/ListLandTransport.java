package com.oop.tasks.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport {
     private List<Land> land;

    public ListLandTransport() {
        this.land = new ArrayList<>();
    }

    public void addLand(Land land){
        this.land.add(land);
    }

    public void display(){
        this.land.forEach(val -> System.out.println(val.displayDAta()));
    }
}
