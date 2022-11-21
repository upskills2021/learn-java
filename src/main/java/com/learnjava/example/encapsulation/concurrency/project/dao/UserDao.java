package com.learnjava.example.encapsulation.concurrency.project.dao;

import com.learnjava.example.encapsulation.concurrency.project.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import static com.learnjava.example.encapsulation.concurrency.project.dao.DBConnection.getConnection;

public class UserDao {
    static {
        createUserTable();
    }

    public static void createUserTable() {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            String sql = "CREATE TABLE USER" +
                    "( id INTEGER NOT NULL, " +
                    " name VARCHAR(255), " +
                    " email VARCHAR(255) " +
                    " PRIMARY KEY (id))";
            statement.executeUpdate(sql);
            System.out.println("User Table has been created...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int saveUser(User user) {
        int rows = 0;
        Connection connection = getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("insert into user values(?,?,?)");
            ps.setInt(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getEmail());
            rows = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }
}
