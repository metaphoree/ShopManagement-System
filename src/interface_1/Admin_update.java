package interface_1;

import java.sql.Connection;
import java.sql.SQLException;

import connection.ENUM;
import connection.Get_connection;

public class Admin_update {
public static boolean password_update(String new_password,String old_password) throws SQLException{
		
		String sql= " UPDATE admin_01 SET  password=? WHERE password=?";

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




























}
