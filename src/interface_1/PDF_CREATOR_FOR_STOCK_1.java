package interface_1;

//package interface_1;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

//import com.itextpdf.text.Anchor;
//import com.itextpdf.text.BadElementException;
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
//import com.itextpdf.text.List;
//import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
//import com.itextpdf.text.Rectangle;
//import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Font;
import com.mysql.jdbc.Statement;

import connection.ENUM;
import connection.Get_connection;

public class PDF_CREATOR_FOR_STOCK_1 {
	private static String FILE1 = "D:/CASH_MEMO/SEARCH_NEWS.pdf";
	  private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
	      Font.BOLD);
	 // private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
	   //   Font.NORMAL, BaseColor.RED);
	  //p/rivate static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
	    //  Font.BOLD);
	  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
	      Font.BOLD);
	  public static Document document13;
	  private static   PdfPCell c113; 
	  private static PdfPTable table13;
	  //private static PdfPTable table123;
	  public PDF_CREATOR_FOR_STOCK_1() {
		// TODO Auto-generated constructor stub
	
	   {


		try {
			   document13=new Document();
			   
		      PdfWriter.getInstance(document13, new FileOutputStream(FILE1));
			   
		      document13.open();
		      addMetaData();
		      //addTitlePage(document,n,product_id,name,unit_price,quantity,total);
		     // addContent(document);
		    //  document.close();
		    } catch (  Exception e) {
		     // e.printStackTrace();
		    document13.newPage();
		    
		    }
//		 catch  (FileNotFoundException e) {
//		      e.printStackTrace();
//		    }
		
		
		
		
		
		
		
		
		  }}
	
	  // iText allows to add metadata to the PDF which can be viewed in your Adobe
	  // Reader
	  // under File -> Properties
	  private static void addMetaData() {
	    document13.addTitle("KUET DS");
	    document13.addSubject("SHOPPING SLIP");
	    document13.addKeywords("Java, PDF, iText");
	    document13.addAuthor("USER");
	    document13.addCreator("NABIL SARWAR");
	  }

	  public  void addTitlePage(int n,String product_id,String name,double unit_price,String quantity)
	      throws DocumentException {
	    Paragraph preface = new Paragraph();
	    // We add one empty line
	    addEmptyLine(preface, 1);
	    // Lets write a big header
	    preface.add(new Paragraph("LIST OF PRODUCTS", catFont));

	    addEmptyLine(preface, 1);
	    // Will create: Report generated by: _name, _date
	    preface.add(new Paragraph("REPORT GENERATED AT:   "  + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	        smallBold));
	    addEmptyLine(preface, 1);
	    document13.add(preface);
	    //addEmptyLine(preface, 1);
	    createTable(n,product_id,name,unit_price,quantity);
	    Paragraph preface1 = new Paragraph();
	   addEmptyLine(preface1, 1);
	    // preface1.add(new Paragraph("THANK YOU FOR SHOPPING IN KUET DS", catFont));
	    document13.add(preface1);
	   
	    
	    // Start a new page
	    //document.newPage();
	  }



	  private static void createTable(int n,String product_id,String name,double unit_price,String quantity)
	      throws DocumentException {
	     table13 = new PdfPTable(4);


	   c113 = new PdfPCell(new Phrase("PRODUCT  NAME"));
	    c113.setHorizontalAlignment(Element.ALIGN_CENTER);
    table13.addCell(c113);

	    c113 = new PdfPCell(new Phrase("PRODUCT ID"));
	    c113.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table13.addCell(c113);

	    c113 = new PdfPCell(new Phrase("UNIT PRICE"));
	    c113.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table13.addCell(c113);
	    
	    c113 = new PdfPCell(new Phrase("QUANTITY"));
	    c113.setHorizontalAlignment(Element.ALIGN_CENTER);
	    table13.addCell(c113);
	    
//	    
//	    c1 = new PdfPCell(new Phrase("TOTAL"));
//	    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//	    table.addCell(c1);
	    
	     table13.setHeaderRows(1);
for(int u=0;u<n;u++){
	    table13.addCell(product_id);
	    table13.addCell(name);
	    table13.addCell(Double.toString(unit_price));
	    table13.addCell(quantity);
//	    table1.addCell(Double.toString(total));
}
//return table;
//	    document.add(table);

	  }

public  void add_table(int n,String product_id,String name,double unit_price,String quantity) throws DocumentException{
	
	
	
	
	

	for(int u=0;u<n;u++){
	    table13.addCell(product_id);
	    table13.addCell(name);
	    table13.addCell(Double.toString(unit_price));
	    table13.addCell(quantity);
	    //table1.addCell(Double.toString(total));
}

	    //document.add(table);
}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  private static void createList(Section subCatPart) {
//	    List list = new List(true, false, 10);
//	    list.add(new ListItem("First point"));
//	    list.add(new ListItem("Second point"));
//	    list.add(new ListItem("Third point"));
//	    subCatPart.add(list);
//	  }

	  private static void addEmptyLine(Paragraph paragraph, int number) {
	    for (int i = 0; i < number; i++) {
	      paragraph.add(new Paragraph(" "));
	    }
	  }
	  
	  public void close1(){
		  document13.close();
	  }
	  
	  public  void add() throws DocumentException{
		  
		  document13.add(table13);
	  }
	  public void new_paragraph(String s) throws DocumentException{
		  
		  Paragraph preface2 = new Paragraph();
		    preface2.add(new Paragraph(s,catFont));
		//    addEmptyLine(preface2, 10);
		    document13.add(preface2);  
		  
		  
	  }
	  
	  
	  public void add_empty_line(int n) throws DocumentException{
		  Paragraph p1=new Paragraph();
		  addEmptyLine(p1, n);
		document13.add(p1);  
		  
	  }
	  public void open1(){
		  document13.open();   
		  
		  
	  }
	  public void get_row() throws DocumentException{
		  
		  String sql="SELECT * FROM table_01";
			try(
					
		      Connection conn=Get_connection.getconnection(ENUM.MYSQL);
				Statement stmt=(Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
					ResultSet rs=stmt.executeQuery(sql);
				)
				{
				//stmt.setInt(1,id);
				//rs=stmt.executeQuery();
				int i=0;
				rs.beforeFirst();
				while(rs.next()){
					++i;
					//if(rs.getInt("product_id")==id){
						
					int u=rs.getInt("product_id");
					String 	s1=rs.getString("product_name");
					double	r=rs.getDouble("unit_price");
					int l=rs.getInt("stock");
					if(i==1){
					addTitlePage(1,s1, Integer.toString(u),r,Integer.toString(l));
			}
					else{
						add_table(1,s1, Integer.toString(u),r,Integer.toString(l));
					}++i;
					
					
					//s2=Integer.toString( i); 
//						s3=Integer.toString(l);
					
					//s4=String.format("PRODUCT NAME:"+s1+"\n"+"UNIT PRICE:"+s2+"\n"+"STOCK:"+s3);
					//return s4;
					
					
				}
				//return null;
				}
			catch(SQLException E){
				System.err.println(E.getMessage());		
			}
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	} 	
