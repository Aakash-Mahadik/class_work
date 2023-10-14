package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpdate {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course", "root",
                "Mysql@123");

        try {
            PreparedStatement prstmt = con
                    .prepareStatement("update customer set cust_name=?,city=?,postalcode=?,country=? where cus_id=? ");
            System.out.println("Enter the id where you want to changes");
            int id = sc.nextInt();
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the city");
            String city = sc.next();
            System.out.println("Enter the postalcode");
            int postalcode = sc.nextInt();
            System.out.println("Enter the country");
            String country = sc.next();

            prstmt.setString(1, name);
            prstmt.setString(2, city);
            prstmt.setInt(3, postalcode);
            prstmt.setString(4, country);
            prstmt.setInt(5, id);

            int r = prstmt.executeUpdate();
            con.close();

            System.out.println("updated successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
