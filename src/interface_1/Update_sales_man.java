package interface_1;

import java.sql.Connection;
import java.sql.SQLException;

import connection.ENUM;
import connection.Get_connection;

public class Update_sales_man {



public static boolean password_update(String new_password,String old_password) throws SQLException{
		
		String sql= " UPDATE sales_man SET  sales_man_password=? WHERE sales_man_password=?";

	try(
			Connection conn=Get_connection.getconnection(ENUM.MYSQL);
		java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
		stmt.setString(1,new_password);
		stmt.setString(2,old_password);
		
		
			
			int affected=stmt.executeUpdate();
			if(affected==1){
				return true;
			}
			else{
				return false;
			}
			}

	catch (SQLException e) {
		System.err.println(e.getMessage());// TODO: handle exception
	return false;
	}
		}

public static boolean password_update_single(String new_password,String id) throws SQLException{
	
	String sql= " UPDATE sales_man SET  sales_man_password=?  WHERE sales_man_id=?";

try(
		Connection conn=Get_connection.getconnection(ENUM.MYSQL);
	java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
	stmt.setString(1,new_password);
	stmt.setString(2,id);
	
	
		
		int affected=stmt.executeUpdate();
		if(affected==1){
			return true;
		}
		else{
			return false;
		}
		}

catch (SQLException e) {
	System.err.println(e.getMessage());// TODO: handle exception
return false;
}
	}
































































}
