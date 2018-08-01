package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	  // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/emp";
	   static final String USER = "root";
	   static final String PASS = "";
	   static Connection conn = null;
	   
	   public static Connection getConnection(){
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	      System.out.println("Connection established");
	   }
	   catch(ClassNotFoundException e){
		   e.printStackTrace();
	   }
	   catch(SQLException  e){
		   e.printStackTrace();
	   }
	   return conn;
	}
	   
	   public static void closeConnection(){
		   if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	   
}
