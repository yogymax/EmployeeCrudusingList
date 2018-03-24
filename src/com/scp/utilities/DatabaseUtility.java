package com.scp.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtility {
	static Connection connection;
	
	public static Connection getDatabaseConnection(){
		try {

			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/","SA","");
			if(null!=connection){
				connection = DriverManager.getConnection("","","");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}

}
