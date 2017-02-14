package interface_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ENUM;
import connection.Get_connection;

public class Search_by_id {

public static String search(int id){
	ResultSet rs=null;
	String s1,s2,s3,s4,s5;
	s5=" ";
	int i,l;
	String sql="SELECT * FROM table_01 WHERE product_id=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
		stmt.setInt(1,id);
		rs=stmt.executeQuery();
		while(rs.next()){
			
			if(rs.getInt("product_id")==id){
				
				s1=rs.getString("product_name");
				i=rs.getInt("unit_price");
				l=rs.getInt("stock");
				s2=Integer.toString( i); 
				s3=Integer.toString(l);
			
			s4=String.format("PRODUCT NAME:"+s1+"\n"+"UNIT PRICE:"+s2+"\n"+"STOCK:"+s3);
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
			
			
			
public static String search_product_name(int id){
	ResultSet rs=null;
	String s1,s5;
	s5=" ";
	//int i,l;
	String sql="SELECT * FROM table_01 WHERE product_id=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
		stmt.setInt(1,id);
		rs=stmt.executeQuery();
		while(rs.next()){
			
			if(rs.getInt("product_id")==id){
				
				s1=rs.getString("product_name");
//				i=rs.getInt("unit_price");
//				l=rs.getInt("stock");
//				s2=Integer.toString( i); 
//				s3=Integer.toString(l);
//			
//			s4=String.format("PRODUCT NAME:"+s1+"\n"+"UNIT PRICE:"+s2+"\n"+"STOCK:"+s3);
			return s1;
			}
		}
		return s5;
		}
	catch(SQLException E){
		System.err.println(E.getMessage());		
	}
	return s5;	
}		
		
		
		
public static double search_unit_price(String id1){
	ResultSet rs=null;
	//String s1,s2,s3,s4,s5;
	//s5=" ";
	//int l;
	double i;
	String sql="SELECT * FROM table_01 WHERE product_id=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
		int id=Integer.parseInt(id1);
		stmt.setInt(1,id);
		rs=stmt.executeQuery();
		while(rs.next()){
			
			if(rs.getInt("product_id")==id){
				
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

	

	
	
	
public static String get_date(int id){
	
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
		return rs.getString("date");
		}
	}}
	catch(SQLException E){
		System.err.println(E.getMessage());
	}
	return null;
		}
	
public static boolean search_id(String id1){
	ResultSet rs=null;
	//String s1,s2,s3,s4,s5;
	//String s5=" ";
	//int l;
	//double i;
	String sql="SELECT * FROM table_01 WHERE product_id=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
		int id=Integer.parseInt(id1);
		stmt.setInt(1,id);
		rs=stmt.executeQuery();
		while(rs.next()){
			
			if(rs.getInt("product_id")==id){

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
