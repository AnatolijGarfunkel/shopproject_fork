package org.telran.shop.de.entity;

//JPA - standard
//Hibernate - ORM framework, который реализует стандарт JPA
//ORM - Object Relational Mapping, технология, которая позволяет
//маппить джава классы в таблицы базы данных, поля классов в колонки бд
//и наоборот
//Spring Data JPA - набор интерфейсов для доступа к базе данных

import jakarta.persistence.*;

@Entity // Объекты данного класса будут сохраняться в бд
@Table(name = "shop_users") // указываем имя таблицы для сохранения объектов
public class User {

    @Id // данное поле является первичным ключом
    @GeneratedValue(strategy = GenerationType.IDENTITY) // авто увеличение поля
    private Long id;

    @Column(name = "login") // нет необходимости здесь
    private String login;

    private String password;

    private String email;

    private String userInfo;  // user_info

    @Column(name = "description") // явное задание колонки для маппинга
    private String information;

    public User() {
        //
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
