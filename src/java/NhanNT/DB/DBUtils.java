package NhanNT.DB;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils implements Serializable {

    public static Connection makeConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url ="jdbc:sqlserver://localhost:1433;databaseName=NhanNT_SU23";
            Connection con = DriverManager.getConnection(url, "sa", "12345");
            return con;
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
