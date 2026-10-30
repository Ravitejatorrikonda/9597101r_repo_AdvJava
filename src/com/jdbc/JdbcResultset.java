package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcResultset {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/mydata9597101r";
		String user = "root";
		String password = "123456";

		String query = "select * from st";

		// stage-1
		try {
			Connection connection = DriverManager.getConnection(URL, user, password);
			// stage-2:-

			Statement st = connection.createStatement();
			// stage-3
			ResultSet rs = st.executeQuery(query);
			// stage-4

			System.out.println("ID \t name \t Marks \t Age");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				int age = rs.getInt(4);

				System.out.println(id + "\t" + name + "\t" + marks + "\t" + age);

			}

			// stage-5:-
			connection.close();
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
