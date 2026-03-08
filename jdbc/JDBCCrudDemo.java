// 24. Write a program to perform the following operation using JDBC: Insert,
// Update, Delete and Select Data.}

import java.sql.*;

public class JDBCCrudDemo {

    // Database details
    static final String URL = "jdbc:mysql://localhost:3306/college";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected Successfully!");

            // ------------------ INSERT ------------------
            String insertQuery = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement psInsert = con.prepareStatement(insertQuery);
            psInsert.setInt(1, 101);
            psInsert.setString(2, "John");
            psInsert.setInt(3, 20);
            psInsert.executeUpdate();
            System.out.println("Record Inserted Successfully!");

            // ------------------ UPDATE ------------------
            String updateQuery = "UPDATE student SET age=? WHERE id=?";
            PreparedStatement psUpdate = con.prepareStatement(updateQuery);
            psUpdate.setInt(1, 22);
            psUpdate.setInt(2, 101);
            psUpdate.executeUpdate();
            System.out.println("Record Updated Successfully!");

            // ------------------ DELETE ------------------
            String deleteQuery = "DELETE FROM student WHERE id=?";
            PreparedStatement psDelete = con.prepareStatement(deleteQuery);
            psDelete.setInt(1, 101);
            psDelete.executeUpdate();
            System.out.println("Record Deleted Successfully!");

            // ------------------ SELECT ------------------
            String selectQuery = "SELECT * FROM student";
            PreparedStatement psSelect = con.prepareStatement(selectQuery);
            ResultSet rs = psSelect.executeQuery();

            System.out.println("\nStudent Records:");
            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id") +
                                ", Name: " + rs.getString("name") +
                                ", Age: " + rs.getInt("age"));
            }

            // Close connection
            con.close();
            System.out.println("\nConnection Closed.");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}