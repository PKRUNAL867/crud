package databaseconnectionexample;

import java.sql.*;
import javax.sql.*;

public class CRUDOperations {
	static Statement st;
	Connection cn;
	public CRUDOperations()
	{
		cn=databaseconnection.getConnection();
		try {
			st=cn.createStatement();
		}catch(SQLException e)
		{
			
			e.printStackTrace();
		}
		
	}
	
	public static void insertdata(int id,String name,String address)
	{
		String iquesy=	"insert into student values('" + id + "','" + name + "','" + address+ "')";
		
		
		try {
				int  result=st.executeUpdate(iquesy);
			if(result>0) {
				System.out.print("data successfully inserted");
			}
			
		}
		
		 catch (SQLIntegrityConstraintViolationException sq) {
		    	System.out.println("please enter unique number for accno");
		    }
		
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		
	}
	public static void deletedata(int id1)
	{
		String squery="delete from student where id='"+id1+"'";
		int r;
		try {
			r = st.executeUpdate(squery);  
			if (r> 0){
				System.out.println("REcord deleted Successfully!!!");
				
			}
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
	}
	public static void updatedata(int id1)
	{
		String squery="update student set name='uma' where id=" + id1 +" ";
		
		int r;
		try {
			r = st.executeUpdate(squery);  //insert ,update,delete
			if (r> 0){
				System.out.println("REcord updated Successfully!!!");
				
			}
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
		
	}
	public static void getdata()
	{
		String squery="select *from student";
		try {
			ResultSet r=st.executeQuery(squery);
			System.out.println(" "+"id"+" "+"name"+" "+"address");
			while(r.next())
			{
				System.out.println(" "+r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
	
		}
		
	}

}
