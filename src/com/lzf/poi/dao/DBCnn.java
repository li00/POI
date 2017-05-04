package com.lzf.poi.dao;

import com.lzf.poi.dto.Employee;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/3.
 */
public class DBCnn {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection getConn(){
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/poi","root","root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static List<Employee> getEmployee() throws SQLException {
        String sql  = "select * from Employee";
        ps = (PreparedStatement) getConn().prepareStatement(sql);
        rs = ps.executeQuery();

        List<Employee> list = new ArrayList<>();
         while (rs.next()){
             Employee employee = new Employee();
             employee.setId(rs.getInt(1));
             employee.setName(rs.getString(2));
             employee.setSex(rs.getString(3));
             employee.setAge(rs.getInt(4));
             employee.setNativePlace(rs.getString(5));
             employee.setEntryDate(rs.getString(6));
             list.add(employee);
        }
        return list;
    }

    public static void releace() throws SQLException {
        if (ps!=null)
            ps.close();
        if (conn!=null)
            conn.close();
        if (rs!=null)
            rs.close();
    }
}
