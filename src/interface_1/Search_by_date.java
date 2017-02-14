package interface_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itextpdf.text.DocumentException;

import connection.ENUM;
import connection.Get_connection;

public class Search_by_date {

public Search_by_date(String date) throws DocumentException {
	
	ResultSet rs=null;
	String s2,s3,s8;
	//String s5 = " ";
	int i1;
	int po=1;
	int l;
	double i;
	String sql="SELECT * FROM table_01 WHERE date=?";
	try(
			
      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
			PreparedStatement stmt=conn.prepareStatement(sql);
		)
		{
		stmt.setString(1,date);
		rs=stmt.executeQuery();
		PDF_CREATOR_FOR_STOCK_1 pdf=new PDF_CREATOR_FOR_STOCK_1();
		
		while(rs.next()){
			++po;
			if(rs.getString("date").equals(date)){
				s8=rs.getString("product_name");
						i1=rs.getInt("product_id");
				i=rs.getDouble("unit_price");
				l=rs.getInt("stock");
				s2=Integer.toString( i1); 
				s3=Integer.toString(l);
				if(po==2){
					pdf.addTitlePage(1,s2, s8, i, s3);
					}
				else{
					pdf.add_table(1,s2, s8, i, s3);
				}
			}
		}
		try {
			pdf.add();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	pdf.close1();
		}
	catch(SQLException E){
		System.err.println(E.getMessage());		
	}
	















}









}

//			s4=String.format("PRODUCT NAME:"+Integer.toString(i1)+"\n"+"UNIT PRICE:"+s2+"\n"+"STOCK:"+s3);
//			return s4;