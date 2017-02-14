package interface_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ENUM;
import connection.Get_connection;

public class Delete_row {


public static boolean delete(String product_id) throws Exception{
	String sql="DELETE FROM table_01 WHERE product_id=? ";
	try(
			
			Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
			
	){
		
stmt.setInt(1,Integer.parseInt(product_id));		
		int value=stmt.executeUpdate();
		if(value==1){
			return true;
		}
		else{
			return false;
		}
		
	}
	catch(SQLException e){
		
		
		System.err.println(e);
		
	}
	return false;
	
	
	
	
	
	
	
	
	
	
	
}









































}
