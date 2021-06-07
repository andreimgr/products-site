package com.task.product;

public abstract class Product {

    private Category category;

    private int id;
    private static int generateId;
    private double price;
    private String name;
    private String description;
    private String picture;

    public Product(String name, double price, String description, String picture, Category category) {
        this.id = generateId();
        this.name = name;
        this.price = price;
        this.description = description;
        this.picture = picture;
        this.category = category;
    }

    public int generateId() {
        return generateId++;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", category=" + category +
                '}';
    }
}
