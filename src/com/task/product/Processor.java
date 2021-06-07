package com.task.product;

public class Processor extends Product {

    private int frequency;

    public Processor(String name, double price, String description, String picture, Category category, int frequency) {
        super(name, price, description, picture, category);
        this.frequency = frequency;
    }
}
