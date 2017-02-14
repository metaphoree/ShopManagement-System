package WINDOWS;

import interface_1.PDF_CREATOR;
//import interface_1.PDF_CREATOR_FOR_STOCK;
import interface_1.Search_by_id;
//import interface_1.Search_sales_man;
import interface_1.Stock_update;

import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import com.itextpdf.text.DocumentException;

public class SALES_MAN_WINDOWS_2 extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String st;
	public static String id_public;
	private JLabel space_1;
	private BufferedImage img;
	private String to_show_1;
	private String to_show_2;
	private String to_show_3;
	private String to_show_4;
	private String to_show_5;
	private String to_checking_text;
	private JLabel space_2;
	private JLabel space_3;
	private JLabel space_4;
	private JLabel space_5;
	private JLabel space_6;
	private JLabel space_7;
	private JLabel space_8;
	private JLabel space_9;
	private JLabel space_10;
	private JLabel space_11;
	private JLabel space_13;
	private JLabel space_14;
	private JLabel space_15;
	private JLabel space_16;
	private JLabel space_17;
	private JLabel space_18;
	private JLabel space_19;
	private JLabel space_20;
	private JLabel space_21;
	private JLabel space_22;
	private JLabel space_23;
	private JLabel space_24;
	private JLabel space_25;
	private JLabel space_26;
	private JLabel space_27;
	private JLabel space_28;
	private JLabel space_29;
	private JLabel space_30;
	private JLabel space_31;
	private JLabel space_32;
	private JLabel space_33;
	private JLabel space_34;
	private JLabel space_35;
	private JLabel space_36;
	private JLabel space_37;
	private JLabel space_38;
	private JLabel space_39;
	
	
	
	
	private JLabel space_54;
	private JLabel space_40;
	private JLabel space_41;
	private JLabel space_42;
	private JLabel space_43;
	private JLabel space_44;
	private JLabel space_45;
	private JLabel space_46;
//	private JLabel space_47;
//	private JLabel space_48;
//	private JLabel space_49;
//	private JLabel space_50;
//	private JLabel space_51;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//private JLabel show_total;
//	private JLabel space_40;
	//private JLabel space_41;	
	private JLabel search_product;
	private JLabel search_product_jl;
private JLabel total_jl;
	private JLabel show_total_in_jl;
	
	private JTextField search_product_t;
	private JLabel show_pro_name;
	private JLabel show_unit_price;
	private JLabel search_id;
	private JTextField search_id_t;
	private JLabel buy_product;
	private JLabel id;
	private JLabel quantity;
	private JLabel name1;
	private JLabel name2;
	private JLabel name3;
	private JLabel name4;
	private JLabel name5;
	private JLabel stock1;
	private JLabel stock2;
	private JLabel stock3;
	private JLabel stock4;
	private JLabel stock5;
	private JLabel unit_p1;
	private JLabel unit_p2;
	private JLabel unit_p3;
	private JLabel unit_p4;
	private JLabel unit_p5;
	private JLabel total1;
	private JLabel total2;
	private JLabel total3;
	private JLabel total4;
	private JLabel total5;
	
	private JLabel name_i;
	private JLabel stock_i;
	private JLabel unitp_i;
	private JLabel total_i;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private JTextField sales_pro_id1;
	private JTextField sales_pro_id2;
	private JTextField sales_pro_id3;
	private JTextField unit1;
	private JTextField unit2;
	private JTextField unit3;
	private JTextField sales_pro_id4;
	private JTextField sales_pro_id5;
	//private JTextField sales_pro_id6;
	private JTextField sales_unit4;
	private JTextField unit5;
	//private JTextField unit6;
	private JButton buy;
	private JButton generate_slip;
	private JButton back_sales;
	private JButton change_p_sales;
	private static  JPanel this1;
	private GridBagConstraints con8;
	public static Container con_sales_buy;
