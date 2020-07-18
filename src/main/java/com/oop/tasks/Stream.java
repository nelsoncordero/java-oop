package com.oop.tasks;

import java.util.ArrayList;
import java.util.List;

public class Stream {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        countries.add("Bolivia");
        countries.add("Argentina");
        countries.add("Argelia");
        countries.add("Portugal");
        countries.add("Italia");
        countries.add("Australia");

        System.out.println("Start with 'A'");
        countries.stream()
                .filter(value -> value.charAt(0) == 'A')
                .forEach(value -> System.out.println(" - " + value));

        System.out.println("Length > 5");
        countries.stream()
                .filter(value -> value.length() > 5)
                .forEach(value -> System.out.println(" - " + value));

        System.out.println("Even length");
        countries.stream()
                .filter(value -> value.length() % 2 == 0)
                .forEach(value -> System.out.println(" - " + value));

    }
}
