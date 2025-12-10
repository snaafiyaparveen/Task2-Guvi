package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertEmployeeData{
public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sys";
        String user = "root";
        String password = "Hash#0987";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);

            Object[][] data = {
                    {101, "Jenny", 25, 10000},
                    {102, "Jacky", 30, 20000},
                    {103, "Joe",   20, 40000},
                    {104, "John",  40, 80000},
                    {105, "Shameer", 25, 90000}
            };

            for (Object[] row : data) {
                pst.setInt(1, (int) row[0]);
                pst.setString(2, (String) row[1]);
                pst.setInt(3, (int) row[2]);
                pst.setInt(4, (int) row[3]);
                pst.executeUpdate();
            }

            System.out.println("Data Inserted Successfully!");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


