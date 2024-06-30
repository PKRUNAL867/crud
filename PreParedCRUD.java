package databaseconnectionexample;

import java.sql.*;
import javax.sql.*;

public class PreParedCRUD {

	static Connection cn;
	static PreparedStatement pst;
	public PreParedCRUD()
	{
		cn=
				databaseconnection.getConnection();
	}
	public static void insertData(){
		String squery=
				"insert into student values(?,?,?)";
	try {
		pst=cn.
				
			prepareStatement
			(squery);
		pst.setInt(1,9);
		pst.setString(2, "jiya");
		pst.setString(3, "chandoliya");
		 int r = pst.executeUpdate();
		    
		    if(r>0) {
		    	System.out.println("REcord inserted ....");
		    }
		
		}
		catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
	}
	
}
