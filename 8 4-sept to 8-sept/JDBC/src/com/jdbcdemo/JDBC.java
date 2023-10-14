package com.jdbcdemo;
import java.sql.*;
import java.util.Scanner;
public class JDBC  {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =
        DriverManager.getConnection("jdbc:mysql://localhost:3306/course", "root",
        "Mysql@123");
        PreparedStatement prstmt = con.prepareStatement("insert into customer values(?,?,?,?,?)");

        System.out.println("Enter the id");
        int id = sc.nextInt();
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the city");
        String city = sc.next();
        System.out.println("Enter the postalcode");
        int postalcode = sc.nextInt();
        System.out.println("Enter the country");
        String country = sc.next();

        prstmt.setInt(1, id);
        prstmt.setString(2, name);
        prstmt.setString(3, city);
        prstmt.setInt(4, postalcode);
        prstmt.setString(5, country);

        int query = prstmt.executeUpdate();
        con.close();

        System.out.println("inserted successfully");

    }
}
