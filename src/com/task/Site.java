package com.task;

import com.task.product.Category;
import com.task.product.Product;
import com.task.user.User;

import java.util.ArrayList;
import java.util.List;

public class Site {

    private List<User> users;
    private List<Product> products;

    public Site() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void createAccount(User user) {
        users.add(user);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProductsInPriceRange(double minPrice, double maxPrice) {
        List<Product> productsInPriceRange = new ArrayList<>();

        for (Product product: products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                productsInPriceRange.add(product);
            }
        }

        return productsInPriceRange;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getProductsInCategory(Category category) {
        List<Product> productsInCategory = new ArrayList<>();

        for (Product product: products) {
            if (product.getCategory().equals(category)) {
                productsInCategory.add(product);
            }
        }
        return productsInCategory;
    }

    public List<Product> getFilterProducts(Filtru filtru) {
        List<Product> filteredProducts = new ArrayList<>();

        double minPrice = filtru.getMinPrice();
        double maxPrice = filtru.getMaxPrice();
        Category category = filtru.getCategory();

        for (Product product: products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice && product.getCategory().equals(category)) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    @Override
    public String toString() {
        return "Site{" +
                "products=" + products +
                '}';
    }
}
