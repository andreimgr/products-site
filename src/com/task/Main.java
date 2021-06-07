package com.task;

import com.task.product.Category;
import com.task.product.Processor;
import com.task.product.Product;
import com.task.product.TV;
import com.task.user.PFA;
import com.task.user.PersoanaFizica;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Site site = new Site();

        site.createAccount(new PersoanaFizica("Andrei"));
        site.createAccount(new PFA("PFA Name"));

        site.addProduct(new Processor("Processor 1", 2000, "Processor 1 Description","Product 1 Picture", Category.PROCESSOR , 2400));
        site.addProduct(new TV("TV 1" ,2500, "TV 1 Description","TV 1 Picture", Category.TV, 120));
        site.addProduct(new Processor("Processor 2", 3000, "Processor 2 Description","Processor 2 Picture", Category.PROCESSOR, 1800));

        List<Product> siteProducts = site.getProducts();
        List<Product> productsInPriceRange = site.getProductsInPriceRange(2000, 2500);
        List<Product> productsInCategory = site.getProductsInCategory(Category.TV);

        System.out.println("Products in site");
        for (Product product: siteProducts) {
            System.out.println(product);
        }

        System.out.println();

        System.out.println("Products in price range");
        for (Product product: productsInPriceRange) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("Products in category");
        for (Product product: productsInCategory) {
            System.out.println(product);
        }
    }

}
