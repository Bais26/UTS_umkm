package Config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class koneksi {
public static Connection conn;

public static Connection getConnection(){
    if (conn==null) {
        try {
            String url ="jdbc:mysql://localhost/uts_22090119_B";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    return conn;
}


}