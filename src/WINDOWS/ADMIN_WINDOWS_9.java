package WINDOWS;

import interface_1.CREATE_PDF_FOR_SPECI;
//import interface_1.PDF_CREATOR;
//import interface_1.PDF_CREATOR_FOR_SPECIFIC_INFO;
import interface_1.PDF_CREATOR_FOR_STOCK;
import interface_1.Search_by_id;
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

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.itextpdf.text.DocumentException;

public class ADMIN_WINDOWS_9 extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	private static JPanel this1;
	private GridBagConstraints con9;
	private JLabel whole_info_9;
	private JLabel id_9;
	//public static Container container_9;
	public static Container my_c9;
	private JLabel speci_p_info_9;
//	private JLabel delete_8;
//	private JLabel d_id_8;
//	private JLabel d_name_8;

	private JLabel space_1;

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
	private String to_checking_text;
	private String st;
	
	
private BufferedImage img;	
	private JLabel space_17;
	private JLabel space_18;
	private JLabel space_19;
	private JLabel space_20;
	private JLabel space_21;
	private JTextField sales_pro_id1;
	private JTextField sales_pro_id2;
	private JTextField sales_pro_id3;
	private JTextField sales_pro_id4;
	private JTextField sales_pro_id5;	
	private JButton spe_info_9;
	private JButton get_info_9;
	private JButton back_9;
public ADMIN_WINDOWS_9() throws IOException {
	 
	super.setLayout(new GridBagLayout());



	img=ImageIO.read(new File("searchproduct.jpg"));

	
	
	
	
	
	
	
	
	to_checking_text="";
	 st="";
	
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
 //this1=new JPanel(new GridBagLayout());
 con9=new GridBagConstraints();
whole_info_9=new JLabel(" WHOLE STOCK INFO");
whole_info_9.setFont(new Font("r", Font.BOLD, 30));

speci_p_info_9=new JLabel("SPECIFIC  INFO");
speci_p_info_9.setFont(new Font("r", Font.BOLD, 30));
id_9=new JLabel        (" GIVE  ID:");
id_9.setFont(new Font("r", Font.BOLD, 30));
sales_pro_id1=new JTextField(10);
 sales_pro_id2=new JTextField(10);
 sales_pro_id3=new JTextField(10);
 sales_pro_id4=new JTextField(10);
 sales_pro_id5=new JTextField(10);	


  spe_info_9=new JButton("SPECIFIC STOCK");
  spe_info_9.setFont(new Font("f", Font.BOLD, 25));
	 get_info_9=new JButton("WHOLE STOCK");
	  get_info_9.setFont(new Font("f", Font.BOLD, 25));
	 back_9=new JButton("BACK");
	  back_9.setFont(new Font("f", Font.BOLD, 25));	 
	 
	 
	 con9.fill=GridBagConstraints.BOTH;
//	 con9.weightx=1;
//	 con9.weighty=1;


	 GET_PANEL.addComponent1(this,whole_info_9 , 0,0, 1,1,con9);
		GET_PANEL.addComponent1(this,space_1,1,0,1,1, con9);
		GET_PANEL.addComponent1(this,space_2,2,0,1,1, con9);
		con9.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this, get_info_9,3,0,1,1, con9);
		con9.fill=GridBagConstraints.BOTH;
		GET_PANEL.addComponent1(this, space_3,4,1,1,1, con9);
		GET_PANEL.addComponent1(this,space_4,5,0,1,1, con9);
		GET_PANEL.addComponent1(this, space_5,6,0,1,1, con9);
		GET_PANEL.addComponent1(this,space_6 ,7,0,1,1, con9);
		
		GET_PANEL.addComponent1(this,speci_p_info_9,8,0,1,1, con9);
		GET_PANEL.addComponent1(this, space_7,9,0,1,1, con9);
		GET_PANEL.addComponent1(this,space_8 ,10,0,1,1, con9);
		GET_PANEL.addComponent1(this,id_9,11,0,1,1, con9);
		GET_PANEL.addComponent1(this, space_9,12,0,1,1, con9);
		GET_PANEL.addComponent1(this,space_10 ,13,0,1,1, con9);
		con9.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this, sales_pro_id1,14,0,1,1, con9);
		GET_PANEL.addComponent1(this, space_11,15,0,1,1, con9);
		GET_PANEL.addComponent1(this, space_13 , 16,0,1,1,con9);
		GET_PANEL.addComponent1(this,sales_pro_id2,17,0,1,1, con9);
		GET_PANEL.addComponent1(this,space_14,18,0,1,1, con9);
		GET_PANEL.addComponent1(this,space_15 ,19,0,1,1, con9);
		//GET_PANEL.addComponent1(panel_8,add_8,14,1,1,1, con8);
		GET_PANEL.addComponent1(this, sales_pro_id3 , 20,0,1,1,con9);
		GET_PANEL.addComponent1(this, space_16, 14,1,1,1,con9);
		GET_PANEL.addComponent1(this,space_17,17,1,1,1, con9);
		GET_PANEL.addComponent1(this, sales_pro_id4, 14,1,1,1,con9);
		GET_PANEL.addComponent1(this,space_18 ,24,0,1,1, con9);
		GET_PANEL.addComponent1(this,space_19 ,25,1,1,1, con9);
		GET_PANEL.addComponent1(this, sales_pro_id5, 17,1,1,1,con9);
		con9.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this,space_20 ,27,0,1,1, con9);
		GET_PANEL.addComponent1(this,space_21 ,28,1,1,1, con9);
		con9.fill=GridBagConstraints.SOUTH;
				//GET_PANEL.addComponent1(panel_8,add_8,14,1,1,1, con8);
		con9.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this, back_9 ,29,1,1,1, con9);
		GET_PANEL.addComponent1(this, spe_info_9 ,29,0,1,1, con9);
		con9.fill=GridBagConstraints.NONE;
		//GET_PANEL.addComponent1(panel_4, space_6 ,8,0,1,1, con4);
		back_9.addActionListener(
				
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
						ADMIN_WINDOW_3 op = null;
						try {
							op = new ADMIN_WINDOW_3();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						JPanel p1=	op.get_panel_3();
						my_c9.add(p1);
						my_c9.validate();
						
					}
				} 
				);
	
