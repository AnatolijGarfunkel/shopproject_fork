package org.telran.shop.de.repository;

import org.telran.shop.de.model.DiscountCard;

import java.util.List;

public interface DiscountCardRepository {

    List<DiscountCard> getAll();

    DiscountCard create(DiscountCard card);

    DiscountCard getById(String id);

    void deleteById(String id);

    void setExpired(String id);

    List<DiscountCard> filter(boolean expired);
}
