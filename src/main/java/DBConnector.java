import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	public final static String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public final static String DB_URL = "104.248.17.255:3306/cupcakeRecipes";
	public final static String DB_USERNAME = "transformer";
	public final static String DB_PASSWORD = "transformerpass";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection con = null;

		// load the Driver Class
		Class.forName(DB_DRIVER_CLASS);

		// create the connection now
		con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

		System.out.println("DB Connection created successfully");
		return con;
	}
}