package com.StudentLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDao {
    public boolean insert(User user) throws ClassNotFoundException {
        Connection con = null;
        boolean result = false;
        String url = "jdbc:mysql://localhost:3306/student_login";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO Login (UserName, Password) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, user.getUserName());
            pst.setString(2, user.getPassword());

            int rowsAffected = pst.executeUpdate(); // Use executeUpdate for INSERT
            if (rowsAffected > 0) {
                result = true; // If rows were inserted, set result to true
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close(); // Close the connection
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
