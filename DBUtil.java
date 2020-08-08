/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.*;

/**
 *
 * @author rahon
 */
public class DBUtil {

    private static final String DTBUser = "root";
    private static final String DTBPsswd = "root";
    private static final String DTBCS = "jdbc:mysql://localhost:3306/?AutoReconnect=true&useSSL=false";
    private static final String DTBCS2 = "jdbc:mysql://localhost:3306/inventory_mgmt?AutoReconnect=true&useSSL=false";

    private static Connection conn = null;

    public static Connection getConnection(DBType SQLDB) throws SQLException {
        return DriverManager.getConnection(DTBCS, DTBUser, DTBPsswd);
    }

    public static Connection getConnection2(DBType SQLDB) throws SQLException {
        return DriverManager.getConnection(DTBCS2, DTBUser, DTBPsswd);
    }

    //display error message if unable to connect
    public static void showErrorMessage(SQLException e) {
        System.err.println("Error: " + e.getMessage());
        System.err.println("Error Code: " + e.getErrorCode());
    }
    

    

}
