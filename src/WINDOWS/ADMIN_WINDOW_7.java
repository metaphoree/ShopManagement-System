package WINDOWS;

import interface_1.Search_by_date;
import interface_1.Search_by_id;
import interface_1.Search_by_name;
import interface_1.Search_sales_man;
import interface_1.Stock_update;

import java.awt.Color;
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
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import com.itextpdf.text.DocumentException;

public class ADMIN_WINDOW_7 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final String NULL = null;
	public static Container container_7;
//private static JPanel this1; 
	private GridBagConstraints con7;
	private JLabel search_7;
	private JLabel id_7;
	private JLabel name;
	private JLabel date;
	private JTextField t_id_7;
	private JTextField t_name_7;
	private JTextField t_date_7;
	private JLabel l_id_7;
	private JLabel l_unit_price_7;
	private JLabel l_stock_7;
	private JLabel l_insert_date_7;
	private JLabel m_l_id_7;
	private JLabel m_l_unit_price_7;
	private JLabel m_l_stock_7;
	private JLabel m_l_insert_date_7;
	private JLabel l_name2_7;
	private JLabel l_unit_price2_7;
	private JLabel l_stock2_7;
	private JLabel l_insert_date2_7;
	private JLabel m_l_name2_7;
	private JLabel m_l_unit_price2_7;
	private JLabel m_l_stock2_7;
	private JLabel m_l_insert_date2_7;
	private JLabel space_15;
	//private JLabel space_16;
	private JLabel space_17;
	private JLabel space_18;
	private JLabel space_19;
	
	private JLabel space_11;
	private JLabel space_12;
	private JLabel space_13;
	private JLabel space_14;
	private JLabel space_25;
	private JLabel space_51;
	//private JLabel space_52;
	//private JLabel space_53;
	//private JLabel space_54;
	//private JLabel space_55;
	private JLabel space_56;
//	private JLabel space_57;
//	private JLabel space_58;
//	private JLabel space_59;
//	private JLabel space_60;
	
	
	
	
	
	
	
	
	
	
private BufferedImage img;

	
	
	private JLabel space_26;
	//private JLabel space_20;
	private JLabel space_21;
	private JLabel space_22;
	private JLabel space_23;
	private JLabel space_24;
	private JLabel space_2;
	private JLabel space_3;
	private JLabel space_4;
	//private JLabel space_5;
	private JLabel space_6;
	private JLabel space_7;
	private JLabel space_8;
	//private JLabel space_9;
	private JLabel space_10;
	private JLabel i_format;
	private JLabel space_1;
	private JButton back_7;
	private JButton search_by_date;
