import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils; //rs2xml.jar

public class sqlConnect {
    
    static Connection conn = null;
    
    public static Connection connectDB(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            // open file db.sqlite from current folder
            conn = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
        } 
        catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
                conn = null;
        }
        return conn;
    }
}