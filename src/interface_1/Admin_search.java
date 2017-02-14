package interface_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ENUM;
import connection.Get_connection;

public class Admin_search {





	public static boolean search_name(String name){
		ResultSet rs=null;
		//String s1,s2,s3,s4,s5;
		//s5=" ";
		//int l;
		//double i;
		String sql="SELECT * FROM admin_01 WHERE admin_name=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			//int id=Integer.parseInt(id1);
			stmt.setString(1,name);
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getString("admin_name").equals(name)){

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
		String sql="SELECT * FROM password WHERE password=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			//int id=Integer.parseInt(id1);
			stmt.setString(1,password);
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getString("password").equals(password)){

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
		String sql="SELECT * FROM admin_01 WHERE admin_name=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			//int id=Integer.parseInt(id1);
			stmt.setString(1,name);
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getString("password").equals(old_p)){

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
