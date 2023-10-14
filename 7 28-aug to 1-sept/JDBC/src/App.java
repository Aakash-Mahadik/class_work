
import java.sql.*;
import java.util.Scanner;

class Sqlcall {
    Scanner sc = new Scanner(System.in);
    Connection con;
    Statement stmt;

    Sqlcall() throws Exception  {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course", "root", "Mysql@123");
        stmt = con.createStatement();
    }
    public void Call() throws Exception {
        System.out.println("Enter what to display from table ");
        String Que = sc.nextLine();
        String sqlQuery = "SELECT "+Que+"FROM studinfo";
        ResultSet resultSet = stmt.executeQuery(sqlQuery);

        // // Process the result set
        // while (resultSet.next()) {
        // int id = resultSet.getInt("roll_no");
        // String name = resultSet.getString("name");
        // String add = resultSet.getString("address");
        // String phone = resultSet.getString("phone");
        // int age = resultSet.getInt("age");
        // // Process or print the retrieved data
        // System.out.println("rollNo: " + id + ", Name: " + name + ", Address: " + add
        // + ", Mobile No: " + phone
        // + ", Age: " + age);
        // }

        // con.close();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection con =
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/course", "root",
        // "Mysql@123");
        // Statement stmt = con.createStatement();
        // // int a = stmt.executeUpdate("insert into studinfo
        // // values(10,'Aakash','Mumbai(B)','5555555555',100)");
        // // System.out.println("sucessfully added "+a);

        // String sqlQuery = "SELECT * FROM studinfo";
        // ResultSet resultSet = stmt.executeQuery(sqlQuery);

        // // Process the result set
        // while (resultSet.next()) {
        // int id = resultSet.getInt("roll_no");
        // String name = resultSet.getString("name");
        // String add = resultSet.getString("address");
        // String phone = resultSet.getString("phone");
        // int age = resultSet.getInt("age");
        // // Process or print the retrieved data
        // System.out.println("rollNo: " + id + ", Name: " + name + ", Address: " + add
        // + ", Mobile No: " + phone
        // + ", Age: " + age);
        // }

        // con.close();

    }
}
