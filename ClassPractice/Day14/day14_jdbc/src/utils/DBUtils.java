package utils;

import java.sql.*;

public class DBUtils {
	private static Connection cn;
	// add a static method to open db connection
	public static Connection openConnection() throws ClassNotFoundException, SQLException {
		// 1. Load jdbc driver: Optional
		//Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. get database connection: DriverManager
		// Method of java.sql.DriverManager:
		// public static Connection getConnection(String dbURL, String userNmae, String
		// password) throw SQLException
		String url = "jdbc:mysql://localhost:3306/dbda23?useSSL=false&allowPublicKeyRetrieval=true";
		cn=DriverManager.getConnection(url, "root", "Acts@123");
		System.out.println("db Connection established: "+cn);
		return cn;
	}
	//close connection
	public static void closeConnection() throws SQLException {
		if(cn!=null)
			cn.close();
		System.out.println("db cn closed");
		
	}
}