public SALES_MAN_WINDOWS_2() throws IOException {
	super.setLayout(new GridBagLayout());



	img=ImageIO.read(new File("sellproduct.jpg"));


	
	 name_i=new JLabel("     NAME");
	name_i.setFont(new Font("jk", Font.BOLD,20));
	 
	 stock_i=new JLabel("STOCK");
	 stock_i.setFont(new Font("jk", Font.BOLD,20));
	 unitp_i=new JLabel("UNIT PRICE");
	 unitp_i. setFont(new Font("jk", Font.BOLD,20));
 total_i=new JLabel("  TOTAL");	
 total_i.setFont(new Font("jk", Font.BOLD,20));
	
	
	
	
	
	
	to_checking_text=" ";
	 to_show_1=" ";
	 to_show_2=" ";
	to_show_3=" ";
	 to_show_4=" ";
	 to_show_5=" ";
	
	
	
	
	
	
	
	
	
	st="";
	 this1=new JPanel(new GridBagLayout());
	 con8=new GridBagConstraints();
	 //con_sales_buy=new Container();
	space_1=new JLabel(" ");
	 space_2=new JLabel(" ");
space_3=new JLabel(" ");
	 space_4=new JLabel(" ");
	 space_5=new JLabel(" ");
	 space_6=new JLabel(" ");
	 space_7=new JLabel(" ");
	 space_18=new JLabel(" ");
	 space_8=new JLabel(" ");
space_9=new JLabel(" ");
space_10=new JLabel(" ");
space_13=new JLabel(" ");
space_11=new JLabel(" ");
space_14=new JLabel(" ");
space_15=new JLabel(" ");
space_16=new JLabel("");
space_17=new JLabel(" ");
space_19=new JLabel(" ");
space_20=new JLabel(" ");
space_21=new JLabel(" ");
space_22=new JLabel(" ");
space_23=new JLabel(" ");
space_24=new JLabel(" ");
space_25=new JLabel(" ");
space_26=new JLabel(" ");
space_27=new JLabel(" ");
space_28=new JLabel(" ");
space_29=new JLabel(" ");
space_30=new JLabel(" ");
space_33=new JLabel(" ");
space_31=new JLabel(" ");
space_34=new JLabel(" ");
space_35=new JLabel(" ");
space_54=new JLabel(" ");
space_36=new JLabel("");
space_38=new JLabel(" ");
space_37=new JLabel(" ");
space_39=new JLabel(" ");
space_40=new JLabel(" ");
space_41=new JLabel(" ");
space_42=new JLabel(" ");
space_43=new JLabel(" ");
space_44=new JLabel(" ");
space_45=new JLabel(" ");
space_46=new JLabel(" ");
//space_47=new JLabel(" ");
//space_48=new JLabel(" ");
//space_50=new JLabel("");
//space_49=new JLabel(" ");
//space_39=new JLabel(" ");
//space_40=new JLabel(" ");
//space_41=new JLabel(" ");

 search_product=new JLabel("SEARCH PRODUCT");
 search_product_jl=new JLabel("PRODUCT ID:");
 search_product_t=new JTextField(10);
 show_pro_name=new JLabel  ("*******");
 show_unit_price=new JLabel("*******");
 search_id=new JLabel("UNIT");
 search_id_t=new JTextField(10);
 // show_total = new JLabel("");
 buy_product=new JLabel("INSERT PRODUCT ID TO BUY");
 id=new JLabel("PRODUCT ID");
id.setFont(new  Font("jk", Font.BOLD , 20));
 
 quantity=new JLabel("QUANTITY");
 quantity.setFont(new  Font("jk", Font.BOLD , 20));
 
 
 
 
 
 sales_pro_id1=new JTextField(st,10);
 //sales_pro_id1.set;
 sales_pro_id1.setFont(new  Font("jk", Font.BOLD , 20));
 sales_pro_id2=new JTextField(st,10);
 sales_pro_id2.setFont(new  Font("jk", Font.BOLD , 20));
 sales_pro_id3=new JTextField(st,10);
 sales_pro_id3.setFont(new  Font("jk", Font.BOLD , 20));
 unit1=new JTextField(10);
 unit1.setFont(new  Font("jk", Font.BOLD , 20));
 unit2=new JTextField(10);
 unit2.setFont(new  Font("jk", Font.BOLD , 20));
 unit3=new JTextField(10);
 unit3.setFont(new  Font("jk", Font.BOLD , 20));
 sales_pro_id4=new JTextField(st,10);
 sales_pro_id4.setFont(new  Font("jk", Font.BOLD , 20));
 sales_pro_id5=new JTextField(st,10);
 sales_pro_id5.setFont(new  Font("jk", Font.BOLD , 20));
 //sales_pro_id6=new JTextField(10);
 sales_unit4=new JTextField(10);
 sales_unit4.setFont(new  Font("jk", Font.BOLD , 20));
 unit5=new JTextField(10);
 unit5.setFont(new  Font("jk", Font.BOLD , 20));
 //unit6=new JTextField(10);
 buy=new JButton("SELL PRODUCT");
 buy.setFont(new  Font("jk", Font.BOLD , 20));
 generate_slip=new JButton("CASH MEMO");
 generate_slip.setFont(new  Font("jk", Font.BOLD , 20));
 back_sales=new JButton("LOG OUT");
 back_sales.setFont(new  Font("jk", Font.BOLD , 20));
 change_p_sales=new JButton("CHANGE PASSWORD");
 change_p_sales.setFont(new  Font("jk", Font.BOLD , 20));
 total_jl=new JLabel("TOTAL:");
 total_jl.setFont(new  Font("jk", Font.BOLD , 20));
 show_total_in_jl=new JLabel("");
 show_total_in_jl.setFont(new  Font("jk", Font.BOLD , 20));
 
 
 
 
 con8.fill=GridBagConstraints.BOTH;
// con8.weightx=1;
// con8.weighty=1;
 
	 name1=new JLabel(" ");
	 name1.setFont(new  Font("jk", Font.BOLD , 20));
	 name2=new JLabel(" ");
	 name2.setFont(new  Font("jk", Font.BOLD , 20));
	 name3=new JLabel(" ");
	 name3.setFont(new  Font("jk", Font.BOLD , 20));
 name4=new JLabel(" ");
 name4.setFont(new  Font("jk", Font.BOLD , 20));
	 name5=new JLabel(" ");
	 name5.setFont(new  Font("jk", Font.BOLD , 20));
	 stock1=new JLabel(" ");
	 stock1. setFont(new  Font("jk", Font.BOLD , 20));
	 stock2=new JLabel(" ");
	 stock2.setFont(new  Font("jk", Font.BOLD , 20));
	 stock3=new JLabel(" ");
	 stock3.setFont(new  Font("jk", Font.BOLD , 20));
	 stock4=new JLabel(" ");
	 stock4.setFont(new  Font("jk", Font.BOLD , 20));
	 stock5=new JLabel(" ");
	 stock5.setFont(new  Font("jk", Font.BOLD , 20));
	 unit_p1=new JLabel(" ");
	 unit_p1.setFont(new  Font("jk", Font.BOLD , 20));
	 unit_p2=new JLabel(" ");
	 unit_p2.setFont(new  Font("jk", Font.BOLD , 20));
	 unit_p3=new JLabel(" ");
	 unit_p3.setFont(new  Font("jk", Font.BOLD , 20));
	 unit_p4=new JLabel(" ");
	 unit_p4.setFont(new  Font("jk", Font.BOLD , 20));
	 unit_p5=new JLabel(" ");
	 unit_p5.setFont(new  Font("jk", Font.BOLD , 20));
	 total1=new JLabel(" ");
	 total1.setFont(new  Font("jk", Font.BOLD , 20));
 total2=new JLabel(" ");
 total2.setFont(new  Font("jk", Font.BOLD , 20));
	 total3=new JLabel(" ");
	 total3.setFont(new  Font("jk", Font.BOLD , 20));
	 total4=new JLabel(" ");
	 total4.setFont(new  Font("jk", Font.BOLD , 20));
	 total5=new JLabel(" ");
	 total5.setFont(new  Font("jk", Font.BOLD , 20));
 
 
 
 
 
 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
// 
// GET_PANEL.addComponent1(this,search_product , 0,0, 1,1,con8);
//GET_PANEL.addComponent1(this, space_1, 1,0,1,1,con8);
//GET_PANEL.addComponent1(this,space_2,2,0,1,1, con8);
//GET_PANEL.addComponent1(this,search_product_jl,1,1,1,1, con8);
//GET_PANEL.addComponent1(this,search_product_t,1,2,1,1, con8);
//GET_PANEL.addComponent1(this, space_3, 2,0,1,1,con8);
//GET_PANEL.addComponent1(this,space_4,3,0,1,1, con8);
//GET_PANEL.addComponent1(this, show_pro_name,1,3,1,1, con8);
//GET_PANEL.addComponent1(this, show_unit_price,1,4,1,1, con8);
//
//GET_PANEL.addComponent1(this, space_5, 4,0,1,1,con8);
//GET_PANEL.addComponent1(this,space_6,4,0,1,1, con8);
//GET_PANEL.addComponent1(this,  search_id,5,1,1,1, con8);
//GET_PANEL.addComponent1(this, search_id_t,5,2,1,1, con8);
//GET_PANEL.addComponent1(this, total_jl,5,3,1,1, con8);
//GET_PANEL.addComponent1(this,  show_total_in_jl,5,4,1,1, con8);
//GET_PANEL.addComponent1(this,show_total,5,3,1,1, con8);
//GET_PANEL.addComponent1(this, space_7, 6,0,1,1,con8);
//GET_PANEL.addComponent1(this,space_8,7,0,1,1, con8);
//GET_PANEL.addComponent1(this,buy_product,8,1,1,1, con8);
//GET_PANEL.addComponent1(this, space_9, 9,0,1,1,con8);
//GET_PANEL.addComponent1(this,space_10,10,0,1,1, con8);
GET_PANEL.addComponent1(this, id,1,1,1,1, con8);
GET_PANEL.addComponent1(this,quantity ,1,7,1,1, con8);

GET_PANEL.addComponent1(this, name_i,1,3,1,1, con8);
GET_PANEL.addComponent1(this,unitp_i,1,9,1,1, con8);
GET_PANEL.addComponent1(this, stock_i,1,5,1,1, con8);
GET_PANEL.addComponent1(this,total_i ,1,10,1,1, con8);






GET_PANEL.addComponent1(this, space_11, 2,0,1,1,con8);
GET_PANEL.addComponent1(this,space_13,3,0,1,1, con8);



GET_PANEL.addComponent1(this,sales_pro_id1,4,1,1,1, con8);
GET_PANEL.addComponent1(this,space_27,4,2,1,1, con8);
GET_PANEL.addComponent1(this,name1,4,3,1,1, con8);
GET_PANEL.addComponent1(this,space_28,4,4,1,1, con8);
GET_PANEL.addComponent1(this,stock1,4,5,1,1, con8);
GET_PANEL.addComponent1(this,space_29,4,6,1,1, con8);
GET_PANEL.addComponent1(this,unit_p1,4,9,1,1, con8);
GET_PANEL.addComponent1(this,space_30,4,8,1,1, con8);
GET_PANEL.addComponent1(this,unit1,4,7,1,1, con8);
GET_PANEL.addComponent1(this,total1,4,10,1,1, con8);





GET_PANEL.addComponent1(this, space_14, 5,0,1,1,con8);
GET_PANEL.addComponent1(this,space_15,6,0,1,1, con8);

GET_PANEL.addComponent1(this, sales_pro_id2,7,1,1,1, con8);
GET_PANEL.addComponent1(this,space_31,7,2,1,1, con8);
GET_PANEL.addComponent1(this,name2,7,3,1,1, con8);
GET_PANEL.addComponent1(this,space_33,7,4,1,1, con8);
GET_PANEL.addComponent1(this,stock2,7,5,1,1, con8);
GET_PANEL.addComponent1(this,space_34,7,6,1,1, con8);
GET_PANEL.addComponent1(this,unit_p2,7,9,1,1, con8);
GET_PANEL.addComponent1(this,space_35,7,8,1,1, con8);
GET_PANEL.addComponent1(this,unit2 ,7,7,1,1, con8);
GET_PANEL.addComponent1(this,total2,7,10,1,1, con8);


















GET_PANEL.addComponent1(this, space_16, 8,0,1,1,con8);
GET_PANEL.addComponent1(this,space_17,9,0,1,1, con8);

GET_PANEL.addComponent1(this, sales_pro_id3,10,1,1,1, con8);
GET_PANEL.addComponent1(this,space_36,10,2,1,1, con8);
GET_PANEL.addComponent1(this,name3,10,3,1,1, con8);
GET_PANEL.addComponent1(this,space_37,10,4,1,1, con8);
GET_PANEL.addComponent1(this,stock3,10,5,1,1, con8);
GET_PANEL.addComponent1(this,space_38,10,6,1,1, con8);
GET_PANEL.addComponent1(this,unit_p3,10,9,1,1, con8);
GET_PANEL.addComponent1(this,space_39,10,8,1,1, con8);
//GET_PANEL.addComponent1(this,unit2 ,17,9,1,1, con8);
GET_PANEL.addComponent1(this,unit3,10,7,1,1, con8);
GET_PANEL.addComponent1(this,total3,10,10,1,1, con8);





















GET_PANEL.addComponent1(this, space_18, 11,0,1,1,con8);
GET_PANEL.addComponent1(this,space_19,12,0,1,1, con8);

GET_PANEL.addComponent1(this, sales_pro_id4,13,1,1,1, con8);

GET_PANEL.addComponent1(this,space_40,13,2,1,1, con8);
GET_PANEL.addComponent1(this,name4,13,3,1,1, con8);
GET_PANEL.addComponent1(this,space_41,13,4,1,1, con8);
GET_PANEL.addComponent1(this,stock4,13,5,1,1, con8);
GET_PANEL.addComponent1(this,space_42,13,6,1,1, con8);
GET_PANEL.addComponent1(this,unit_p4,13,9,1,1, con8);
GET_PANEL.addComponent1(this,space_43,13,8,1,1, con8);
//GET_PANEL.addComponent1(this,s  ,17,9,1,1, con8);
GET_PANEL.addComponent1(this, sales_unit4, 13,7,1,1,con8);
GET_PANEL.addComponent1(this,total4,13,10,1,1, con8);



//GET_PANEL.addComponent1(this, sales_unit4, 14,8,1,1,con8);









GET_PANEL.addComponent1(this, space_20, 14,0,1,1,con8);
GET_PANEL.addComponent1(this,space_21,15,0,1,1, con8);

GET_PANEL.addComponent1(this, sales_pro_id5, 16,1,1,1,con8);
GET_PANEL.addComponent1(this,space_54,16,2,1,1, con8);
GET_PANEL.addComponent1(this,name5,16,3,1,1, con8);
GET_PANEL.addComponent1(this,space_44,16,4,1,1, con8);
GET_PANEL.addComponent1(this,stock5,16,5,1,1, con8);
GET_PANEL.addComponent1(this,space_45,16,6,1,1, con8);
GET_PANEL.addComponent1(this,unit_p5,16,9,1,1, con8);
GET_PANEL.addComponent1(this,space_46,16,8,1,1, con8);
//GET_PANEL.addComponent1(this,unit2 ,17,9,1,1, con8);
GET_PANEL.addComponent1(this, unit5,16,7,1,1, con8);
GET_PANEL.addComponent1(this,total5,16,10,1,1, con8);















GET_PANEL.addComponent1(this, space_22, 17,0,1,1,con8);
GET_PANEL.addComponent1(this,space_23,18,0,1,1, con8);
GET_PANEL.addComponent1(this, space_24, 19,0,1,1,con8);
GET_PANEL.addComponent1(this,space_25,20,0,1,1, con8);
//con8.fill=GridBagConstraints.VERTICAL;
GET_PANEL.addComponent1(this,buy,21,5,1,5, con8);
GET_PANEL.addComponent1(this,generate_slip ,21,7,1,5, con8);
GET_PANEL.addComponent1(this, back_sales, 21,1,1,5,con8);
GET_PANEL.addComponent1(this,change_p_sales, 21,3,1,5,con8);
//con8.fill=GridBagConstraints.NONE;
//GET_PANEL.addComponent1(this1,space_26,38,0,1,1, con8);


sales_pro_id1.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				if(sales_pro_id1.getText().equals(st)){
					
					name1.setText("0");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p1.setText("0");
					stock1.setText("0");
					
				}
				
				else if(!(Search_by_id.search_id(sales_pro_id1.getText()))){
					name1.setText("NOT FOUND ");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p1.setText(" ");
					stock1.setText(" ");
				}
				
				else {
			String s1=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id1.getText()));	
			name1.setText(s1);
			double s2=Search_by_id.search_unit_price(sales_pro_id1.getText());
			unit_p1.setText(Double.toString(s2));
				stock1.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id1.getText()))));
				}
			}
		}
		);