public ADMIN_WINDOW_7() throws IOException{
	super.setLayout(new GridBagLayout());



	img=ImageIO.read(new File("search.jpg"));


	
	
	
	
	
	
	
	space_51=new JLabel(" ");
	 //space_52=new JLabel(" ");
	 //space_53=new JLabel(" ");
	 //space_54=new JLabel(" ");
	 //space_55=new JLabel(" ");
	 space_56=new JLabel(" ");
//	 space_57=new JLabel(" ");
//	 space_58=new JLabel(" ");
//	 space_59=new JLabel(" ");
//space_60=new JLabel(" ");
	
	
	
	
	
	
	
	
	
	
	
	search_by_date=new  JButton("SEARCH");
 
	search_by_date.setFont(new Font("s", Font.BOLD, 25));
	
	
	//this1=new JPanel(new GridBagLayout()); 
	 con7=new GridBagConstraints();
	 search_7=new JLabel(" ");

	 search_7.setFont(new Font("s", Font.BOLD, 30)); 
	 
	 
	 
	 id_7=new JLabel("  SEARCH BY ID:");
	 
	 id_7.setFont(new Font("s", Font.BOLD, 30));
	 
	 
	 name=new JLabel("SEARCH BY NAME:");
	 
	 
	 name.setFont(new Font("s", Font.BOLD, 30));
	 
	 
	 date=new JLabel("SEARCH BY DATE:");
	 
	 date.setFont(new Font("s", Font.BOLD, 30));
	 
	 
	 
	 t_id_7=new JTextField(15);
	 t_id_7.setFont(new  Font("f", Font.BOLD, 25));
	 
	 t_name_7=new JTextField(15);
	 t_name_7.setFont(new  Font("f", Font.BOLD, 25)); 
	 
	 
	 t_date_7=new JTextField(15);
	 t_date_7.setFont(new  Font("f", Font.BOLD, 25));
	 
	 
	 back_7=new JButton("BACK");
back_7.setFont(new Font("f", Font.BOLD, 25));
	 
	 space_1=new JLabel(" ");
	 space_2=new JLabel(" ");
	 space_3=new JLabel(" ");
	 space_4=new JLabel(" ");
	 //space_5=new JLabel(" ");
	 space_6=new JLabel(" ");
	 space_7=new JLabel(" ");
 space_8=new JLabel(" ");
	 //space_9=new JLabel(" ");
	 space_10=new JLabel(" ");
	 space_11=new JLabel(" ");
	 space_12=new JLabel(" ");
	 space_13=new JLabel(" ");
	 space_14=new JLabel(" ");
	 space_15=new JLabel(" ");
	// space_16=new JLabel(" ");
	 space_17=new JLabel(" ");
 space_18=new JLabel(" ");
	 space_19=new JLabel(" ");
	 //space_20=new JLabel(" ");
	 space_21=new JLabel(" ");
	 space_22=new JLabel(" ");
	 space_23=new JLabel(" ");
	 space_24=new JLabel(" ");
	 space_25=new JLabel(" ");
	 space_26=new JLabel(" ");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 l_id_7=new JLabel("ID");
	 
	 
	 l_id_7.setFont(new  Font("f", Font.BOLD, 20));
	 
	 
	 
		 l_unit_price_7=new JLabel("UNIT PRICE");
		 l_unit_price_7.setFont(new  Font("f", Font.BOLD, 20));
		 
		 l_stock_7=new JLabel("STOCK");
		 l_stock_7.setFont(new  Font("f", Font.BOLD, 20));
		 l_insert_date_7=new JLabel("             DATE ");
		 l_insert_date_7.setFont(new  Font("f", Font.BOLD, 20));
		 
		 m_l_id_7=new JLabel("0");
		 m_l_id_7.setFont(new  Font("f", Font.BOLD, 20));
		 
		 
		 m_l_unit_price_7=new JLabel("0");
		 m_l_unit_price_7.setFont(new  Font("f", Font.BOLD, 20));
		 m_l_stock_7=new JLabel("0");
		 m_l_stock_7.setFont(new  Font("f", Font.BOLD, 20));
		 
		 m_l_insert_date_7=new JLabel("0");
		m_l_insert_date_7.setFont(new  Font("f", Font.BOLD, 20));
		 
		 l_name2_7=new JLabel("NAME");
		 l_name2_7.setFont(new  Font("f", Font.BOLD, 20));
		 l_unit_price2_7=new JLabel("UNIT PRICE");
		 l_unit_price2_7.setFont(new  Font("f", Font.BOLD, 20));
		 
		 
		 l_stock2_7=new JLabel("STOCK");
	
		 l_stock2_7.setFont(new  Font("f", Font.BOLD, 20));
		 l_insert_date2_7=new JLabel("      DATE  ");
		 l_insert_date2_7.setFont(new  Font("f", Font.BOLD, 20));
		 m_l_name2_7=new JLabel("0");
		 m_l_name2_7.setFont(new  Font("f", Font.BOLD, 20));
		 
		 m_l_unit_price2_7=new JLabel("0");;
		 m_l_unit_price2_7.setFont(new  Font("f", Font.BOLD, 20));
		 
		 m_l_stock2_7=new JLabel("0");
		 m_l_stock2_7.setFont(new  Font("f", Font.BOLD, 20));
	 m_l_insert_date2_7=new JLabel("0");
	 m_l_insert_date2_7.setFont(new  Font("f", Font.BOLD, 20));
	 
	 i_format=new JLabel("DATE INPUT FORMAT:  Oct 02,2014");
i_format.setForeground(Color.RED);
	
i_format.setFont(new Font(" g", Font.BOLD, 15));

//	 i_format.setOpaque(true);
//	 i_format.setBackground(Color.RED);
	 
	 con7.fill=GridBagConstraints.BOTH;
	 con7.weightx=1;
	 con7.weighty=1;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 GET_PANEL.addComponent1(this,search_7 , 0,1, 1,1,con7);
		GET_PANEL.addComponent1(this,space_1,1,0,1,1, con7);
		GET_PANEL.addComponent1(this,space_2,2,0,1,1, con7);
		GET_PANEL.addComponent1(this, name,3,1,1,1, con7);
		GET_PANEL.addComponent1(this, t_name_7,3,2,2,1, con7);
		GET_PANEL.addComponent1(this,space_3,4,0,1,1, con7);
		GET_PANEL.addComponent1(this,space_4,5,0,1,1, con7);
	
		GET_PANEL.addComponent1(this,l_id_7,6,1,1,1,con7);
		//GET_PANEL.addComponent1(panel_7,space_5,6,1,1,1, con7);
		GET_PANEL.addComponent1(this,l_unit_price_7,6,2,1,1,con7);
		GET_PANEL.addComponent1(this,space_6,6,3,1,1, con7);
		GET_PANEL.addComponent1(this,l_stock_7,6,4,1,1,con7);
		GET_PANEL.addComponent1(this,space_7,6,5,1,1, con7);
		GET_PANEL.addComponent1(this,l_insert_date_7,6,6,1,1,con7);
		GET_PANEL.addComponent1(this,space_8,8,0,1,1, con7);
		GET_PANEL.addComponent1(this,m_l_id_7,7,1,1,1,con7);
		//GET_PANEL.addComponent1(panel_7,space_9,7,1,1,1, con7);
		GET_PANEL.addComponent1(this,m_l_unit_price_7,7,2,1,1,con7);
		GET_PANEL.addComponent1(this,space_10,7,3,1,1, con7);
		GET_PANEL.addComponent1(this,m_l_stock_7,7,4,1,1,con7);
		GET_PANEL.addComponent1(this,space_11,7,5,1,1, con7);
		GET_PANEL.addComponent1(this,m_l_insert_date_7,7,6,1,1,con7);
		

		
		
		GET_PANEL.addComponent1(this,space_12,8,0,1,1, con7);
		GET_PANEL.addComponent1(this,space_13,9,0,1,1, con7);
		GET_PANEL.addComponent1(this, id_7 , 10,1,1,1,con7);
		GET_PANEL.addComponent1(this, t_id_7  , 10,2,2,1,con7);	
		GET_PANEL.addComponent1(this,space_14,11,0,1,1, con7);
		GET_PANEL.addComponent1(this, space_15,11,0,1,1, con7);
		
		
		GET_PANEL.addComponent1(this,l_name2_7,12,1,1,1,con7);
		//GET_PANEL.addComponent1(panel_7,space_16,12,1,1,1, con7);	
		GET_PANEL.addComponent1(this,l_unit_price2_7,12,2,1,1,con7);
		GET_PANEL.addComponent1(this,space_17,12,3,1,1, con7);
		GET_PANEL.addComponent1(this,l_stock2_7,12,4,1,1,con7);
		GET_PANEL.addComponent1(this,space_18,12,5,1,1, con7);
		GET_PANEL.addComponent1(this,l_insert_date2_7,12,6,1,1,con7);
		GET_PANEL.addComponent1(this,space_19,13,0,1,1, con7);
		GET_PANEL.addComponent1(this,m_l_name2_7,14,1,1,1,con7);
		//GET_PANEL.addComponent1(panel_7,space_20,14,1,1,1, con7);
		GET_PANEL.addComponent1(this,m_l_unit_price2_7,14,2,1,1,con7);
		GET_PANEL.addComponent1(this,space_21,14,3,1,1, con7);
		GET_PANEL.addComponent1(this,m_l_stock2_7,14,4,1,1,con7);
		GET_PANEL.addComponent1(this,space_22,14,5,1,1, con7);
		GET_PANEL.addComponent1(this,m_l_insert_date2_7,14,6,1,1,con7);		
		
		
		
		
		
		
		
		
		
		GET_PANEL.addComponent1(this,space_23,15,0,1,1, con7);
		GET_PANEL.addComponent1(this, space_24,16,0,1,1, con7);
//		GET_PANEL.addComponent1(panel_7,space_23,15,0,1,1, con7);
//		GET_PANEL.addComponent1(panel_7, space_24,15,0,1,1, con7);		
		
		
		
		GET_PANEL.addComponent1(this, date ,17,1,1,1, con7);
		GET_PANEL.addComponent1(this, t_date_7 ,17,2,2,1, con7);
		GET_PANEL.addComponent1(this, search_by_date  , 17,4,1,1,con7);
	
		GET_PANEL.addComponent1(this,space_25,18,0,1,1, con7);
		GET_PANEL.addComponent1(this, space_26,19,0,1,1, con7);
		GET_PANEL.addComponent1(this, i_format  , 0,3,2,1,con7);
		con7.fill=GridBagConstraints.NONE;
		GET_PANEL.addComponent1(this, back_7  , 20,1,1,1,con7);
		con7.fill=GridBagConstraints.BOTH;

		GET_PANEL.addComponent1(this,space_51,0,0,1,1, con7);
		GET_PANEL.addComponent1(this, space_56,0,7,1,1, con7);
		
		
		
		
		
		
		
		
		
		back_7.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
		
				ADMIN_WINDOW_3 op = null;
				try {
					op = new  ADMIN_WINDOW_3();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JPanel p1=	op.get_panel_3();
				container_7.add(p1);
				container_7.validate();
				
			}
		}
		);


