package interface_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ENUM;
import connection.Get_connection;

public class Search_by_name {

public static String search(String name){
	ResultSet rs=null;
	String s2,s3,s4,s5;
	s5=" ";
	int i1;
	int i,l;
	String sql="SELECT * FROM table_01 WHERE product_name=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
		stmt.setString(1,name);
		rs=stmt.executeQuery();
		while(rs.next()){
			
			if(rs.getString("product_name").equals(name)){
				
				i1=rs.getInt("product_id");
				i=rs.getInt("unit_price");
				l=rs.getInt("stock");
				s2=Integer.toString( i); 
				s3=Integer.toString(l);
			
			s4=String.format("PRODUCT NAME:"+Integer.toString(i1)+"\n"+"UNIT PRICE:"+s2+"\n"+"STOCK:"+s3);
			return s4;
			}
		}
		return null;
		}
	catch(SQLException E){
		System.err.println(E.getMessage());		
	}
	return s5;	
}
			
			
			
public static int search_product_id_by_name(String name){
	ResultSet rs=null;
	//String s1,s2,s3,s4,s5;
	//s5=" ";
	//int i,l;
	String sql="SELECT * FROM table_01 WHERE product_name=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
		stmt.setString(1,name);
		rs=stmt.executeQuery();
		while(rs.next()){
			
			if(rs.getString("product_name").equals(name)){
				int o=rs.getInt("product_id");
			return o;
			}
		}
		return 9;
		}
	catch(SQLException E){
		System.err.println(E.getMessage());		
	}
	return 9;	
}		
		
		
		
public static double search_unit_price_by_name(String name){
	ResultSet rs=null;
	//String s1,s2,s3,s4,s5;
	//s5=" ";
	//int l;
	double i;
	String sql="SELECT * FROM table_01 WHERE product_name=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
		//int id=Integer.parseInt(id1);
		stmt.setString(1,name);
		rs=stmt.executeQuery();
		while(rs.next()){
			
			if(rs.getString("product_name").equals(name)){
				
//				s1=rs.getString("product_name");
				i=rs.getDouble("unit_price");
			//	l=rs.getInt("stock");
				//s2=Integer.toString( i); 
				//s3=Integer.toString(l);
			
			//s4=String.format("PRODUCT NAME:"+s1+"\n"+"UNIT PRICE:"+s2+"\n"+"STOCK:"+s3);
			return i;
			}
		}
		return 0;
		}
	catch(SQLException E){
	
		System.err.println(E.getMessage());		
	}
	
	return 0;	
}

	

	
public static int get_stock_by_name(String name){
	
	String sql="SELECT * FROM table_01 WHERE product_name=?";
	ResultSet rs=null;
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=(PreparedStatement) conn.prepareStatement(sql);)
		{
		stmt.setString(1,name);
		rs=stmt.executeQuery();	
	while(rs.next()){
	if(rs.getString("product_name").equals(name)){
		return rs.getInt("stock");
		}
	}}
	catch(SQLException E){
		System.err.println(E.getMessage());
	}
	return 0;
		}
	
	
	
public static String get_date_by_name(String name){
	
	String sql="SELECT * FROM table_01 WHERE product_name=?";
	ResultSet rs=null;
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=(PreparedStatement) conn.prepareStatement(sql);)
		{
		stmt.setString(1,name);
		rs=stmt.executeQuery();	
	while(rs.next()){
	if(rs.getString("product_name").equals(name)){
		return rs.getString("date");
		}
	}}
	catch(SQLException E){
		System.err.println(E.getMessage());
	}
	return null;
		}
	
	






public static boolean search_name(String name){
	ResultSet rs=null;
	//String s1,s2,s3,s4,s5;
	//s5=" ";
	//int l;
	//double i;
	String sql="SELECT * FROM table_01 WHERE product_name=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
	//	int id=Integer.parseInt(id1);
		stmt.setString(1,name);
		rs=stmt.executeQuery();
		while(rs.next()){
			
			if(rs.getString("product_name").equals(name)){

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
