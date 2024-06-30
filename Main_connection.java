package databaseconnectionexample;
import java.util.*;

public class Main_connection {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		Scanner sc=new Scanner(System.in);
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter id");
		s.setId(s1.nextInt());
		
		System.out.println("Enter name");
		s.setName(sc.nextLine());
		
		System.out.println("ENter address");
		s.setAddress(sc.nextLine());
		
		
		CRUDOperations c1=new  CRUDOperations();
		
		
		CRUDOperations.insertdata(s.getId(),s.getName(),s.getAddress());
		CRUDOperations.getdata();
	
		
		
		 
	}

}