t_name_7.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
			
			if(Search_by_name.search_name(t_name_7.getText())){
				m_l_id_7.setText(Integer.toString(Search_by_name.search_product_id_by_name(t_name_7.getText())));
			m_l_stock_7.setText(Integer.toString(Search_by_name.get_stock_by_name(t_name_7.getText())));
m_l_unit_price_7.setText(Double.toString(Search_by_name.search_unit_price_by_name(t_name_7.getText())));
			
m_l_insert_date_7.setText(Search_by_name.get_date_by_name(t_name_7.getText()));			
			
			}
			else if(t_name_7.getText().equals("")){
				
				m_l_id_7.setText("0");
				m_l_unit_price_7.setText("0");
				m_l_stock_7.setText("0");
				m_l_insert_date_7.setText("0");		
				
				
			}
			
			
			
			
			else{
				m_l_id_7.setText("NOT FOUND");
				m_l_unit_price_7.setText("NOT FOUND");
				m_l_stock_7.setText("NOT FOUND");
				m_l_insert_date_7.setText("NOT FOUND");	
}
			
			
			
			
//m_l_id_7.setText("0");
//m_l_unit_price_7.setText("0");
//m_l_stock_7.setText("0");
//m_l_insert_date_7.setText("0");
//l_name2_7=new JLabel("NAME");
//l_unit_price2_7=new JLabel("UNIT PRICE");
//l_stock2_7=new JLabel("STOCK");
//l_insert_date2_7=new JLabel("      DATE  ");
//m_l_name2_7=new JLabel("0");
//m_l_unit_price2_7=new JLabel("0");;
//m_l_stock2_7=new JLabel("0");
//m_l_insert_date2_7=new JLabel("0");		
			
			
			
			
			
			
			
			
			}
		}
		
		
		);



