package com.tnsif.jbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Demo for JDBC Select Program
public class JDBCselect {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Step 1: Load and register the PostgreSQL driver
        Class.forName("org.postgresql.Driver");
        System.out.println("Step 1: Driver loaded successfully.");

        // Step 2: Establish connection
        String url = "jdbc:postgresql://localhost:5432/Peenya";
        String username = "postgres";
        String password = "postgres";   // Change if your PostgreSQL password is different

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Step 2: Database connected successfully.");

        // Step 3: Create Statement
        Statement st = conn.createStatement();

        // Step 4: Execute SELECT query
        String strSelect = "SELECT sid, sname, sbranch FROM library";

        System.out.println("SQL Statement: " + strSelect);

        ResultSet rst = st.executeQuery(strSelect);

        // Step 5: Display records
        System.out.println("\nThe Records are:\n");

        int rowCount = 0;

        while (rst.next()) {
            int sid = rst.getInt("sid");
            String sname = rst.getString("sname");
            String sbranch = rst.getString("sbranch");

            System.out.println(sid + "\t" + sname + "\t" + sbranch);
            rowCount++;
        }

        if (rowCount == 0) {
            System.out.println("No records found.");
        } else {
            System.out.println("\nTotal Records: " + rowCount);
        }

        // Step 6: Close resources
        rst.close();
        st.close();
        conn.close();

        System.out.println("Connection Closed.");
    }
}