unit1.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				
		
	if(unit1.getText().equals(st)){
					
		total1.setText("0");			
					
					
				}
				
//	else 	if(search_product_t.getText().equals("")){
//		total1.setText(" ");
//		
//	}
	
				
	

	else if(sales_pro_id1.getText().equals(st)){
		
		//total3.setText("0");			
			JOptionPane.showMessageDialog(null, "ENTER ID");		
					
				}
	
	
	
	
	
	
	
	
	else{
				
				double u=Search_by_id.search_unit_price(sales_pro_id1.getText());
			double g=Double.parseDouble(unit1.getText());
			double j=u*g;
			total1.setText(Double.toString(j));
			
	}
	
	}
		}
		);		
			





sales_pro_id2.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				if(sales_pro_id2.getText().equals(st)){
					
					name2.setText("0");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p2.setText("0");
					stock2.setText("0");
					
				}
				
				else if(!(Search_by_id.search_id(sales_pro_id2.getText()))){
					name2.setText("NOT FOUND ");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p2.setText("");
					stock2.setText(" ");
				}
				
				else {
			String s1=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id2.getText()));	
			name2.setText(s1);
			double s2=Search_by_id.search_unit_price(sales_pro_id2.getText());
			unit_p2.setText(Double.toString(s2));
				stock2.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id2.getText()))));
				}
			}
		}
		);
