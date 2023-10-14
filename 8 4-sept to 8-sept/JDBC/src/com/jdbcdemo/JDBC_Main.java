package com.jdbcdemo;

import java.sql.*;
import java.util.Scanner;

class JDBCCON {
    Scanner sc;
    Connection con;

    JDBCCON() throws Exception {
        sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course", "root",
                "Mysql@123");
    }
}

class InsertData extends JDBCCON {

    InsertData() throws Exception {
        super();
    }

    public void insertData() throws Exception {
        try {
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
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class UpdateData extends JDBCCON{
    UpdateData() throws Exception {
        super();
    }

    public void updateData(){
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

class DeleteData extends JDBCCON{

    DeleteData() throws Exception {
        super();
    }

    public void deleteData(){
        try {
            PreparedStatement prstmt = con
                    .prepareStatement("delete from customer where cus_id=? ");
            System.out.println("Enter the id which data wanted to delete");
            int id = sc.nextInt();
            prstmt.setInt(1, id);

            int r = prstmt.executeUpdate();
            con.close();

            System.out.println("deleted successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}

public class JDBC_Main {
    public static void main(String[] args) throws Exception {
        // InsertData insert = new InsertData();
        // insert.insertData();
        // UpdateData update = new UpdateData();
        // update.updateData();
        DeleteData delete = new DeleteData();
        delete.deleteData();
    }
}
