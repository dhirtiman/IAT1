// 24. Write a program to perform the following operation using JDBC: Insert,
// Update, Delete and Select Data.}

/*
in mysql:

CREATE DATABASE COLLEGE;
USE COLLEGE;

CREATE TABLE STUDENT (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

1. import java.sql.*;
2. prepare the credentials :
    URL  = "jdbc:mysql://localhost:3306/dbname" , user=user,pass = pass
inside try:
 3. load the driver class using : Class.forName("com.mysql.cj.jdbc.Driver");
 4.call getConnection method of DriverManager class using the credentials and store in Connection object
 5. use prepared statement to perform CRUD operations
    for insert : 
        prepare the query with ? as placeholders for values : String qr = " insert into student values (?, ?, ?)"
        create PreparedStatement object using con.prepareStatement(query)
        set the values using ps.setInt/setString etc methods : ps.setInt(1,101) for id, ps.setString(2,"John") for name and ps.setInt(3,20) for age
        execute the query using ps.executeUpdate() or ps.executeBatch() for multiple records

    for update:
        prepare the update query with ? placeholders
        create PreparedStatement and set values similarly to insert
        execute the update query // ps.executeUpdate()

    for delete:
        prepare delete query with ? placeholder for id or condition
        create PreparedStatement, set value and execute : ps.executeUpdate()

    for select:
        prepare select query
        create PreparedStatement and executeQuery() to get ResultSet
        iterate through ResultSet to read data


*/

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
            psInsert.addBatch();
            psInsert.executeBatch();
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