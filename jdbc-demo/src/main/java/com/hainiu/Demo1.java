package com.hainiu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//注册驱动
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://11.112.227.39:3306/db1?useSSL=false&characterEncoding=utf-8",
                "root",
                "hainiu");

        Statement statement = connection.createStatement();
        String sql = "insert into student values(null,'祁硕',18)";
        int i = statement.executeUpdate(sql);
        System.out.println("受影响的行数为:"+i);
        statement.close();
        connection.close();



    }
}
