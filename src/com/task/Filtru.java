package com.task;

import com.task.product.Category;

public class Filtru {

    private double maxPrice, minPrice;
    private Category category;

    public Filtru(double maxPrice, double minPrice, Category category) {
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.category = category;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public Category getCategory() {
        return category;
    }
}
