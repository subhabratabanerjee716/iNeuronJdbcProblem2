package empsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	static Connection con;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "root";
		
		String password="1234";
		
		String url="jdbc:mysql://localhost:3306/employees";
		
		con =DriverManager.getConnection(url,user,password);
		
		return con;
		
	}
	
	
}
