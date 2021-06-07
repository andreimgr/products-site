package com.task.product;

public class TV extends Product {

    private int screenSize;

    public TV(String name, double price, String description, String picture, Category category, int screenSize) {
        super(name, price, description, picture, category);
        this.screenSize = screenSize;
    }
}
