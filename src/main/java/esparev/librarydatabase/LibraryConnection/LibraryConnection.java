package esparev.librarydatabase.LibraryConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author esparev
 */
class LibraryConnection {
	Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
		} catch (SQLException e) {
			System.out.println(e);
		}
		return connection;
	}
}
