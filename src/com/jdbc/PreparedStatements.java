package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class PreparedStatements {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/mydata9597101r";
		String user = "root";
		String password = "123456";
		String query="insert into st values(?, ? ,?, ?,?)";
		
		
	try {
		Connection cn=DriverManager.getConnection(url,user,password);
		PreparedStatement ps=cn.prepareStatement(query);
		
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(n<5){
		System.out.println("Enter id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter marks: ");
		int marks=Integer.parseInt(sc.nextLine());
		System.out.println("Enter age: ");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter location: ");
		String location=sc.nextLine();
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, marks);
		ps.setInt(4, age);
		ps.setString(5, location);
		int rows=ps.executeUpdate();
		System.out.println(rows);
		n++;
		}
		cn.close();
		ps.close();
		sc.close();
		}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		final String URL = "jdbc:mysql://localhost:3306/mydata9597101r";
//		String user = "root";
//		String password = "123456";
//
//		String query = "insert into student values(?,?,?,?)";
//		
//		
//		
//		 try {
//			 //stage-1:-
//		Connection connection=	DriverManager.getConnection(URL,user,password);
//		    //stage-2:-
//		   PreparedStatement ps= connection.prepareStatement(query);
//		   
//		   Scanner sc=new Scanner(System.in);
//		   
//		   System.out.println("Enter Id : ");
//		   int id=Integer.parseInt(sc.nextLine());
//		   
//		   System.out.println("Enter Name : ");
//		   String name=sc.nextLine();
//		   
//		   System.out.println("Enter marks : ");
//		   int marks=Integer.parseInt(sc.nextLine());
//		   System.out.println("Enter Age : ");
//		   
//		   int age=Integer.parseInt(sc.nextLine());
//		   
//		   
//		   ps.setInt(1, id);
//		   ps.setString(2, name);
//		   ps.setInt(3, marks);
//		   ps.setInt(4, age);
//		   
//		   
//		   
//		   
//		   
//		   //stage-3:-
//		  int rows= ps.executeUpdate();
//		  System.out.println(rows +" inserted.....");
//		  //stage-5:-
//		  connection.close();
//		  ps.close();
//		  sc.close();
//		
//		
//		
//		
//		
//		
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
