package org.telran.shop.de.model;

import org.telran.shop.de.enums.ProductType;

public class Product {

    private String title;

    private ProductType type;

    public Product(String title, ProductType type) {
        this.title = title;
        this.type = type;
    }

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", type=" + type +
                '}';
    }

    // test commit
}
