package Model.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
*Class which has the aim to enstablish a connection with the database
*/
public class DB {
    
    /**
    *Method used to enstablish a connection with database
    *
    *@return Connection database connection
    */
    public static Connection openConnection() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlite/gaming.db";
            Connection connection = DriverManager.getConnection(url);
            //System.out.println("Connection to SQLite has been established.");
            return connection;
        } 
         catch (SQLException e) {
            e.printStackTrace();
        } 
        catch (Exception ex){
            System.err.println("Impossibile salvare/caricare i dati! Il database non risponde!");
        }
        return null;
    }
    /*public static void main(String[]args){
        openConnection();
        Statement statement = connection.createStatement();
        ResultSet rs= statement.executeQuery("");
    }*/
}
