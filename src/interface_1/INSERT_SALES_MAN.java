package interface_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import INTERFACE.GET_DATE;
import connection.ENUM;
import connection.Get_connection;

public class INSERT_SALES_MAN {

	public static boolean insert(String id,String name,String password) throws SQLException{
		 //int u=0;
			String sql="INSERT into sales_man(sales_man_id,sales_man_name,sales_man_password,date) VALUES (?,?,?,?)";
//			String sql1="SELECT * FROM table_01";
			try(
					Connection conn=Get_connection.getconnection(ENUM.MYSQL);
	java.sql.PreparedStatement stmt=(java.sql.PreparedStatement) conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//					Statement stm=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//					ResultSet rs=stm.executeQuery(sql1);
					
					){
			
//				while(rs.next()){
//					++u;
//				}
				
				//stmt.setInt(1,u);
				//Date s3=new Date(1/31/2014);
				//int o=s3.getDate();
				stmt.setInt(1,Integer.parseInt(id));
				stmt.setString(2,name);
					stmt.setString(3,password);
					
					//stmt.setInt(4,Integer.parseInt(stock1));
					stmt.setString(4,GET_DATE.current_date());
					stmt.executeUpdate();
					
					
//				if(affected==1){
//					keys=stmt.getGeneratedKeys();
//					keys.next();
//					int newkey=keys.getInt(1);
//				stmt.setInt(4,newkey);									
//					
//			
//			}
//					else{
//						System.err.println("no rows founde");
//						return false;
//					}
				
			}
			
			
			catch(SQLException e){
				System.err.println(e.getMessage());
				return false;}
//			finally{
//				
//				if(stmt != null)stmt.close();
//			}
			return true;
			
			
			
		}

	public static String search_sales_man_name(String id){
		ResultSet rs=null;
		String s1,s5;
		s5=" ";
		//int i,l;
		String sql="SELECT * FROM sales_man WHERE sales_man_id=?";
		try(
				
	      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
			)
			{
			stmt.setInt(1,Integer.parseInt(id));
			rs=stmt.executeQuery();
			while(rs.next()){
				
				if(rs.getInt("sales_man_id")==Integer.parseInt(id)){
					
					s1=rs.getString("sales_man_name");
//					i=rs.getInt("unit_price");
//					l=rs.getInt("stock");
//					s2=Integer.toString( i); 
//					s3=Integer.toString(l);
//				
//				s4=String.format("PRODUCT NAME:"+s1+"\n"+"UNIT PRICE:"+s2+"\n"+"STOCK:"+s3);
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



	public boolean delete(String id) throws Exception{
		String sql="DELETE FROM sales_man WHERE sales_man_id=? ";
		try(
				
				Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				PreparedStatement stmt=conn.prepareStatement(sql);
				
		){
			
	stmt.setInt(1,Integer.parseInt(id));		
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
