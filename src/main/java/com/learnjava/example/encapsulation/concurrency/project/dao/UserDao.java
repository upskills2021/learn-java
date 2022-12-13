package com.learnjava.example.encapsulation.concurrency.project.dao;

import com.learnjava.example.encapsulation.concurrency.project.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.learnjava.example.encapsulation.concurrency.project.dao.DBConnection.getConnection;

public class UserDao {

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
