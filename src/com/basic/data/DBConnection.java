package com.basic.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bookmaster","postgres","786786");
			if(con!=null) {
				System.out.println("Connection established");
			}

		}

	}

