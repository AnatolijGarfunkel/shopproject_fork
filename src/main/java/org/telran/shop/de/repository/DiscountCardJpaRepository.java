package org.telran.shop.de.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.telran.shop.de.entity.DiscountCard;

import java.util.List;

@Repository
public interface DiscountCardJpaRepository extends JpaRepository<DiscountCard, String> {

    List<DiscountCard> findDiscountCardsByExpired(boolean expired);

//    @Query("update DiscountCard card set card.expired = true where card.id =:id")
//    void setDiscountCardExpired(@Param("id") String id);
}
