package RESTAURANT;
import javafx.scene.chart.PieChart;


import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
    private static dbConnect instance;
    private Connection connection;
    Statement stmt;
    private dbConnect() {
        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;

        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/Restaurant", "postgres",
                    "650464");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }
    }

    public static dbConnect getInstance() {
        if (dbConnect.instance == null)
            dbConnect.instance = new dbConnect();
        return dbConnect.instance;
    }
    public void SQL(String sql) {
        try {
            stmt=connection.createStatement();
           stmt.executeUpdate(sql);
            }
        catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    connection.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(connection!=null)
                    connection.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }
        }

}