unit2.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				
		
	if(unit2.getText().equals(st)){
					
		total2.setText("0");			
					
					
				}
				
//	else 	if(search_product_t.getText().equals("")){
//		total1.setText(" ");
//		
//	}

	else if(sales_pro_id2.getText().equals(st)){
		
		//total3.setText("0");			
			JOptionPane.showMessageDialog(null, "ENTER ID");		
					
				}
				
	else{
				
				double u=Search_by_id.search_unit_price(sales_pro_id2.getText());
			double g=Double.parseDouble(unit2.getText());
			double j=u*g;
			total2.setText(Double.toString(j));
			
	}
	
	}
		}
		);		
			





sales_pro_id3.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				if(sales_pro_id3.getText().equals(st)){
					
					name3.setText("0");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p3.setText("0");
					stock3.setText("0");
					
				}
				
				
				
				
				
				
				
				
				
				
				else if(!(Search_by_id.search_id(sales_pro_id3.getText()))){
					name3.setText("NOT FOUND ");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p3.setText("");
					stock3.setText(" ");
				}
				
				else {
			String s1=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id3.getText()));	
			name3.setText(s1);
			double s2=Search_by_id.search_unit_price(sales_pro_id3.getText());
			unit_p3.setText(Double.toString(s2));
				stock3.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id3.getText()))));
				}
			}
		}
		);
