package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		String url = "jdbc:mysql://localhost:3306/mydata9597101r";
		String user = "root";
		String password = "123456";
		String query="{call getStudents(?)}";
		
		
		try {
			//stage-1:-
		Connection connection=	DriverManager.getConnection(url,user,password);
		//stage-2:-
		      CallableStatement cs=   connection.prepareCall(query);
		      System.out.println("ENter Id : ");
		      int ids=Integer.parseInt(sc.nextLine());
		      cs.setInt(1, ids);
		      
		      //stage-3
		    ResultSet rs=  cs.executeQuery();
		    //stage-4:-
		    
		    System.out.println("ID \t name \t Age \t Marks \t Location");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				int marks = rs.getInt(4);
				String loc=rs.getString(5);

				System.out.println(id + "\t" + name + "\t" + age + "\t" + marks+ "\t"+ loc);

			}
			
			
			connection.close();
			rs.close();
			sc.close();
		
		
		
		
		
		
		
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
