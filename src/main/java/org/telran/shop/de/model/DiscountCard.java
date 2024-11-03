package org.telran.shop.de.model;

public class DiscountCard {

    private String id;

    private boolean expired;

    public DiscountCard() {
        //
    }

    public void setId(String id) {
        this.id = id;
    }

    public DiscountCard(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}
