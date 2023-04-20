package com.hainiu;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.hainiu.autil.JdbcUtil;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Demo2 {
    public static void main(String[] args) {

        DruidPooledConnection connection = JdbcUtil.getConnection();
        String sql = "select * from student";
        PreparedStatement statement = null;
        List<Student> list = new ArrayList<Student>();
        try {
             statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                list.add(new Student(rs.getInt("id"),rs.getString("s_name"),rs.getInt("age")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        list.forEach(System.out::println);
    }
}
