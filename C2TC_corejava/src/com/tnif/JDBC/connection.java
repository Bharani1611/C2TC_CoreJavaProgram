package com.tnif.JDBC;

import java.sql.*;
import java.util.Scanner;

public class connection {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/C2TC_Training";
        String user = "postgres";
        String password = "161104";

        Connection conn = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to PostgreSQL!");

            // Create table if not exists
            String createQuery = "CREATE TABLE IF NOT EXISTS employee (" +
                    "id INT PRIMARY KEY, " +
                    "name TEXT, " +
                    "city TEXT)";
            stmt = conn.createStatement();
            stmt.execute(createQuery);

            // 🔥 Ask how many employees
            System.out.print("👥 How many employees you want to add? ");
            int count = sc.nextInt();
            sc.nextLine(); // clear newline

            // Loop for input
            for (int i = 1; i <= count; i++) {
                System.out.println("\n👤 Enter details for Employee " + i);
                System.out.print("Enter Employee ID   : ");
                int empId = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter Employee Name : ");
                String empName = sc.nextLine();

                System.out.print("Enter City          : ");
                String empCity = sc.nextLine();

                String insertQuery = "INSERT INTO employee (id, name, city) VALUES (?, ?, ?)";
                pstmt = conn.prepareStatement(insertQuery);
                pstmt.setInt(1, empId);
                pstmt.setString(2, empName);
                pstmt.setString(3, empCity);

                int rows = pstmt.executeUpdate();

                if (rows > 0) {
                    System.out.println("✅ Employee " + empName + " added!");
                }
            }

            // Show all employees
            rs = stmt.executeQuery("SELECT * FROM employee");
            System.out.println("\n📋 --- Employee Table ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                System.out.println("ID: " + id + " | Name: " + name + " | City: " + city);
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                sc.close();
                System.out.println("\n✅ Resources closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