unit3.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				
		
	if(unit3.getText().equals(st)){
					
		total3.setText("0");			
					
					
				}

	
	
	
	else if(sales_pro_id3.getText().equals(st)){
		
		//total3.setText("0");			
			JOptionPane.showMessageDialog(null, "ENTER ID");		
					
				}
	
	
	
	
	
				
//	else 	if(search_product_t.getText().equals("")){
//		total1.setText(" ");
//		
//	}
	
				
	else{
				
				double u=Search_by_id.search_unit_price(sales_pro_id3.getText());
			double g=Double.parseDouble(unit3.getText());
			double j=u*g;
			total3.setText(Double.toString(j));
			
	}
	
	}
		}
		);		
			


sales_pro_id4.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				if(sales_pro_id4.getText().equals(st)){
					
					name4.setText("0");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p4.setText("0");
					stock4.setText("0");
					
				}
				
				else if(!(Search_by_id.search_id(sales_pro_id4.getText()))){
					name4.setText("NOT FOUND ");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p4.setText(" ");
					stock4.setText("");
				}
				
				else {
			String s1=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id4.getText()));	
			name4.setText(s1);
			double s2=Search_by_id.search_unit_price(sales_pro_id4.getText());
			unit_p4.setText(Double.toString(s2));
				stock4.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id4.getText()))));
				}
			}
		}
		);
sales_unit4.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				
		
	if(sales_unit4.getText().equals(st)){
					
		total4.setText("0");			
					
					
				}
				
//	else 	if(search_product_t.getText().equals("")){
//		total1.setText(" ");
//		
//	}
	

	else if(sales_pro_id4.getText().equals(st)){
		
		//total3.setText("0");			
			JOptionPane.showMessageDialog(null, "ENTER ID");		
					
				}			
	else{
				
				double u=Search_by_id.search_unit_price(sales_pro_id4.getText());
			double g=Double.parseDouble(sales_unit4.getText());
			double j=u*g;
			total4.setText(Double.toString(j));
			
	}
	
	}
		}
		);		
			

sales_pro_id5.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				if(sales_pro_id5.getText().equals(st)){
					
					name5.setText("0");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p5.setText("0");
					stock5.setText("0");
					
				}
				
				else if(!(Search_by_id.search_id(sales_pro_id5.getText()))){
					name5.setText("NOT FOUND ");
					//double s2=Search_by_id.search_unit_price(search_product_t.getText());
					unit_p5.setText(" ");
					stock5.setText(" ");
				}
				
				else {
			String s1=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id5.getText()));	
			name5.setText(s1);
			double s2=Search_by_id.search_unit_price(sales_pro_id5.getText());
			unit_p5.setText(Double.toString(s2));
				stock5.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id5.getText()))));
				}
			}
		}
		);
unit5.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				
		
	if(unit5.getText().equals(st)){
					
		total5.setText("0");			
					
					
				}
	
	
	

	else if(sales_pro_id5.getText().equals(st)){
		
		//total3.setText("0");			
			JOptionPane.showMessageDialog(null, "ENTER ID");		
					
				}
	
	
	
				
//	else 	if(search_product_t.getText().equals("")){
//		total1.setText(" ");
//		
//	}
	
				
	else{
				
				double u=Search_by_id.search_unit_price(sales_pro_id5.getText());
			double g=Double.parseDouble(unit5.getText());
			double j=u*g;
			total5.setText(Double.toString(j));
			
	}
	
	}
		}
		);		
			


















buy.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				
				if(sales_pro_id1.getText().equals(st)&&sales_pro_id2.getText().equals(st)&&sales_pro_id3.getText().equals(st)&&sales_pro_id4.getText().equals(st)&&sales_pro_id5.getText().equals(st)){
				
				
				JOptionPane.showMessageDialog(null,"ID REQUIRED");
				to_show_1="TRY AGAIN PLEASE";
				}
				
				
				
				
				
				
				
				
				
				
				
				
				if(!(sales_pro_id1.getText().equals(st))){
					if(Search_by_id.search_id(sales_pro_id1.getText())){
						if(Stock_update.get_stock(Integer.parseInt(sales_pro_id1.getText()))>0){
						
						try {
	Stock_update.stock_update(Integer.parseInt(sales_pro_id1.getText()),Stock_update.get_stock(Integer.parseInt(sales_pro_id1.getText()))-Integer.parseInt(unit1.getText()) );
} catch (NumberFormatException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
String s1="NAME:"+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id1.getText()));				
String s2="UNIT PRICE:"+Double.toString(Search_by_id.search_unit_price(sales_pro_id1.getText()));
double u=Search_by_id.search_unit_price(sales_pro_id1.getText());
int g=Integer.parseInt(unit1.getText());
double j=u*g;
String s3="TOTAL:"+Double.toString(j);
to_show_1=s1+"\n"+s2+"\n"+s3;}
						
						else{
							//t//o_show_1="PRODUCT OUT OF STOCK";
							to_show_1="PRODUCT   "+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id1.getText())) +"   OUT OF STOCK";
							
						}				
						
					
					
					
					
					
					
					
					}
					else{
						to_show_1="\n"+"ID    "+	sales_pro_id1.getText()+"         NOT FOUND"+"\n";
						
					}				
					
					
					
				}
