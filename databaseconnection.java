package databaseconnectionexample;

//import packages
import java.sql.*;
import javax.sql.*;

public class databaseconnection {
	private static final String db_username="root";
	private static final String db_password="12345678";
	private static final String db_url="jdbc:mysql://localhost:3307/demo";
//	="jdbc:mysql://localhost:3306/bank";
	static Connection cn;
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection(db_url,db_username,db_password);
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		
		return (cn);
	}
			
	

}
