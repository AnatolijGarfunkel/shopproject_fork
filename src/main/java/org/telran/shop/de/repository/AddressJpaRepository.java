package org.telran.shop.de.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telran.shop.de.entity.Address;

@Repository
public interface AddressJpaRepository extends JpaRepository<Address, Long> {
}
