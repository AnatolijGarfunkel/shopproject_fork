package org.telran.shop.de;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telran.shop.de.configuraton.ShopConfig;
import org.telran.shop.de.controller.ProductController;
import org.telran.shop.de.model.Product;

import java.util.List;

/**
 * @ComponentScan - указывает путь для сканирования пакетов, для поиска
 * классов помеченных нижеуказанными аннотациями
 * @Component - помечаем классы как кандидаты в спринг бины
 * @Controller - помечаем классы контроллеры-аналог компонент
 * @Service - помечаем классы сервисы-аналог компонент
 * <p>
 * Constructor injection
 * Setter injection
 * Field injection (use @Autowired)
 * @Autowired - указывает спрингу, что сюда нужно внедрить зависимость(bean)!!!
 */

//@SpringBootApplication
public class ShopApp implements CommandLineRunner {

//    @Autowired
//    private ProductController controller;
//
//    public static void main(String[] args) {
//        SpringApplication.run(ShopApp.class, args);
//    }

    @Override
    public void run(String... args) throws Exception {
//        List<Product> all = controller.getAll();
//        System.out.println(all);
    }
}
