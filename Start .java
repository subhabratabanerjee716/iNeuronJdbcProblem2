package empsrc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employees table");
		System.out.println("To insert data press 1 :-");
		System.out.println("To retrieve data press 2 :- ");
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in)); 
		int n = Integer.parseInt(br.readLine());
		
		if(n==1) {
			
			// run insert method
			String name=br.readLine();
			String address=br.readLine();
			String gender=br.readLine();
			String DOB=br.readLine();
			String DOJ=br.readLine();
			String DOM=br.readLine();
			Employees e1 = new Employees(name,address,gender,DOB,DOJ,DOM);
			
			Dao.insert(e1);
			
			
		}else if(n==2) {
			
			// run select method
			
			Dao.select();
			
		}
	}

}
