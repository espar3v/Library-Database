package espar3v.librarydatabase.LibraryConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jm_es
 */
public class LibraryConnection {
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
