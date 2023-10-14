import java.sql.*;
import java.util.Scanner;

public class JDBCInsertion {
    public static void main(String[] args) throws Exception {

        String url, user, password, statment;
        int choice;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        // step1
        Class.forName("com.mysql.cj.jdbc.Driver");

        url = "jdbc:mysql://localhost:3306/course";
        user = "root";
        password = "Mysql@123";
        statment = "insert into student values(?,?,?)";

        // step2
        Connection con = DriverManager.getConnection(url, user, password);

        //step 3 
                        PreparedStatement prepstat = con.prepareStatement(statment);
        try{
        while (flag) {
            System.out.println("\n1.insert\n2.See Table\n3.break");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        
                        System.out.println("Enter the id");
                        int id = sc.nextInt();
                        System.out.println("Enter the name");
                        String name = sc.next();
                        System.out.println("Enter the percentage");
                        String percentage = sc.next();

                        prepstat.setInt(1, id);
                        prepstat.setString(2,name);
                        prepstat.setString(3,percentage);

                        //step4
                        int query = prepstat.executeUpdate();

                        System.out.println("insert succesfully");
            

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    try {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("select * from student");
                        while (rs.next()) {
                            int id = rs.getInt(1);
                            String name = rs.getString(2);
                            String percentage = rs.getString(3);
                            System.out.println("ID: " + id + ", Name: " + name + ", Percentage: " + percentage);
                        }
                        rs.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Entered a wrong choice");
                    break;
            }

            
        }
    }catch(Exception e){
        System.out.println(e);
    }

        //step5
            con.close();
            sc.close();

    }
}
