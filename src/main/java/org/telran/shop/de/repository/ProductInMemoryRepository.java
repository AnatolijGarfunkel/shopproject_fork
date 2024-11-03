package org.telran.shop.de.repository;

import org.springframework.stereotype.Component;
import org.telran.shop.de.enums.ProductType;
import org.telran.shop.de.model.Product;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductInMemoryRepository implements ProductRepository {

    private List<Product> storage = Arrays.asList(
      new Product("Apple", ProductType.FRUIT),
      new Product("Cucumber",ProductType.VEGETABLE)
    );

    @Override
    public List<Product> getAll() {
        return storage;
    }
}