if(!(sales_pro_id2.getText().equals(st))){
	if(Search_by_id.search_id(sales_pro_id2.getText())){
		if(Stock_update.get_stock(Integer.parseInt(sales_pro_id2.getText()))>0){
	try {
		Stock_update.stock_update(Integer.parseInt(sales_pro_id2.getText()),Stock_update.get_stock(Integer.parseInt(sales_pro_id2.getText()))-Integer.parseInt(unit2.getText()) );
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}				

	String s1="NAME:"+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id2.getText()));				
String s2="UNIT PRICE:"+Double.toString(Search_by_id.search_unit_price(sales_pro_id2.getText()));
double u=Search_by_id.search_unit_price(sales_pro_id2.getText());
//double g=Double.parseDouble(unit2.getText());
int g=Integer.parseInt(unit2.getText());
double j=u*g;
String s3="TOTAL:"+Double.toString(j);
to_show_2=s1+"\n"+s2+"\n"+s3;}
		else{
			//to_show_2="PRODUCT IS OUT OF STOCK";
			to_show_2="PRODUCT  "+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id2.getText())) +"  OUT OF STOCK";
			
		
		
		}}
	else{
		to_show_2="\n"+"ID       "+	sales_pro_id2.getText()+"NOT FOUND      "+"\n";}
		
	












}
if(!(sales_pro_id3.getText().equals(st))){
	if(Search_by_id.search_id(sales_pro_id3.getText())){
		if(Stock_update.get_stock(Integer.parseInt(sales_pro_id3.getText()))>0){
	try {
		Stock_update.stock_update(Integer.parseInt(sales_pro_id3.getText()),Stock_update.get_stock(Integer.parseInt(sales_pro_id3.getText()))-Integer.parseInt(unit3.getText()) );
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
String s1="NAME:"+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id3.getText()));				
String s2="UNIT PRICE:"+Double.toString(Search_by_id.search_unit_price(sales_pro_id3.getText()));
double u=Search_by_id.search_unit_price(sales_pro_id3.getText());
//double g=Double.parseDouble(unit3.getText());
int g=Integer.parseInt(unit3.getText());
double j=u*g;
String s3="TOTAL:"+Double.toString(j);
to_show_3=s1+"\n"+s2+"\n"+s3;}
		else{
			//to_show_3="PRODUCT OUT OF STOCK";
			to_show_3="PRODUCT  "+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id3.getText())) +"   OUT OF STOCK";
			
		}	
	
	
	
	
	
	
	
	
	
	}
	
		
		
		else{
		to_show_3="\n"+"ID        "+	sales_pro_id3.getText()+"    NOT FOUND   "+"\n";
		
	}
	
	
	
	
}
if(!(sales_pro_id4.getText().equals(st))){
	if(Search_by_id.search_id(sales_pro_id4.getText())){
		if(Stock_update.get_stock(Integer.parseInt(sales_pro_id4.getText()))>0){
	try {
		Stock_update.stock_update(Integer.parseInt(sales_pro_id4.getText()),Stock_update.get_stock(Integer.parseInt(sales_pro_id4.getText()))-Integer.parseInt(sales_unit4.getText()) );
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
String s1="NAME:"+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id4.getText()));				
String s2="UNIT PRICE:"+Double.toString(Search_by_id.search_unit_price(sales_pro_id4.getText()));
double u=Search_by_id.search_unit_price(sales_pro_id4.getText());
//double g=Double.parseDouble(sales_unit4.getText());
int g=Integer.parseInt(sales_unit4.getText());
double j=u*g;
String s3="TOTAL:"+Double.toString(j);
to_show_4=s1+"\n"+s2+"\n"+s3;	}
		
		else{
			//to_show_3="PRODUCT OUT OF STOCK";
			
			to_show_4="PRODUCT  "+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id4.getText())) +"  OUT OF STOCK";
			
		
		}	
	
	
	
	
	}
	else{
		to_show_4="\n"+"ID     "+	sales_pro_id4.getText()+"     NOT FOUND"+"\n";
		
	}

	
	
}			
if(!(sales_pro_id5.getText().equals(st))){
	if(Search_by_id.search_id(sales_pro_id5.getText())){
		if(Stock_update.get_stock(Integer.parseInt(sales_pro_id5.getText()))>0){
	try {
		Stock_update.stock_update(Integer.parseInt(sales_pro_id5.getText()),Stock_update.get_stock(Integer.parseInt(sales_pro_id5.getText()))-Integer.parseInt(unit5.getText()) );
	} catch (NumberFormatException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
String s1="NAME:"+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id5.getText()));				
String s2="UNIT PRICE:"+Double.toString(Search_by_id.search_unit_price(sales_pro_id5.getText()));
double u=Search_by_id.search_unit_price(sales_pro_id5.getText());
int g=Integer.parseInt(unit5.getText());
//double g=Double.parseDouble(unit5.getText());
double j=u*g;
String s3="TOTAL:"+Double.toString(j);
to_show_5=s1+"\n"+s2+"\n"+s3;
}
		
	
	
	
	
		else{
			to_show_5="PRODUCT  "+Search_by_id.search_product_name(Integer.parseInt(sales_pro_id5.getText())) +"  OUT OF STOCK";
			
		}	
	
	
	
	}
	else{
		to_show_5="\n"+"ID     "+	sales_pro_id5.getText()+"   NOT FOUND"+"\n";
		
	}









}
			
JOptionPane.showMessageDialog(null,to_show_1+"\n"+to_show_2+"\n"+to_show_3+"\n"+to_show_4+"\n"+to_show_5);			
			
			to_show_1="";
			to_show_2="";
			to_show_3="";
			to_show_4="";
			to_show_5="";
			
			
			
			
			}
		}
		
		);			
			
