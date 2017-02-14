package interface_1;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import connection.ENUM;
import connection.Get_connection;

public class Search_table_01 {



public int search_n_p(String name,String password){
	
//	ResultSet rs=null;
//	Statement stmt=null;
	//String s1,s2,s3,s4,s5;
	//s5=" ";
	//int i,l;
	String sql="SELECT * FROM admin_01";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL); 
			Statement stmt=(Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet	rs=stmt.executeQuery(sql);
	)
		{
		//stmt.setInt(1,id);
		rs.beforeFirst();
		while(rs.next()){
	String s13=rs.getString("admin_name");
	String s134=rs.getString("password");		

		//	JOptionPane.showMessageDialog(null,rs.getString("password"));
			//rs.beforeFirst();	
			if(s13.equals(name) && (s134.equals(password))){
			//	JOptionPane.showMessageDialog(null,"ball");
			return 2;}
			if(!(s13.equals(name)) && (s134.equals(password))){
				return 3;
				}
			if(s13.equals(name) && !((s134.equals(password)))){
				return 4;
				}		
			}
		
		}
	catch(SQLException E){
		System.err.println(E.getMessage());		
	}
	return 5;	
}





public int search_n_p_for_sale(String name,String password){
	
//	ResultSet rs=null;
//	Statement stmt=null;
	//String s1,s2,s3,s4,s5;
	//s5=" ";
	//int i,l;
	String sql="SELECT * FROM sales_man";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL); 
			Statement stmt=(Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet	rs=stmt.executeQuery(sql);
	)
		{
		//stmt.setInt(1,id);
		rs.beforeFirst();
		while(rs.next()){
	String s13=rs.getString("sales_man_name");
	String s134=rs.getString("sales_man_password");		

		//	JOptionPane.showMessageDialog(null,rs.getString("password"));
			//rs.beforeFirst();	
			if(s13.equals(name) && (s134.equals(password))){
			//	JOptionPane.showMessageDialog(null,"ball");
			return 2;}
			if(!(s13.equals(name)) && (s134.equals(password))){
				return 3;
				}
			if(s13.equals(name) && !((s134.equals(password)))){
				return 4;
				}		
			}
		
		}
	catch(SQLException E){
		System.err.println(E.getMessage());		
	}
	return 5;	
}



















































}







//NABIL SARWAR RAHAT derby












