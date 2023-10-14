//importing sql classes
import java.sql.*;

public class JDBCInsertMain {
    public static void main(String[] args) throws Exception {
        // Step 1: Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/course"; // JDBC URL for your database
        String user = "root"; // Database username
        String password = "Mysql@123"; // Database password

        // SQL statement to insert data into the employees table
        String insertData = "INSERT INTO employees (first_name, last_name, age) VALUES (?, ?, ?)";

        // Employee information
        String firstName = "John";
        String lastName = "Doe";
        int age = 30;

        try {
            // Step 2: Create a database connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 3: Create a prepared statement
            PreparedStatement preparedStatement = con.prepareStatement(insertData);

            // Step 4: Set parameter values for the prepared statement
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, age);

            // Step 5: Execute the PreparedStatement to insert the new employee record
            preparedStatement.executeUpdate();
            System.out.println("Data inserted successfully.");

            // Step 6: Close the PreparedStatement and database connection
            preparedStatement.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