generate_slip.addActionListener(
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1="",s11=" ",s12=" ",s13=" ",s14=" ";
				String s2="",s21="",s22="",s23="",s24="";
				String s3="",s31="",s32="",s33="",s34="";
				double total=0,total1=0,total2=0,total3=0,total4=0;
				double d=0,d1=0,d2=0,d3=0,d4=0;
				
				String s15="",s16=" ",s17=" ",s18=" ",s19=" ";
				String s25="",s26="",s27="",s28="",s29="";
				String s35="",s36="",s37="",s38="",s39="";
				double total5=0,total6=0,total7=0,total8=0,total9=0;
				double d5=0,d6=0,d7=0,d8=0,d9=0;
				
				
				
				
				PDF_CREATOR pdf1=null;
				
if(!(sales_pro_id1.getText().equals(st)&&sales_pro_id2.getText().equals(st)&&sales_pro_id3.getText().equals(st)&&sales_pro_id4.getText().equals(st)&&sales_pro_id5.getText().equals(st))){
	 pdf1=new PDF_CREATOR();		
//					
//					JOptionPane.showMessageDialog(null,"ID REQUIRED");
//					to_checking_text="NO ID FOUND";
					


}
				
				
				
				
				
				
				
				if(sales_pro_id1.getText().equals(st)&&sales_pro_id2.getText().equals(st)&&sales_pro_id3.getText().equals(st)&&sales_pro_id4.getText().equals(st)&&sales_pro_id5.getText().equals(st)){
					
					
					JOptionPane.showMessageDialog(null,"ID REQUIRED");
					to_checking_text="NO ID FOUND";
					}
				
				else	if(!(sales_pro_id1.getText().equals(st))){
					if(Search_by_id.search_id(sales_pro_id1.getText())){
					 s1=sales_pro_id1.getText();
					to_checking_text=s1;
					 s2=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id1.getText()));
					 d=Search_by_id.search_unit_price(sales_pro_id1.getText());
					 s3=unit1.getText();
				 total=Double.parseDouble(s3)*Search_by_id.search_unit_price(sales_pro_id1.getText());
				 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id1.getText()))<=0){
					s3="OUT OF STOCK";
				 total=0;
				 }
					
					}
					else{
						s2="NOT FOUND";
						 s1=sales_pro_id1.getText();
					}
					try {
		pdf1.addTitlePage(1,s1,s2, d,s3,total);
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
					
			
				else if(!(sales_pro_id2.getText().equals(st))){
					if(Search_by_id.search_id(sales_pro_id2.getText())){
					 s11=sales_pro_id2.getText();
					 s21=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id2.getText()));
					 d1=Search_by_id.search_unit_price(sales_pro_id2.getText());
					 s31=unit2.getText();
					 total1=Double.parseDouble(s31)*Search_by_id.search_unit_price(sales_pro_id2.getText());
					 to_checking_text=s11;
					
					 
					 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id2.getText()))<=0){
						 s31="OUT OF STOCK";
						 total1=0;
					 }	
					
					
					
					}
					else{
						s12="NOT FOUND";
						s11=sales_pro_id2.getText();
					}
					
					
					
					try {
		pdf1.addTitlePage(1,s11,s21, d1,s31,total1);
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}			
					
				}
				else if(!(sales_pro_id3.getText().equals(st))){
					if(Search_by_id.search_id(sales_pro_id3.getText())){
					 s12=sales_pro_id3.getText();
					to_checking_text=s12;
					 s22=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id3.getText()));
					 d2=Search_by_id.search_unit_price(sales_pro_id3.getText());
					 s32=unit3.getText();
					 total2=Double.parseDouble(s32)*Search_by_id.search_unit_price(sales_pro_id3.getText());
					
					 
					 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id3.getText()))<=0){
						 s32="OUT OF STOCK";
						 total2=0;
					 }	
					
					
					
					
					
					}
					else{
						s22="NOT FOUND";
						 s12=sales_pro_id3.getText();
					}
					
					
					try {
		pdf1.addTitlePage(1,s12,s22, d2,s32,total2);
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
				else if(!(sales_pro_id4.getText().equals(st))){
					if(Search_by_id.search_id(sales_pro_id4.getText())){
					 s13=sales_pro_id4.getText();
					to_checking_text=s13;
					s23=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id4.getText()));
					 d3=Search_by_id.search_unit_price(sales_pro_id4.getText());
					 s33=sales_unit4.getText();
					 total3=Double.parseDouble(s33)*Search_by_id.search_unit_price(sales_pro_id4.getText());
					
					 
					 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id4.getText()))<=0){
						 s33="OUT OF STOCK";
						 total3=0;
					 }	
					
					
					
					
					
					
					
					
					
					}
					
					else{
						s23="NOT FOUND";
						 s13=sales_pro_id4.getText();
					}
					
					
					try {
		pdf1.addTitlePage(1,s13,s23, d3,s33,total3);
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}



				else if(!(sales_pro_id5.getText().equals(st))){
					if(Search_by_id.search_id(sales_pro_id5.getText())){
					 s14=sales_pro_id5.getText();
					to_checking_text=s14;
					 s24=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id5.getText()));
				 d4=Search_by_id.search_unit_price(sales_pro_id5.getText());
					 s34=unit5.getText();
					 total4=Double.parseDouble(s34)*Search_by_id.search_unit_price(sales_pro_id5.getText());
					 
					 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id5.getText()))<=0){
						 s34="OUT OF STOCK";total4=0;
					 }	
					
					
					
					
					
					
					}
					else{
					s24="NOT FOUND";
						s14=sales_pro_id5.getText();	
					}
					try {
		pdf1.addTitlePage(1,s14,s24, d4,s34,total4);
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
				else{
					
					
				}


if((!(sales_pro_id1.getText().equals(st))) &&(!(sales_pro_id1.getText().equals(to_checking_text))) ){
	if(Search_by_id.search_id(sales_pro_id1.getText())){
	 s15=sales_pro_id1.getText();
	 s25=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id1.getText()));
	to_checking_text=s15;
	 d5=Search_by_id.search_unit_price(sales_pro_id1.getText());
	 s35=unit1.getText();
	 total5=Double.parseDouble(s35)*Search_by_id.search_unit_price(sales_pro_id1.getText());
	
	 
	 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id1.getText()))<=0){
		 s35="OUT OF STOCK";total5=0;
	 }	
	
	
	
	
	
	}
	else{
		s25="NOT FOUND";
		 s15=sales_pro_id1.getText();
	}
	
	try {
pdf1.add_table(1,s15,s25, d5,s35,total5);
} catch (DocumentException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

if((!(sales_pro_id2.getText().equals(st))) &&(!(sales_pro_id2.getText().equals(to_checking_text))) ){
	if(Search_by_id.search_id(sales_pro_id2.getText())){
	
	s16=sales_pro_id2.getText();
	 s26=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id2.getText()));
	to_checking_text=s16;
	 d6=Search_by_id.search_unit_price(sales_pro_id2.getText());
	s36=unit2.getText();
	 total6=Double.parseDouble(s36)*Search_by_id.search_unit_price(sales_pro_id2.getText());
	
	 
	 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id2.getText()))<=0){
		 s36="OUT OF STOCK";total6=0;
	 }	
	
	
	
	
	
	
	
	
	}
	else{
		s26="NOT FOUND";
		s16=sales_pro_id2.getText();
	}
	
	
	
	try {
pdf1.add_table(1,s16,s26, d6,s36,total6);
} catch (DocumentException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}	
}

