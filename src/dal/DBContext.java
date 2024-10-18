
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    protected Connection connection = null;
    // URL kết nối tới cơ sở dữ liệu MySQL
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/apartment";
    private static final String DATABASE_USER = "root"; 
    private static final String DATABASE_PASSWORD = ""; 

    public DBContext() {
        try {
            // Tải driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Kết nối tới cơ sở dữ liệu
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

            if (connection != null) {
                System.out.println("Connected to the database successfully!");
            } else {
                System.out.println("Failed to connect to the database.");
            }

        } catch (Exception e) {
            System.out.println("MySQL Driver not found.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new DBContext();
    }
}
