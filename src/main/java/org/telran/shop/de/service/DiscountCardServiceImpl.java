package org.telran.shop.de.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.shop.de.entity.DiscountCard;
import org.telran.shop.de.repository.DiscountCardJpaRepository;

import java.util.List;

@Service
public class DiscountCardServiceImpl implements DiscountCardService {

    @Autowired
    private DiscountCardJpaRepository repository;


// GET -----------------------------------------------------------------------------------------------------------------

    @Override
    public List<DiscountCard> getAll() {
        return repository.findAll();
    }

    @Override
    public DiscountCard getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<DiscountCard> filter(boolean expired) {
        return repository.findDiscountCardsByExpired(expired);
    }

// POST ----------------------------------------------------------------------------------------------------------------

    @Override
    public DiscountCard create(DiscountCard card) {
        return repository.save(card);
    }

    @Override
    public DiscountCard setExpired(String id) {
        DiscountCard card = getById(id);
        card.setExpired(true);
        repository.save(card);
        return card;
    }

// DELETE --------------------------------------------------------------------------------------------------------------

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
