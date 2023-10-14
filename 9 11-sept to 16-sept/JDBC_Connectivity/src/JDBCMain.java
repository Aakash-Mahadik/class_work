import java.sql.*;

public class JDBCMain {
    public static void main(String[] args) throws Exception {
        // Step 1: Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/course"; // JDBC URL for your database
        String user = "root"; // Database username
        String password = "Mysql@123"; // Database password

        // SQL statement to create the employees table
        String createTableSQL = "CREATE TABLE employees ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "first_name VARCHAR(50),"
                + "last_name VARCHAR(50),"
                + "age INT"
                + ")";

        try {
            // Step 2: Create a database connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 3: Create a statement
            Statement statement = con.createStatement();

            // Step 4: Execute the SQL statement to create the table
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'employees' created successfully.");

            // Step 5: Close the statement and database connection
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
