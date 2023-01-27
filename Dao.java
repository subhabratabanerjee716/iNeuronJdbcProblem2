package empsrc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {

	static boolean f=false;
	
	public static boolean insert(Employees e) {
		
		try {
		
		Connection c=ConnectionProvider.getConnection();
		
		Statement stmt = c.createStatement();
		
		stmt.executeUpdate("insert into employees (name,address,gender,DOB,DOJ,DOM) values('"+e.getName()+"','"+e.getAddress()+"','"+e.getGender()+"','"+e.getDOB()+"','"+e.getDOJ()+"','"+e.getDOM()+"') ;");
		
	
		f= true;

		}catch(Exception e1) {
			
			
			e1.getStackTrace();
			
		}
		
		return f;
		
		}

	public static void select() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		    Connection c=ConnectionProvider.getConnection();
			
			Statement stmt = c.createStatement();
			
			String q = "select * from students;";
			
			ResultSet r = stmt.executeQuery(q);
			
			while(r.next()) {
				
				
				int id=r.getInt(1);
				String name=r.getString(2);
				String address = r.getString(7);
				String gender = r.getString(3);
				String DOB=r.getString(4);
				String DOJ=r.getString(5);
				String DOM=r.getString(6);
				
				System.out.println("iD is :-"+id);
				System.out.println("Name is :-"+ name);
				System.out.println("Address is :- "+address);
				System.out.println("gender is :-"+gender);
				System.out.println("DOB is :-"+DOB+"DOJ is :-"+DOJ+"DOM is :-"+DOM);
				
				
			}
		
		
		
		
	} 
	
	
}
