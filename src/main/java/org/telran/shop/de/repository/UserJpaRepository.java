package org.telran.shop.de.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.telran.shop.de.entity.User;

import java.util.List;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long> {

    User findByLogin(String login); // SELECT * FROM shop_user WHERE login =:login

    List<User> findAllByPassword(String password); // SELECT * FROM shop_users WHERE password =:password

    @Query("SELECT u FROM User u WHERE u.userInfo IS NOT NULL")
    List<User> getUserWithUserInfo();
}