get_info_9.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
		PDF_CREATOR_FOR_STOCK pb=new PDF_CREATOR_FOR_STOCK();
		try {
			pb.get_row();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pb.add();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
pb.close1();
  if (Desktop.isDesktopSupported()) {
	    try {
	    	//pr.close1();
	        File myFile = new File("D://CASH_MEMO/STOCK_NEWS.pdf");
	        Desktop.getDesktop().open(myFile);
	    } catch (IOException ex) {
	        // no application registered for PDFs
	    }
	}
	
			}});	
	
		
		
spe_info_9.addActionListener(
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1="",s11=" ",s12=" ",s13=" ",s14=" ";
				String s2="",s21="",s22="",s23="",s24="";
				String s3="",s31="",s32="",s33="",s34="";
				String total="",total1="",total2="",total3="",total4="";
			String d=" ",d1=" ",d2=" ",d3=" ",d4=" ";
				
				String s15="",s16=" ",s17=" ",s18=" ",s19=" ";
				String s25="",s26="",s27="",s28="",s29="";
				String s35="",s36="",s37="",s38="",s39="";
				String total5="",total6="",total7="",total8="",total9="";
				String d5="",d6="",d7="",d8="",d9="";
				
				
				
				
				
				
				
				
				
				
				CREATE_PDF_FOR_SPECI pdf1=new CREATE_PDF_FOR_SPECI();
				
				
				
				if(sales_pro_id1.getText().equals("") && sales_pro_id2.getText().equals("")&& sales_pro_id3.getText().equals("")&&sales_pro_id4.getText().equals("")&&sales_pro_id5.getText().equals("") ){
					
				
				
				JOptionPane.showMessageDialog(null,"YOU HAVE TO GIVE ATLEAST ONE ID");
				
				
				
				}
				
				
				
				
				
				
				
				
				else if(!(sales_pro_id1.getText().equals(st))){
					if(Search_by_id.search_id(sales_pro_id1.getText())){
					 s1=sales_pro_id1.getText();
					to_checking_text=s1;
					 s2=Search_by_id.search_product_name(Integer.parseInt(sales_pro_id1.getText()));
					 d=Double.toString(Search_by_id.search_unit_price(sales_pro_id1.getText()));
					 s3=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id1.getText())));
				 total=Search_by_id.get_date(Integer.parseInt(sales_pro_id1.getText()));
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
					to_checking_text=s11;
					 d1=Double.toString(Search_by_id.search_unit_price(sales_pro_id2.getText()));
					 s31=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id2.getText())));
					 total1=Search_by_id.get_date(Integer.parseInt(sales_pro_id2.getText()));
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
					 d2=Double.toString(Search_by_id.search_unit_price(sales_pro_id3.getText()));
					 s32=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id3.getText())));
					 total2=Search_by_id.get_date(Integer.parseInt(sales_pro_id3.getText()));		 
					
					
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
					 d3=Double.toString(Search_by_id.search_unit_price(sales_pro_id4.getText()));
					 s33=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id4.getText())));
					 total3=Search_by_id.get_date(Integer.parseInt(sales_pro_id4.getText()));
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
				 d4=Double.toString(Search_by_id.search_unit_price(sales_pro_id5.getText()));
				 s34=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id5.getText())));
				 total4=Search_by_id.get_date(Integer.parseInt(sales_pro_id5.getText()));
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
	 d5=Double.toString(Search_by_id.search_unit_price(sales_pro_id1.getText()));
	 s35=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id1.getText())));
	 total5=Search_by_id.get_date(Integer.parseInt(sales_pro_id1.getText()));}
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
	 d6=Double.toString(Search_by_id.search_unit_price(sales_pro_id2.getText()));
	 s36=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id2.getText())));
	 total6=Search_by_id.get_date(Integer.parseInt(sales_pro_id2.getText()));
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
	 d7=Double.toString(Search_by_id.search_unit_price(sales_pro_id3.getText()));
	 s37=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id3.getText())));
	 total7=Search_by_id.get_date(Integer.parseInt(sales_pro_id3.getText()));}
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
	 d8=Double.toString(Search_by_id.search_unit_price(sales_pro_id4.getText()));
	 s38=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id4.getText())));
	 total8=Search_by_id.get_date(Integer.parseInt(sales_pro_id4.getText()));}
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
	 d9=Double.toString(Search_by_id.search_unit_price(sales_pro_id5.getText()));
	 s39=Integer.toString(Stock_update.get_stock(Integer.parseInt(sales_pro_id5.getText())));
	 total9=Search_by_id.get_date(Integer.parseInt(sales_pro_id5.getText()));}
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
pdf1.close1();

if (Desktop.isDesktopSupported()) {
	    try {
	    	//pr.close1();
	        File myFile = new File("D:/CASH_MEMO/SPECIFIC_NEWS.pdf");
	        Desktop.getDesktop().open(myFile);
	    } catch (IOException ex) {
	        // no application registered for PDFs
	    }
	}
sales_pro_id1.setText("");
sales_pro_id2.setText("");
sales_pro_id3.setText("");
sales_pro_id4.setText("");
sales_pro_id5.setText("");





			
			
			
			
			
			
			
			
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		);			
			

		
		





















}



protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}

public JPanel get_panel9(){
	return this;
	}














}
