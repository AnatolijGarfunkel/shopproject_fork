package org.telran.shop.de.repository;

import org.telran.shop.de.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();

    Product getByTitle(String title);
}
