package org.example.service;

import org.example.Order;
import org.example.connexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class orderservice {
    connexion conn;
    Connection con;
    public orderservice() throws SQLException, ClassNotFoundException {
        conn=new connexion();
        this.con = conn.getConnection();
    }
    public void orderinsert(Order order) throws SQLException {

        String sql = "insert into orders values(?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,order.getIdOrder());
        pstmt.setString(2,order.getDateOrder());
        pstmt.setFloat(3,order.getAmount());
        pstmt.setInt(4,order.getCustomerId());
        pstmt.executeUpdate();
    }

}