t_id_7.addCaretListener(
		
		new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent arg0) {
				 if(t_id_7.getText().equals("")){
					
					m_l_name2_7.setText("0");
					m_l_unit_price2_7.setText("0");
					m_l_stock2_7.setText("0");
					m_l_insert_date2_7.setText("0");		
					
					
				}
				
				else	if(Search_by_id.search_id(t_id_7.getText())){
				try {
					m_l_name2_7.setText(Search_by_id.search_product_name((Integer.parseInt(t_id_7.getText()))));
m_l_stock2_7.setText(Integer.toString(Stock_update.get_stock(Integer.parseInt(t_id_7.getText()))));
m_l_unit_price2_7.setText(Double.toString(Search_by_id.search_unit_price(t_id_7.getText())));

m_l_insert_date2_7.setText(Search_by_id.get_date(Integer.parseInt(t_id_7.getText())));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					return;
				}
				
				
			}
				
				
				
				else{
					m_l_name2_7.setText("NOT FOUND");
					m_l_unit_price2_7.setText("NOT FOUND");
					m_l_stock2_7.setText("NOT FOUND");
					m_l_insert_date2_7.setText("NOT FOUND");	

				
				
				}
				
				
				
				
				
//				m_l_name2_7.setText("0");
//				m_l_unit_price2_7.setText("0");
//				m_l_stock2_7.setText("0");
//				m_l_insert_date2_7.setText("0");
			
			
			}
		}
		
		
		);


search_by_date.addActionListener(
		
		new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
	
			
				if(t_date_7.getText().equals("")){
					JOptionPane.showMessageDialog(null,"PLEASE ENTER DATE");
				}
				else if(!(Search_sales_man.search_date(t_date_7.getText()))){
					JOptionPane.showMessageDialog(null,"DATE NOT FOUND");
					
				}
				
				else  if(Search_sales_man.search_date(t_date_7.getText())){
				try {
						new Search_by_date(t_date_7.getText());
				} 
				catch (DocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
				if (Desktop.isDesktopSupported()) {
					    try {
					    	//pr.close1();
					        File myFile = new File("D://CASH_MEMO/SEARCH_NEWS.pdf");
					        Desktop.getDesktop().open(myFile);
					    } 
					    catch (IOException ex) {
					        // no application registered for PDFs
					    }
					    
				}
					    
					}
				
				
				
				
				
			}
		}
		
		
		);
















































}

protected void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
}











public  JPanel get_panel7(){
	
	return this; 
	
	
}





















}