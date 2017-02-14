package interface_1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import connection.ENUM;
import connection.Get_connection;

public class Stock_update {

public static boolean stock_update(int id,int st) throws SQLException{
		
		String sql= " UPDATE table_01 SET  stock=? WHERE product_id=?";

	try(
			Connection conn=Get_connection.getconnection(ENUM.MYSQL);
		java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
		stmt.setInt(1,st);
		stmt.setInt(2,id);
		
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
		
		



public static int get_stock(int id){
	
	String sql="SELECT * FROM table_01 WHERE product_id=?";
	ResultSet rs=null;
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=(PreparedStatement) conn.prepareStatement(sql);)
		{
		stmt.setInt(1,id);
		rs=stmt.executeQuery();	
	while(rs.next()){
	if(rs.getInt("product_id")==id){
		return rs.getInt("stock");
		}
	}}
	catch(SQLException E){
		System.err.println(E.getMessage());
	}
	return 0;
		}
	

public static boolean id_stock_update(int old_id,int new_id) throws SQLException{
	
	String sql= " UPDATE table_01 SET  product_id=? WHERE product_id=?";

try(
		Connection conn=Get_connection.getconnection(ENUM.MYSQL);
	java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
	stmt.setInt(1,new_id);
	stmt.setInt(2,old_id);
	
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

public static boolean name_stock_update(int id,String name) throws SQLException{
	
	String sql= " UPDATE table_01 SET  product_name=?  WHERE product_id=?";

try(
		Connection conn=Get_connection.getconnection(ENUM.MYSQL);
	java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
	stmt.setString(1,name);
	stmt.setInt(2,id);
	
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



public static boolean add_stock_update(int id,int st) throws SQLException{
	
	String sql= " UPDATE table_01 SET  stock=? WHERE product_id=?";

try(
		Connection conn=Get_connection.getconnection(ENUM.MYSQL);
	java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
	stmt.setInt(1,st+get_stock(id));
	stmt.setInt(2,id);
	
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




public static boolean remove_stock_update(int id,int st) throws SQLException{
	
	String sql= " UPDATE table_01 SET  stock=? WHERE product_id=?";

try(
		Connection conn=Get_connection.getconnection(ENUM.MYSQL);
	java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
	stmt.setInt(1,get_stock(id)-st);
	stmt.setInt(2,id);
	
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




public static boolean update_unit_price(int id,String st) throws SQLException{
	
	String sql= " UPDATE table_01 SET  unit_price=? WHERE product_id=?";

try(
		Connection conn=Get_connection.getconnection(ENUM.MYSQL);
	java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
	stmt.setDouble(1,Double.parseDouble(st));
	stmt.setInt(2,id);
	
	
		
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
