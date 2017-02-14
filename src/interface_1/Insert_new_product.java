package interface_1;

//import insert.Data;

import java.sql.Connection;
//import java.util.Date;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import INTERFACE.GET_DATE;

import connection.ENUM;
import connection.Get_connection;


public class Insert_new_product {
	public static boolean insert(String product_id,String name,String price,String stock1) throws SQLException{
	 //int u=0;
		String sql="INSERT into table_01(product_id,product_name,unit_price,stock,date) VALUES (?,?,?,?,?)";
//		String sql1="SELECT * FROM table_01";
		try(
				Connection conn=Get_connection.getconnection(ENUM.MYSQL);
java.sql.PreparedStatement stmt=(java.sql.PreparedStatement) conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//				Statement stm=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//				ResultSet rs=stm.executeQuery(sql1);
				
				){
		
//			while(rs.next()){
//				++u;
//			}
			
			//stmt.setInt(1,u);
			//Date s3=new Date(1/31/2014);
			//int o=s3.getDate();
			stmt.setInt(1,Integer.parseInt(product_id));
			stmt.setString(2,name);
				stmt.setDouble(3,Double.parseDouble(price));
				
				stmt.setInt(4,Integer.parseInt(stock1));
				stmt.setString(5,GET_DATE.current_date());
				stmt.executeUpdate();
				
				
//			if(affected==1){
//				keys=stmt.getGeneratedKeys();
//				keys.next();
//				int newkey=keys.getInt(1);
//			stmt.setInt(4,newkey);									
//				
//		
//		}
//				else{
//					System.err.println("no rows founde");
//					return false;
//				}
			
		}
		
		
		catch(SQLException e){
			System.err.println(e.getMessage());
			return false;}
//		finally{
//			
//			if(stmt != null)stmt.close();
//		}
		return true;
		
		
		
	}















}
