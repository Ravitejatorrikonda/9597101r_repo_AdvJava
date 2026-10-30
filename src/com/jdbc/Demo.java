package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
              final String URL="jdbc:mysql://localhost:3306/mydata9597101r";
              String user="root";
              String password="123456";
              
              String query="insert into student values(103,'raju',10,50)";
//              String query="update  into student set age=18 where id=101";
//              String query="delete from student where id =101";
              try {
            	  //stage-1:-
			Connection connection=DriverManager.getConnection(URL,user,password);
				
				//stage-2
		    Statement st=connection.createStatement();
		    //stage-3:-
		               int rows=  st.executeUpdate(query);
		               System.out.println(rows+"inserted");
		      
		     //stage-5
		               connection.close();
				
				
				
				
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
              
              
	}

}
