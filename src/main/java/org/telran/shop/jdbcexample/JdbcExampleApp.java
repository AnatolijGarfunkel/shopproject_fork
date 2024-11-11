package org.telran.shop.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Deprecated
public class JdbcExampleApp {

    public static void main(String[] args) {
        String url = "localhost:3306";
        String dbName = "shopproject";
        String userName = "root";
        String password = "rootroot";

        //jdbc:mysql://localhost:3306/ticketappdb
        String connString = "jdbc:mysql://" + url + "/" + dbName;

        try {
            Connection connection = DriverManager.getConnection(connString, userName, password);
            String sql = "SELECT * FROM products";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(); // ResultSet - набор строк ответа
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String type = resultSet.getString("type");
                System.out.println(" title = " + title + " | type = " + type);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
