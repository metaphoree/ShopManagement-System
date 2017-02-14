package connection;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.SQLException;
public class Get_connection {
	
	
		
		private static final String USERNAME="dbuser";
		private static final String PASSWORD="dbpassword";
		private static final String MYSQL_CONN_STRING="jdbc:mysql://localhost/product";
		//private static final String MYSQL_CONN_STRING_2="jdbc:mysql://localhost/";
		
		//		private static final String HSQL_CONN_STRING="jdbc:hsqldb:data/product";
		public static Connection getconnection(ENUM e) throws SQLException{
//			switch (e) {
		//	case MYSQL:
				return DriverManager.getConnection(MYSQL_CONN_STRING, USERNAME, PASSWORD);
				
	      //   case HSQLDB:
	        	//	return DriverManager.getConnection(HSQL_CONN_STRING, USERNAME, PASSWORD);		
		
			
			
			//default:
			//return null;
			
			
			
		}
			
			
			
			
		}
		
		
		
		
		
		
		

















