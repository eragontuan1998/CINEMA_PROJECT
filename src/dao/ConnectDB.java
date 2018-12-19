package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Developer : Hoàng Duy */
public class ConnectDB {
    private static Connection connection;
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String DB_NAME = "databaseName=CINEMA_PROJECT;"; 
    public static final String connectionUrl = "jdbc:sqlserver://localhost:1189;" + DB_NAME +";integratedSecurity=True";
                      
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(connectionUrl);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);   //
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);   //
            }
        }
        return connection;
    }

  public static void main(String[] args) throws SQLException {
        System.out.println(ConnectDB.getConnection()!=null?"Connect thanh cong!"+DB_NAME:"Connect that bai");
   }
}
