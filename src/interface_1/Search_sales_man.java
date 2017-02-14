package interface_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ENUM;
import connection.Get_connection;

public class Search_sales_man {

	public static boolean search_id(String id1){
		ResultSet rs=null;
		//String s1,s2,s3,s4,s5;
		//s5=" ";
		//int l;
		//double i;
		String sql="SELECT * FROM sales_man WHERE sales_man_id=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			int id=Integer.parseInt(id1);
			stmt.setInt(1,id);
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getInt("sales_man_id")==id){

				return true;
				}
			}
			return false;
			}
		catch(SQLException E){
			System.err.println(E.getMessage());		
		}
		return false;	
	}
		


	public static boolean search_name(String name){
		ResultSet rs=null;
		//String s1,s2,s3,s4,s5;
		//s5=" ";
		//int l;
		//double i;
		String sql="SELECT * FROM sales_man WHERE sales_man_name=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			//int id=Integer.parseInt(id1);
			stmt.setString(1,name);
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getString("sales_man_name").equals(name)){

				return true;
				}
			}
			return false;
			}
		catch(SQLException E){
			System.err.println(E.getMessage());		
		}
		return false;	
	}
		

	public static boolean search_password(String password){
		ResultSet rs=null;
		//String s1,s2,s3,s4,s5;
		//s5=" ";
		//int l;
		//double i;
		String sql="SELECT * FROM sales_man WHERE sales_man_password=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			//int id=Integer.parseInt(id1);
			stmt.setString(1,password);
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getString("sales_man_password").equals(password)){

				return true;
				}
			}
			return false;
			}
		catch(SQLException E){
			System.err.println(E.getMessage());		
		}
		return false;	
	}






	public static boolean search_password_by_name(String name,String old_p){
		ResultSet rs=null;
		//String s1,s2,s3,s4,s5;
		//s5=" ";
		//int l;
		//double i;
		String sql="SELECT * FROM sales_man WHERE sales_man_name=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			//int id=Integer.parseInt(id1);
			stmt.setString(1,name);
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getString("sales_man_password").equals(old_p)){

				return true;
				}
			}
			return false;
			}
		catch(SQLException E){
			System.err.println(E.getMessage());		
		}
		return false;	
	}
	public static boolean search_date(String date){
		ResultSet rs=null;
		//String s1,s2,s3,s4,s5;
		//s5=" ";
		//int l;
		//double i;
		String sql="SELECT * FROM table_01 WHERE date=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			//int id=Integer.parseInt(id1);
			stmt.setString(1,date);
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getString("date").equals(date)){

				return true;
				}
			}
			return false;
			}
		catch(SQLException E){
			System.err.println(E.getMessage());		
		}
		return false;	
	}




}