if((!(sales_pro_id3.getText().equals(st))) &&(!(sales_pro_id3.getText().equals(to_checking_text))) ){
	if(Search_by_id.search_id(sales_pro_id3.getText())){
	 s17=sales_pro_id3.getText();
	 s27=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id3.getText()));
	to_checking_text=s17;
	 d7=Search_by_id.search_unit_price(sales_pro_id3.getText());
	 s37=unit3.getText();
	 total7=Double.parseDouble(s37)*Search_by_id.search_unit_price(sales_pro_id3.getText());
	
	
	 
	 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id3.getText()))<=0){
		 s37="OUT OF STOCK";total7=0;
	 }	
	
	
	
	
	
	
	
	}
	else{
		s27="NOT FOUND";
		 s17=sales_pro_id3.getText();
	}
	try {
pdf1.add_table(1,s17,s27, d7,s37,total7);
} catch (DocumentException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}	
}
if((!(sales_pro_id4.getText().equals(st))) &&(!(sales_pro_id4.getText().equals(to_checking_text))) ){
	if(Search_by_id.search_id(sales_pro_id4.getText())){
	 s18=sales_pro_id4.getText();
	 s28=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id4.getText()));
	to_checking_text=s18;
	 d8=Search_by_id.search_unit_price(sales_pro_id4.getText());
	 s38=sales_unit4.getText();
	 total8=Double.parseDouble(s38)*Search_by_id.search_unit_price(sales_pro_id4.getText());
	
	 
	 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id4.getText()))<=0){
		 s38="OUT OF STOCK";total8=0;
	 }	
	
	
	
	
	
	
	
	
	}
	else{
		s28="NOT FOUND";
		 s18=sales_pro_id4.getText();
	}
	try {
pdf1.add_table(1,s18,s28, d8,s38,total8);
} catch (DocumentException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}	
}
if((!(sales_pro_id5.getText().equals(st))) &&(!(sales_pro_id5.getText().equals(to_checking_text))) ){
	if(Search_by_id.search_id(sales_pro_id5.getText())){
	 s19=sales_pro_id5.getText();
	 s29=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id5.getText()));
	to_checking_text=s19;
	 d9=Search_by_id.search_unit_price(sales_pro_id5.getText());
	s39=unit5.getText();
 total9=Double.parseDouble(s39)*Search_by_id.search_unit_price(sales_pro_id5.getText());
 
 if(Stock_update.get_stock(Integer.parseInt(sales_pro_id5.getText()))<=0){
	 s39="OUT OF STOCK";total9=0;
 }	

	
	
	
	
	
	
	
	
	
	}
	else{
		s29="NOT FOUND";
		 s19=sales_pro_id5.getText();
	}
	
	
	
	try {
pdf1.add_table(1,s19,s29, d9,s39,total9);
} catch (DocumentException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}	
}
try {
	pdf1.add();
} catch (DocumentException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
return ;
}





try {
	
	Double total23=total+total1+total2+total3+total4+total5+total6+total7+total8+total9;
	
	pdf1.add_empty_line(2);
	
	pdf1.new_paragraph("NIT TOTAL:  "+Double.toString(total23)+"  TK ONLY.");
	pdf1.new_paragraph("PLEASE PAY YOURE BILL");
	pdf1.add_empty_line(2);
	pdf1.new_paragraph("PREPARED BY:");
	pdf1.new_paragraph(id_public);
	pdf1.add_empty_line(1);


} catch (DocumentException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}








pdf1.close1();

if (Desktop.isDesktopSupported()) {
	    try {
	    	//pr.close1();
	        File myFile = new File("D://CASH_MEMO/MEMO2.pdf");
	        Desktop.getDesktop().open(myFile);
	    } catch (IOException ex) {
	        // no application registered for PDFs
	    }
	}

to_checking_text="";




			
			
			
			
			
			
			
			
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		);			
			

change_p_sales.addActionListener(
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SALES_MAN_WINDOWS_1 nm = null;
				try {
					nm = new SALES_MAN_WINDOWS_1();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				SALES_MAN_WINDOWS_1.container_sale_1=con_sales_buy;
				setVisible(false);
				con_sales_buy.add(nm.get_pc2());
				con_sales_buy.validate();
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		);			
			
	back_sales.addActionListener(
			
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
					SALES_MAN_WINDOW jk = null;
					try {
						jk = new SALES_MAN_WINDOW();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				con_sales_buy.add(	jk.get_panel_sales());
					con_sales_buy.validate();
				}
			}
			
			
			
			
			
			
			);		
			
			
			
			
			
			
		
		
		
		
		
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		













































}

protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}






public  JPanel get_sale_panel(){
	return this;
	
}











}
